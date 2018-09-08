import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        int couting = 0;
        sc_01.nextLine();
        for (int i = 0; i < line_num; i++) {
            String s1 = sc_01.nextLine();//正常输入流就可以
//  是通过Unicode进行汉字编码的，中文的unicode编码范围是: 在33-126之间的字母。
            //只要>32和<126之内即可。
            //链接：https://www.qqxiuzi.cn/zh/hanzi-unicode-bianma.php
            for (int j = 0; j < s1.length(); j++) {
                if ((int) s1.charAt(j) <32 ||((int) s1.charAt(j) >126)){
//                if (((int) s1.charAt(j) >= 0x4E00 && (int) s1.charAt(j) <= 0x9FEF) ||
//                        ((int) s1.charAt(j) >= 0x3400 && (int) s1.charAt(j) <= 0x4DB5) ||
//                        ((int) s1.charAt(j) >= 0x20000 && (int) s1.charAt(j) <= 0x2A6D6) ||
//                        ((int) s1.charAt(j) >= 0x2A700 && (int) s1.charAt(j) <= 0x2B734) ||
//                        ((int) s1.charAt(j) >= 0x2B740 && (int) s1.charAt(j) <= 0x2B81D) ||
//                        ((int) s1.charAt(j) >= 0x2B820 && (int) s1.charAt(j) <= 0x2CEA1) ||
//                        ((int) s1.charAt(j) >= 0x2CEB0 && (int) s1.charAt(j) <= 0x2EBE0) ||
//                        ((int) s1.charAt(j) >= 0x2F00 && (int) s1.charAt(j) <= 0x2FD5) ||
//                        ((int) s1.charAt(j) >= 0x2E80 && (int) s1.charAt(j) <= 0x2EF3) ||
//                        ((int) s1.charAt(j) >= 0xF900 && (int) s1.charAt(j) <= 0xFAD9) ||
//                        ((int) s1.charAt(j) >= 0x2F800 && (int) s1.charAt(j) <= 0x2FA1D) ||
//                        ((int) s1.charAt(j) >= 0xE815 && (int) s1.charAt(j) <= 0xE86F) ||
//                        ((int) s1.charAt(j) >= 0xE400 && (int) s1.charAt(j) <= 0xE5E8) ||
//                        ((int) s1.charAt(j) >= 0xE600 && (int) s1.charAt(j) <= 0xE6CF) ||
//                        ((int) s1.charAt(j) >= 0x31C0 && (int) s1.charAt(j) <= 0x31E3) ||
//                        ((int) s1.charAt(j) >= 0x2FF0 && (int) s1.charAt(j) <= 0x2FFB) ||
//                        ((int) s1.charAt(j) >= 0x3105 && (int) s1.charAt(j) <= 0x312F) ||
//                        ((int) s1.charAt(j) >= 0x31A0 && (int) s1.charAt(j) <= 0x31BA) ||
//                        ((int) s1.charAt(j) == 0x3007)) {
                    couting++;
                }
            }
            System.out.println(couting);
            couting = 0;
        }
    }
}
