import java.util.Locale;
import java.util.Scanner;

class test{
    public final int a;
    {
        a=10;
    }
}


public class TestClass {
    public static String func(String str) {

        return "1";
    }

    public static void main(String[] args) {
        String str = new String("llo") + new String("llo");
        String str2 = "hello";
        String str3 = "hello";
        System.out.println(str2 == str3);
        Scanner scanner = new Scanner(System.in);
        int det = 1;
        String string1=new String();
        String string2=new String();
        while (scanner.hasNext()) {
            string1=scanner.nextLine();
            string2=scanner.nextLine();
            System.out.println((char)(string1.charAt(0)+32));
            System.out.println((char)(string2.charAt(0)+32));
        }

    }
}
