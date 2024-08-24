package Package3;

public class Computer {
    public  void on(){
        System.out.println("电脑开机");
    }

    public  void close(){
        System.out.println("电脑开机");
    }

    public  void usb(IUSB device){
        device.openDevice();
        if(device instanceof  Mouse){
            Mouse mouse=(Mouse) device;
            mouse.hibernate1();
            mouse.click();
        } else if (device instanceof  KeyBoard) {
            KeyBoard keyBoard=(KeyBoard) device;
            keyBoard.input();
        }
        device.closeDevice();
    }
}
