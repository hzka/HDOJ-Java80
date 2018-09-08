import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);

        //注意判断条件
        while (scanner01.hasNext()) {
            int number01 = scanner01.nextInt();
            int number02 = scanner01.nextInt();
            if (number01 == 0 && number02 == 0) {
                break;
            } else {
                System.out.println(number01 + number02);
            }
        }

    }
}
