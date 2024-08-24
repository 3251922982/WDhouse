package Package3;

public class KeyBoard implements IUSB{
    public void hibernate1(){
        System.out.println("键盘休眠1");
    }
    public  void hibernate2(){
        System.out.println("键盘休眠2");
    }

    public void openDevice(){
        System.out.println("打开键盘");
    }
    public  void  closeDevice(){
        System.out.println("关闭键盘");
    }
    public  void input(){
        System.out.println("使用键盘输入。。。");
    }
}
