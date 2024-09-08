package Book;

public class bookList {
    private   book[] books=new book[10];
    private    int useSize;
    public bookList() {
        books[0]=new book("三国演义","罗贯中",20,"古典小说");
        books[1]=new book("三体","刘慈欣",25,"科幻小说");
        books[2]=new book("西游记","吴承恩",40,"古典小说");
        books[3]=new book("云边有个小卖部","张嘉佳",30,"奇幻小说");
        useSize=4;
    }

    public book getBook(int pos){
        if(pos<0){
            return null;
        }
        else {
            return books[pos];
        }
    }

    public void setBooks(int Ser, book[] books,book book) {
        this.books[Ser] = book;
    }

    public book[] getBooks() {
        return books;
    }

    public int getUseSize() {
        return useSize;
    }

    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }
}
