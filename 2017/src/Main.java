import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for (int i = 0; i < line_num; i++) {
            String string_01 = sc_01.next();
            int counting = 0;
            for (int j = 0; j < string_01.length(); j++) {
                if (string_01.charAt(j) >= '0' && string_01.charAt(j) <= '9')
                    counting++;
            }
            System.out.println(counting);
        }
    }
}
