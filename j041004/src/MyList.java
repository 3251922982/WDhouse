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
    public  ListNode headB;


    public void initList() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(8);
        ListNode listNode6= new ListNode(9);


        ListNode listNodeA = new ListNode(2);
        ListNode listNodeB = new ListNode(6);
        ListNode listNodeC= new ListNode(10);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;
        listNode6.next = null;

        listNodeA.next=listNodeB;
        listNodeB.next=listNodeC;
        listNodeC.next=listNode5;
        this.head = listNode1;
        this.headB=listNodeA;
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

    //
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
    public int size2() {
        int size = 0;
        ListNode cur = this.headB;
        if (cur == null) return 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }


    //找元素
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

    //头插
    public void addFirst(int sum) {
        ListNode node = new ListNode(sum);
        node.next = head;
        head = node;
    }


    //尾插
    public void addLast(int sum) {
        ListNode node = new ListNode(sum);
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //指定下标添加元素
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


    //查找下标元素
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

    //删除指定下标节点
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


    //清空链表
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

    //找到中间节点
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


    //删除中间节点
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

//找到倒数第k个节点
    public ListNode findToLastNode(int k) {
        if (k <= 0 || k > size()) return null;
        ListNode fast = head;
        ListNode slow = head;
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

    //合并链表
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

//指定一个元素，大小元素分居两侧
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
            if (cur.val <= x) {
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
                    ae.next = cur;
                    ae = cur;
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


    //判断回文链表
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


    //找到共同节点
    public ListNode getIntersectionNode(){
        int size1=size();
        int size2=size2();
        int sizeMin=size1<=size2?size1:size2;
        int sizeMax=size1<=size2?size2:size1;
        ListNode cur1=size1<=size2?headB:head;
        ListNode cur2=size1<=size2?head:headB;
        while ((sizeMax-sizeMin)>0){
            cur1=cur1.next;
            sizeMax--;
        }
        showNode(cur1);
        showNode(cur2);
        while (cur2.next!=null){
            if(cur1==cur2){
                break;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        if(cur2.next!=null){
            return cur1;
        }
        else {
            return null;
        }
    }

    //判断循环链表
    public boolean judgeRing(){
        ListNode cur1=head;
        ListNode cur2=head;
        if(head==null) return  false;
        while (cur1.next!=null&&cur1!=null){
            cur1=cur1.next.next;
            cur2=cur2.next;
            if(cur1==cur2) return true;
        }
        return  false;
    }
//找到循环开始节点
    public ListNode findRingBegin(){
        ListNode cur1=head;
        ListNode cur2=head;
        if(head==null) return  null;
        while (cur1.next!=null&&cur1!=null){
            cur1=cur1.next.next;
            cur2=cur2.next;
            if(cur1==cur2) {
                ListNode cur=head;
                ListNode meet=cur1;
                while (cur!=meet){
                    cur=cur.next;
                    meet=meet.next;
                }
                return cur;
            }
        }
        return  null;
    }



}
