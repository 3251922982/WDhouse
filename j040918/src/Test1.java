import java.util.Scanner;

public class Test1 {
    public static String func(String string1, String string2) {
        int length1 = string1.length();
        int length2 = string2.length();
        int carry = 0;
        String stringMax = length1 >= length2 ? string1 : string2;
        String stringMin = length1 >= length2 ? string2 : string1;
        String sumString = new String();
        int sum = 0;
        int lengthMax = length1 >= length2 ? length1 : length2;
        int lengthMin = length1 >= length2 ? length2 : length1;
        for (int a = 1; a <= lengthMax - lengthMin; a++) {
            stringMin = "0" + stringMin;
        }
        for (int i = lengthMax - 1; i >= 0; i--) {
            sum = (int) stringMax.charAt(i) + (int) stringMin.charAt(i) + carry - 96;
            if (sum == 0 || sum == 1) {
                sumString = sum + sumString;
                carry = 0;
            } else if (sum == 2) {
                sumString = 0 + sumString;
                carry = 1;
            } else if (sum == 3) {
                sumString = 1 + sumString;
                carry = 1;
            }
            if (i == 0) {
                if (carry == 1) {
                    sumString = 1 + sumString;
                }
            }
        }

        return sumString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = new String();
        String string2 = new String();
        String string3 = new String();
        StringBuilder stringBuilder = new StringBuilder();
//        while (scanner.hasNextLine()) {
//            string1 = scanner.nextLine();
//            string2 = scanner.nextLine();
//            for (int i = 0; i < string1.length(); i++) {
//                int det = 1;
//                for (int j = 0; j < string2.length(); j++) {
//                    if (string1.codePointAt(i) == string2.codePointAt(j)) {//可以用str.indexof(ch)==-1或者str.contains
//                        det = 0;
//                        continue;
//                    }
//                }
//                if (det == 1) {
//                    string3 = string3 + string1.charAt(i);
//                }
//            }
//            System.out.println(string3);
//            string1="";
//            string2="";
//            string3="";
//        }

        int sum=0;
        while (scanner.hasNextLine()) {
            string1 = scanner.nextLine();
            string2 = scanner.nextLine();
            String string4=new String(func(string1, string2));
            System.out.println(string4);
            int sum1=0;
            int length4=string4.length();
            for(int i=0;i<string4.length();i++){
                int j=string4.length()-i-1;
                sum1+=((int)string4.charAt(j)-48)*Math.pow(2,i);
            }
            System.out.println(sum1);
            string1="";
            string2="";
            sum++;
            if(sum==2){
                break;
            }
        }
        }
    }

