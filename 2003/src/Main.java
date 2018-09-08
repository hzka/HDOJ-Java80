

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            double num_01 = sc_01.nextDouble();
            System.out.println(String.format("%.2f", Math.abs(num_01)));
        }
    }
}
