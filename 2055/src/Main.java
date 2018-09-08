import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for (int i = 0; i < line_num; i++) {
            String string_01 = sc_01.next();
            int y = sc_01.nextInt();
            int result = 0;
            if (string_01.charAt(0) >= 'a' && string_01.charAt(0) <= 'z') {
                result = -(string_01.charAt(0) - 96);
            } else if (string_01.charAt(0) >= 'A' && string_01.charAt(0) <= 'Z') {
                result = (string_01.charAt(0) - 64);
            } else {
            }
            result = result + y;
            System.out.println(result);
        }

    }
}
