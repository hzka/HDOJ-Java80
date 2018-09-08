import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int month = 12;
            double[] monthvalue = new double[month];
            double totalResult= 0;
            for (int i = 0; i < month; i++) {
               monthvalue[i] = sc_01.nextDouble();
               totalResult +=monthvalue[i];
            }
            double aver_val = totalResult/12.0;
            System.out.println("$"+String.format("%.2f",aver_val));
        }
    }
}
