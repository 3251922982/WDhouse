public class Test1 {
    public static void met1(String[] strings)  throws  CloneNotSupportedException,ArithmeticException{
        if(strings==null) {
            throw new CloneNotSupportedException();
        }


            int a=10/1;//举个例子


    }

    public static void main(String[] args) {
        //int a=10/0;
        //met1(null);
        try {
            met1(new String[]{"1"});
            System.out.println("13366345");//抛出异常就不会被执行
            return ;
        } catch(CloneNotSupportedException |  ArithmeticException e){
            e.printStackTrace();
            System.out.println("克隆异常处理");
        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println("算数异常处理");
//        }
        finally {//一定会被执行
            System.out.println("111");
        }
        //catch ()
        System.out.println("hhh");
    }
}
