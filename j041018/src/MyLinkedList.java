public class MyLinkedList {
    MyLinkListNode head;
    MyLinkListNode last;
    static class MyLinkListNode{
        int var;
        MyLinkListNode next;
        MyLinkListNode prev;
        public MyLinkListNode(int var) {
            this.var = var;
        }
    }

    public void initList(){
        MyLinkListNode myLinkListNode0=new MyLinkListNode(0);
        MyLinkListNode myLinkListNode1=new MyLinkListNode(1);
        MyLinkListNode myLinkListNode2=new MyLinkListNode(2);
        MyLinkListNode myLinkListNode3=new MyLinkListNode(3);
        MyLinkListNode myLinkListNode4=new MyLinkListNode(4);
        myLinkListNode0.next=myLinkListNode1;
        myLinkListNode0.prev=null;
        myLinkListNode1.next=myLinkListNode2;
        myLinkListNode1.prev=myLinkListNode0;
        myLinkListNode2.next=myLinkListNode3;
        myLinkListNode2.prev=myLinkListNode1;
        myLinkListNode3.next=myLinkListNode4;
        myLinkListNode3.prev=myLinkListNode2;
        myLinkListNode4.next=null;
        myLinkListNode4.prev=myLinkListNode3;
        this.head=myLinkListNode0;
        this.last=myLinkListNode4;
    }

    public void ShowAppNodeFirst(MyLinkListNode Node){
        MyLinkListNode cur=Node;
        while (cur!=null){
            String str=cur.next!=null?cur.var+" ":cur.var+"";
            System.out.print(str);
            cur=cur.next;
        }
        System.out.println();
    }
    public void ShowAppNodeLast(MyLinkListNode Node){
        MyLinkListNode cur=Node;
        while (cur!=null){
            String str=cur.prev!=null?cur.var+" ":cur.var+"";
            System.out.print(str);
            cur=cur.prev;
        }
        System.out.println();
    }


    public void addFirst(int val){
        MyLinkListNode curNew=new MyLinkListNode(val);
        MyLinkListNode cur=head;
        if(head==null){
            head=curNew;
            last=curNew;
            head.next=null;
        }
        else{
            head.prev=curNew;
            curNew.next=head;
            head=curNew;
        }
    }

    public void addLast(int val){
        MyLinkListNode curNew=new MyLinkListNode(val);
        if(last==null){
            head=curNew;
            last=curNew;
            last.next=null;
        }
        else {
            last.next=curNew;
            curNew.prev=last;
            last=curNew;
        }
    }


    public  void removeOneNode(int val) {
        MyLinkListNode cur = head;
        while (cur != null) {
            if (cur.var == val) {
                if (cur == head) {
                    head = head.next;
                    head.prev = null;
                    return;
                }
                else if (cur.next == null) {
                    last=cur.prev;
                    cur.prev.next = null;
                    return;
                }
                else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                    return;
                }
            }
            cur = cur.next;
        }
    }


    public  void removeAllNode(int val) {
        MyLinkListNode cur = head;
        while (cur != null) {
            if (cur.var == val) {
                if (cur == head) {
                    head = head.next;
                    head.prev = null;
                }
                else if (cur.next == null) {
                    last=cur.prev;
                    cur.prev.next = null;
                }
                else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
        cur = cur.next;
    }
    }

}
