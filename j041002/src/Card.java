public class Card {
    public String Decor;
    public  int number;


    public Card(String decor, int number) {
        this.Decor = decor;
        this.number = number;
    }

    @Override
    public String toString() {
        return Decor + number;
    }
}
