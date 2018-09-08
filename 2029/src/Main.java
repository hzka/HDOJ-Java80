import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int char_num = sc_01.nextInt();
        for(int i = 0;i<char_num;i++){
            String test_strings = sc_01.next();
            boolean result = check_huiwen(test_strings);
            if(result){System.out.println("yes");}
            else{
                System.out.println("no");
            }
        }
    }

    private static boolean check_huiwen(String test_strings) {
        for(int i= 0;i<test_strings.length();i++){
            if(test_strings.charAt(i) != test_strings.charAt(test_strings.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
