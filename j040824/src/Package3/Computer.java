package Package3;

public class Computer {
    public  Roll roll1=new Roll();//组合
    public void  Roll1(){
        roll1.roll();
    }
    public  void on(){
        System.out.println("电脑开机");
    }

    public  void close(){
        System.out.println("电脑关机");
    }

    public  void usb(IUSB device){//通过接口接收设备，接收后转型就就可以使用设备功能
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
