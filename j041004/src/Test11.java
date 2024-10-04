public class Test11 {
    public static void main(String[] args) {
        MyList myList=new MyList();
        myList.list();
//        myList.addFirst(1111);
//        myList.addFirst(1111);
//        myList.addFirst(1111);
//        myList.addFirst(1111);
//        myList.addFirst(1111);
//        myList.addLast(6666);
//        myList.addLast(6666);
//        myList.addLast(6666);
        //myList.addLast(6666);

        myList.show();
        System.out.println(myList.size());
        myList.addIndex(4,666);
        myList.show();
        System.out.println(myList.size());
        //System.out.println(myList.contains(666));
        myList.remove(4);
        myList.show();
        System.out.println(myList.size());
    }

}
