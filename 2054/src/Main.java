import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            BigDecimal num_01 = sc_01.nextBigDecimal();//   BigDecimal 由任意精度的整数非标度值 和 32 位的整数标度 (scale) 组成
            BigDecimal num_02 = sc_01.nextBigDecimal();
            if (num_01.compareTo(num_02) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

