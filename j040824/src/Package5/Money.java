package Package5;

public class Money implements  Cloneable {
    public int money;

    public  Money(int money) {
        this.money = money;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    }

