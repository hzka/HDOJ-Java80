import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int flag = 0;//设置第一次的标志位
        while (sc_01.hasNext()) {
            String chars = sc_01.next();
            if (!chars.equals("@")) {
                int chars_line = sc_01.nextInt();
                //根据标志位判断中间有没有空行。和之前的格式不同，之前的格式都是第一行之后输出空行的。
                if (flag != 0) {
                    System.out.println();
                }
                flag++;
                //如果只有一行的话
                if (chars_line == 1) {
                    System.out.println(chars);
                } else {
                    //若有多行的话
                    for (int i = 1; i < chars_line; i++) {
                        //前面的空格个数
                        for (int j = chars_line; j > i; j--) {
                            System.out.print(" ");
                        }
                        //输出字符串
                        System.out.print(chars);
                        //输出其他字符串
                        if (i != 1) {
                            for (int k = 1; k <= 2 * (i - 2) + 1; k++) {
                                System.out.print(" ");
                            }
                            System.out.print(chars);
                        }
                        //每一行空行
                        System.out.println();
                    }
                    //最后一行字符串
                    for (int i = 1; i <= (chars_line * 2 - 1); i++) {
                        System.out.print(chars);
                    }
                    System.out.println();
                }
            } else {
                break;
            }
        }
    }
}
