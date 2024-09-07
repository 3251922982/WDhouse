package User;
import Operate.bookOperation;
import  Book.bookList;
public  abstract class user {
    protected String name;

    public user(String name) {
        this.name=name;
    }

    protected bookOperation[] array=new bookOperation[10];

    public abstract  int menu();

    public void doWork(int choice,bookList bookList){
        array[choice].work(bookList);
    }
}
