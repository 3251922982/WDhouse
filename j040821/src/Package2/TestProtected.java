
package Package2;
import Package.TestDemo;   //这个就是你的包路径哈
public class TestProtected extends TestDemo {
        public int a=111;
        public static void main(String[] args) {
                TestProtected class1 = new TestProtected();
                System.out.println(class1.a);
        }
        public  int func(){
                return super.a;
        }

}


