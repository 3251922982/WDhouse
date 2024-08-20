
public class Date {
    private String year;//private表示私有的，year只能在当前类中使用
    public String moth;
    public String day = "6666";
    public boolean det;

    //构造方法
    public Date(String year, String moth, String day) {//可重载
        this.year = year;
        this.moth = moth;
        this.day = day;
        System.out.println("对象初始化完毕");
    }

    public Date(String year, String moth) {//可重载
        this.year = year;
        this.moth = moth;
        System.out.println("对象初始化完毕");
    }

    public Date(String moth) {
        this.moth = moth;
    }

    public Date() {//可重载
        this("6", "6", "6");//必须是第一行，相当调用构造方法
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}