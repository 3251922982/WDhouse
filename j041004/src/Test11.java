public class Test11 {
    public static void main(String[] args) {
        MyList myList=new MyList();
        myList.list();
        myList.addFirst(1111);
        myList.addFirst(2222);
        myList.addFirst(3333);
        myList.addFirst(4444);
        myList.addLast(5555);
        myList.addIndex(5,1111);
//        myList.addLast(6666);
//        myList.addLast(6666);
//        myList.addLast(6666);
        //myList.addLast(6666);

        myList.show();
        System.out.println(myList.size());
        myList.addIndex(4,666);
        myList.show();
        System.out.println(myList.size());
        //System.out.println(myList.size());
        //System.out.println(myList.contains(666));
//        myList.indexRemove(0);
//        myList.keyRemove(1111);
//        myList.keyRemove(1111);
        myList.reverseList();
        //myList.clear();
        myList.addIndex(0,111);
//        System.out.println(myList.head.val);
//        myList.addIndex(1,222);
//        myList.addIndex(2,333);
        myList.show();
        System.out.println(myList.size());
        myList.showNode(myList.findMiddleNode());
        myList.showNode(myList.findToLastNode(6));
        myList.showNode(myList.deleteMiddle());
        myList.clear();

    }

}
