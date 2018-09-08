import java.text.DecimalFormat;
import java.util.*;
//百度了double的格式化输出的两种方式
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double比float的精度要高。
        while (scanner.hasNext()) {
            float[] num = new float[4];
            for (int i = 0; i < num.length; i++) {
                num[i] = scanner.nextFloat();
            }
            double length = Math.sqrt((num[2] - num[0]) * (num[2] - num[0]) + (num[3] - num[1]) * (num[3] - num[1]));
//            //利用DecimalFormat实现格式化输出。
//            DecimalFormat df = new DecimalFormat("#.##");
//            System.out.println(df.format(length));
            //真的就是保存两位小数
            System.out.println(String.format("%.2f",length));
        }

    }
}
