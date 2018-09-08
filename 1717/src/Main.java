import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for (int i = 0; i < line_num; i++) {
            String s1 = sc_01.next();
            int t = s1.indexOf(".");
            if (!s1.contains("(")) {
                //处理非循环小数。
                //确定.的位置，然后截取字符串，获得两个数字，然后求最大公约数，两个同时除以最大公约数，获得真分数。
                int mul10 = s1.substring(t + 1, s1.length()).length();
                int num_01 = (int) ((Double.parseDouble(s1) * Math.pow(10, mul10)));
                int num_02 = (int) (Math.pow(10, mul10));
                //如果是0.55的话，一个是55，一个是100。
                int GCD_01 = GCD(num_01, num_02);
                String result = num_01 / GCD_01 + "/" + num_02 / GCD_01;
                System.out.println(result);
            } else {
                //处理循环小数
                //处理纯循环小数
                int num_01 = Integer.parseInt(s1.substring(s1.indexOf("(") + 1, s1.indexOf(")")));
                int num_02 = 0;
                if (s1.indexOf("(")-s1.indexOf(".") == 1) {
                    //截取循环体的字符串
                    for (int j = 0; j < s1.substring(s1.indexOf("(") + 1, s1.indexOf(")")).length(); j++) {
                        num_02 = num_02 * 10 + 9;
                    }
                } else {
                    //处理混合循环小数
                    for (int j = 0; j < s1.substring(s1.indexOf("(") + 1, s1.indexOf(")")).length(); j++) {
                        num_02 = num_02 * 10 + 9;
                    }
                    int point2brackets = Integer.parseInt(s1.substring(s1.indexOf(".") + 1, s1.indexOf("(")));
                    int point2brackets_len = s1.substring(s1.indexOf(".") + 1, s1.indexOf("(")).length();
                    num_02 = (int) Math.pow(10, point2brackets_len) * num_02;
                    num_01 = Integer.parseInt(String.valueOf(point2brackets) + String.valueOf(num_01)) - point2brackets;
                }
                int GCD_01 = GCD(num_01, num_02);
                //加上假分数
                int before_point = Integer.parseInt(s1.substring(0, s1.indexOf(".")));
                //小数点前面整数+小数点后面的数
                String result = (num_01 / GCD_01 + before_point * num_02 / GCD_01) + "/" + num_02 / GCD_01;
                System.out.println(result);
            }
        }
    }

    private static int GCD(int num_01, int num_02) {
        int tmp = 0;
        //将大数放在前面。
        if (num_01 < num_02) {
            tmp = num_01;
            num_01 = num_02;
            num_02 = tmp;
        }
        while (num_01 % num_02 != 0) {
            tmp = num_02;
            num_02 = num_01 % num_02;
            num_01 = tmp;
        }
        return num_02;
    }
}
