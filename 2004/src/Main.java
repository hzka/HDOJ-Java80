import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int score_01 = sc_01.nextInt();
            if (score_01 >= 0 && score_01 <= 59) {
                System.out.println("E");
            } else if (score_01 > 59 && score_01 <= 69) {
                System.out.println("D");
            } else if (score_01 > 69 && score_01 <= 79) {
                System.out.println("C");
            } else if (score_01 > 79 && score_01 <= 89) {
                System.out.println("B");
            } else if (score_01 > 89 && score_01 <= 100) {
                System.out.println("A");
            } else {
                System.out.println("Score is error!");
            }
        }
    }
}
