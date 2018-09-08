import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int lin_num = sc_01.nextInt();
        for (int i = 0; i < lin_num; i++) {
            //输入用户身份证ID。
            String Cer_ID = sc_01.next();
            int region_ID = Integer.parseInt(Cer_ID.substring(0, 2));
//            int year_ID = Integer.parseInt(Cer_ID.substring(6, 10));
//            int month_ID = Integer.parseInt(Cer_ID.substring(10, 12));
//            int day_ID = Integer.parseInt(Cer_ID.substring(12, 14));
            String result1 = new String();
            switch (region_ID) {
                case 33:
                    result1 = "Zhejiang";
                    break;
                case 11:
                    result1 = "Beijing";
                    break;
                case 71:
                    result1 = "Taiwan";
                    break;
                case 81:
                    result1 = "Hong Kong";
                    break;
                case 82:
                    result1 = "Macao";
                    break;
                case 54:
                    result1 = "Tibet";
                    break;
                case 21:
                    result1 = "Liaoning";
                    break;
                case 31:
                    result1 = "Shanghai";
                    break;
            }
            //杭电OJ输出检查太严格了吧，如果是截取字符串就是对的，如果是截取的字符串转成int类型输出就报错，
            System.out.println("He/She is from "+result1 + ",and his/her birthday is on " +
                    Cer_ID.substring(10, 12) + "," + Cer_ID.substring(12, 14) + "," + Cer_ID.substring(6, 10) + " based on the table.");
        }
    }
}
