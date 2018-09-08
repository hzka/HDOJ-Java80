import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int num = sc_01.nextInt();
        sc_01.nextLine();
        for (int j = 0; j < num; j++) {
            String strings = sc_01.nextLine();
            int[] yuan_yin = new int[5];
            //计算每一个元音的数量
            for (int i = 0; i < strings.length(); i++) {
                char char_vol = strings.charAt(i);
                switch (char_vol) {
                    case 'a':
                        yuan_yin[0]++;
                        break;
                    case 'e':
                        yuan_yin[1]++;
                        break;
                    case 'i':
                        yuan_yin[2]++;
                        break;
                    case 'o':
                        yuan_yin[3]++;
                        break;
                    case 'u':
                        yuan_yin[4]++;
                        break;
                    default:
                        break;
                }
            }
            //对统计结果进行输出
            for (int i = 0; i < yuan_yin.length; i++) {
                switch (i) {
                    case 0:
                        System.out.println("a:" + yuan_yin[0]);
                        break;
                    case 1:
                        System.out.println("e:" + yuan_yin[1]);
                        break;
                    case 2:
                        System.out.println("i:" + yuan_yin[2]);
                        break;
                    case 3:
                        System.out.println("o:" + yuan_yin[3]);
                        break;
                    case 4:
                        System.out.println("u:" + yuan_yin[4]);
                        break;
                    default:
                        break;
                }
            }
            if (j < num - 1) {
                System.out.println();
            } else {

            }
        }
    }
}
