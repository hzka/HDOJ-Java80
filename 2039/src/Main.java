import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int line = sc_01.nextInt();
            //你也没说必须是double类型啊，只是说数啊。fuck
            //有大佬用Arrays.sort()直接进行排序，将最小两个相加大于第三个就可以，无意简化太多。
            for (int i = 0; i < line; i++) {
                double num_01 = sc_01.nextDouble();
                double num_02 = sc_01.nextDouble();
                double num_03 = sc_01.nextDouble();
                if (num_01 + num_02 > num_03 && num_01 - num_02 < num_03
                        && num_01 + num_03 > num_02 && num_01 - num_03 < num_02
                        && num_02 + num_03 > num_01 && num_02 - num_03 < num_01) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
