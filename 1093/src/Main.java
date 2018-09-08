import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);

        int line = scanner01.nextInt();
        int count2 = 0;
        while (count2<line) {
            int linenumeber = scanner01.nextInt();
            int count = 0,result = 0;
            int number01[] = new int[linenumeber];
            while (count<linenumeber) {
                number01[count]= scanner01.nextInt();
                result+=number01[count];
                count++;
            }
            System.out.println(result);
            count2++;
        }

    }
}
