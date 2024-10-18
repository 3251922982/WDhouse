import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        MyLinkedList myLinkList = new MyLinkedList();
        myLinkList.initList();
        myLinkList.addLast(4);
        myLinkList.addFirst(4);
        myLinkList.removeOneNode(4);
        myLinkList.removeAllNode(4);
        myLinkList.ShowAppNodeFirst(myLinkList.head);
        myLinkList.ShowAppNodeLast(myLinkList.last);
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(1);
        linkedList1.addLast(2);
        System.out.println(linkedList1);

    }
}
