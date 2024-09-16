import java.util.Scanner;

public class Test2 {
    public static void logOn(String name , String passWord) throws  PassWordException,UsernameException{
        Scanner scanner=new Scanner(System.in);
        String name1=scanner.nextLine();
        //scanner.nextLine();
        String password1=scanner.nextLine();
        if(!name.equals(name1)){
            throw new PassWordException("用户名错误");
        }
        if(!passWord.equals(password1)){
            throw new UsernameException("密码错误");
        }
        else{
            System.out.println("成功登录");
        }
    }
    public static void main(String[] args)  {
        String name=new String("wd");
        String passWord=new String("123456");
        try {
            logOn(name,passWord);
        } catch (PassWordException e) {
            e.printStackTrace();
        }
        catch(UsernameException e){
            e.printStackTrace();
        }
    }
}
