import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        sc_01.nextLine();
        for (int i = 0; i < line_num; i++) {
            String strings = sc_01.nextLine();
            boolean result = checkString(strings);
            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    //    C语言中规定标识符只能由字母、数字和下划线3种字符组成，且第一个字符必须为字母或下划线。
    private static boolean checkString(String strings) {
        for (int i = 0; i < strings.length(); i++) {
            if (i == 0) {
                if (strings.charAt(0) < 65 || (strings.charAt(0) > 90 && strings.charAt(0) < 95)
                        || (strings.charAt(0) > 95 && strings.charAt(0) < 97) || strings.charAt(0) > 122) {
                    return false;
                }
            } else {
                if (strings.charAt(i) < 48 || (strings.charAt(i) > 57 && strings.charAt(i) < 65) || (strings.charAt(i) > 90 && strings.charAt(i) < 95)
                        || (strings.charAt(i) > 95 && strings.charAt(i) < 97) || strings.charAt(i) > 122) {
                    return false;
                }
            }
        }
        return true;
    }
}
