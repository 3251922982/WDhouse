package Book;

public class book {
    public String bookName;
    public String author;
    public int price;
    public String type;
    public boolean state;

    public  book(String bookName,String author,int price,String type) {
        this.bookName = bookName;
        this.author=author;
        this.price=price;
        this.type=type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
