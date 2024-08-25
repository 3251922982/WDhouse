package Package3;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.on();
        computer.usb(new Mouse());
        computer.usb(new KeyBoard());
        computer.close();
        computer.Roll1();
    }
}
