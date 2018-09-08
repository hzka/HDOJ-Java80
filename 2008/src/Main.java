import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int nuber_amo = sc_01.nextInt();
            int positive_number = 0, negative_number = 0, zero = 0;
            if (nuber_amo == 0) {
            } else {
                for (int i = 0; i < nuber_amo; i++) {
                    double number_01 = sc_01.nextDouble();
                    if (number_01 == 0) {
                        zero++;
                    } else if (number_01 < 0) {
                        negative_number++;
                    } else {
                        positive_number++;
                    }
                }
                System.out.println(negative_number + " " + zero + " " + positive_number);
            }
        }
    }
}
