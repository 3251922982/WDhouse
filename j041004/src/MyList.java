import java.net.PortUnreachableException;

public class MyList {
    static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;


    public void list() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;
        this.head = listNode1;
    }

    public void show() {
        ListNode cur = this.head;
        if (cur == null) {
            System.out.println("空");
            return;
        }
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int size() {
        int size = 0;
        ListNode cur = this.head;
        if (cur == null) return 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    public boolean contains(int sum) {
        boolean det = false;
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == sum) {
                det = true;
                return det;
            }
            cur = cur.next;
        }
        return det;
    }

    public void addFirst(int sum) {
        ListNode node = new ListNode(sum);
        node.next = head;
        head = node;
    }

    public void addLast(int sum) {
        ListNode node = new ListNode(sum);
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void addIndex(int index, int sum) {
        if (index < 0 || index > size()) {
            throw new indexOutOfException("链表下标越界");
        } else if (index == 0) {
            addFirst(sum);
        } else if (index == size()) {
            addLast(sum);
        } else {
            ListNode cur = findIndex(index);
            ListNode node = new ListNode(sum);
            node.next = cur.next;
            cur.next = node;
        }
    }

    public ListNode findIndex(int index) {
        ListNode cur = this.head;
        int count = 0;
        if (index == 0) {
            throw new RuntimeException();
        }
        while (count != index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    public void indexRemove(int index) {
        ListNode cur = head;
        if (cur.next == null) {
            return;
        } else if (index < 0 || index >= size()) {
            throw new indexOutOfException("链表下标越界");
        } else if (index == 0) {
            ListNode cur0 = head.next;
            head = cur0;
        } else if (index == size() - 1) {
            ListNode cur1 = findIndex(index);
            cur1.next = null;
        } else {
            ListNode cur2 = findIndex(index);
            cur2.next = cur2.next.next;
        }
    }

    //删除指定val节点
    public void keyRemove(int key) {
        if (head == null) return;

        ListNode cur = head.next;
        ListNode prev = head;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
                return;
            } else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        if (head.val == key) {
            head = head.next;
        }
    }

    //删除指定所有节点
    public void removeAllKey(int key) {
        if (head == null) return;
        ListNode cur = head.next;
        ListNode prev = head;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        if (head.val == key) {
            head = head.next;
        }

    }


    public void clear() {
        ListNode cur = head.next;
        //ListNode nextNode=cur.next;
        if (cur == null) return;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = null;
            cur = nextNode;
        }
        head = null;
    }

    //反转链表
    public ListNode reverseList() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode curN = cur.next;
            cur.next = head;
            head = cur;
            cur = curN;

        }
        return head;
    }

    //任意节点开始打印val
    public void showNode(ListNode node) {
        if(node==null){
            System.out.println("空");
        }
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public ListNode findMiddleNode() {
        //ListNode cur=head;
        ListNode fast = head;
        ListNode slow = head;
//       int length=size()/2+1;
//       for(int i=1;i<length;i++){
//           cur=cur.next;
//       }

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode deleteMiddle() {
        ListNode frontNode = head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            frontNode = slow;
            slow = slow.next;
        }
        frontNode.next = slow.next;
        return head;
    }


    public ListNode findToLastNode(int k) {
        if (k <= 0 || k > size()) return null;
        ListNode fast = head;
        ListNode slow = head;
//            int count=0;
//            while (count!=k-1){
//                fast=fast.next;
//                count++;
//                if(fast==null) return null;
//            }
        for (int i = 1; i < k; i++) {
            fast = fast.next;
            if (fast == null) return null;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode mergeTwoLists(ListNode hb) {
        ListNode ha = this.head;
        ListNode headNew = new ListNode(555);
        ListNode tmpH = headNew;
        while (ha != null && hb != null) {
            if (ha.val <= hb.val) {
                tmpH.next = ha;
                tmpH = tmpH.next;
                ha = ha.next;
            } else {
                tmpH.next = hb;
                tmpH = tmpH.next;
                hb = hb.next;
            }
        }
        if (ha != null) {
            tmpH.next = ha;
        }
        if (hb != null) {
            tmpH.next = hb;
        }
        return headNew.next;
    }


    public ListNode partition(int x) {
        ListNode cur = head;
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        if (cur == null) {
            return null;
        }
        while (cur != null) {
            if (cur.val < x) {
                if (bs == null) {
                    bs = cur;
                    be=cur;
                } else {
                    be.next = cur;
                    be = cur;
                }
            } else {
                if (as == null) {
                    as = cur;
                    ae=cur;
                }
                else {
                    be.next = cur;
                    be = cur;
                }
            }
            cur=cur.next;
        }
        be.next = as;
        if(as!=null){
            ae.next = null;
        }
        return bs == null ? as : bs;
    }


    public  boolean chkPalindrome(){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode cur=slow.next;
        while (cur!=null){
            ListNode curN=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curN;
        }

        while (head!=slow){
            if(head.val!=slow.val){
                return  false;
            }
            if(head.next==slow) return  true;
            head=head.next;
            slow=slow.next;

        }
        return  true;
    }

}
