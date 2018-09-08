import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
//        while (sc_01.hasNext() && sc_02.hasNext()) {
        //使用一个对象无法同时初始化nextInt()和nextLine();
        int line = sc_01.nextInt();
        sc_01.nextLine();
        //输出的字符串
        //***nextLine()可以输入带空格字符串，next()不可以。
        String[] old_String = new String[line];
        //输入字符串
        for (int i = 0; i < line; i++) {
            old_String[i] = sc_01.nextLine();
        }
        for (int i = 0; i < line; i++) {
            //使用Split对字符串进行切割。
            String[] split = old_String[i].split(" ");
            for (int j = 0; j < split.length - 1; j++) {
                //对字符串做分割
                split[j] = reverse(split[j]);
                System.out.print(split[j] + " ");
            }
            split[split.length - 1] = reverse(split[split.length - 1]);
            System.out.println(split[split.length - 1]);
        }
    }

    private static String reverse(String s) {
        String backString = new String();//不要使用null来初始化，使用new String来初始化。
        if (s.equals(" ")) {
            return " ";
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                backString += String.valueOf(s.charAt(i));
            }
            return backString;
        }
    }
}



