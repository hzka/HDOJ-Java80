import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        double result = 0;
        while (sc_01.hasNext()){
            String veg_name = sc_01.next();
            double vag_wei = sc_01.nextDouble();
            double vag_pri = sc_01.nextDouble();
            result+=(vag_wei *vag_pri);
        }
        System.out.println(String.format("%.1f",result));//人家自己就有四舍五入。
    }
}
