import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            String strings = sc_01.nextLine();
            char[] output = new char[strings.length()];
            for (int i = 0; i < strings.length(); i++) {
                if (i == 0) {
                    if (strings.charAt(0) <= 122 && strings.charAt(0) >= 97) {
                        output[0] = (char) (strings.charAt(0) - 32);
                    } else {
                        output[0] = strings.charAt(0);
                    }
                } else {
                    if (strings.charAt(i-1) == 32 && strings.charAt(i) <= 122 && strings.charAt(i) >= 97) {
                        output[i] = (char) (strings.charAt(i) - 32);
                    } else {
                        output[i] = strings.charAt(i);
                    }
                }
            }
            for (int i = 0; i < strings.length(); i++) {
                System.out.print(output[i]);
            }
            System.out.println();
        }
    }
}
