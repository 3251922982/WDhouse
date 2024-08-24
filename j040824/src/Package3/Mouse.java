package Package3;

public class Mouse implements IUSB{
    public  void hibernate1(){
        System.out.println("鼠标休眠1");
    }
    public  void hibernate2(){
        System.out.println("鼠标休眠2");
    }
    public void openDevice(){
        System.out.println("打开鼠标");
    }
    public  void  closeDevice(){
        System.out.println("关闭鼠标");
    }

    public void  click(){
        System.out.println("滑动鼠标。。。。");
    }
}
