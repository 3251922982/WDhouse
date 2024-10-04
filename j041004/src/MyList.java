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

        public void list(){
            ListNode listNode1=new ListNode(1);
            ListNode listNode2=new ListNode(2);
            ListNode listNode3=new ListNode(3);
            ListNode listNode4=new ListNode(4);

            listNode1.next=listNode2;
            listNode2.next=listNode3;
            listNode3.next=listNode4;
            listNode4.next=null;
            this.head=listNode1;
        }

        public  void  show(){
            ListNode cur=this.head;
            while(cur!=null){
                System.out.print(cur.val+" ");
                cur=cur.next;
            }
            System.out.println();
        }

        public int size(){
            int size=0;
            ListNode cur=this.head;
            while(cur!=null){
                size++;
                cur=cur.next;
            }
            return  size;
        }

    public boolean contains(int sum){
            boolean det=false;
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==sum){
                det=true;
                return det;
            }
            cur=cur.next;
        }
        return  det;
    }

    public void addFirst(int sum){
       ListNode node=new ListNode(sum);
       node.next=head;
       head=node;
    }

    public void addLast(int sum){
        ListNode node=new ListNode(sum);
        ListNode cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }

    public void addIndex(int index,int sum){
        if(index<0||index>size()){
            throw  new indexOutOfException("链表下标越界");
        }
        else if(index==0){
            addFirst(sum);
        }
        else if(index==size()){
            addLast(sum);
        }
         else {
            ListNode cur=findIndex(index);
            ListNode node=new ListNode(sum);
            node.next=cur.next;
            cur.next=node;
        }
    }

    public ListNode findIndex(int index){
        ListNode cur=this.head;
        int count=0;
        while(count!=index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }

    public void  remove(int index){
        if(index<0||index>=size()){
            throw  new indexOutOfException("链表下标越界");
        }
        else if (index==0) {
            ListNode cur0=head.next;
            head=cur0;
        }
        else if (index==size()-1) {
            ListNode cur1=findIndex(index);
            cur1.next=null;
        }
        else {
            ListNode cur2=findIndex(index);
            cur2.next=cur2.next.next;
        }
    }


}
