public class Test2 {
    public static String func1(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if('A'<=ch&&ch<='Z'){
                ch=(char)(ch+32);
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public static int func2(String s) {
        //if(s=="") return 0;
        String[] strings=s.split(" ");
        int sum=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()!=0){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(func1("acbdjskaXSDHCS"));
        System.out.println(func2(""));
        String s=new String(" ");
        System.out.println(s.length());
    }
}
