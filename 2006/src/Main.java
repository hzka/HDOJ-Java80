//import jdk.nashorn.internal.parser.Scanner;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int num_length = scanner.nextInt();
            int[] num_01 = new int[num_length];
            int result = 1;
            for (int i = 0; i < num_length; i++) {
                num_01[i] = scanner.nextInt();
                if (num_01[i] % 2 == 1) {
                    result *= num_01[i];
                }
            }
            System.out.println(result);
        }
    }
}
