import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for(int i = 0;i<line_num;i++){
            int num_01 = sc_01.nextInt();
            int num_02 = sc_01.nextInt();
            //其实我当时已经发现其中规律了，但想着汉诺塔问题不会那么简单，再加上之前好像用递归有学过，更不敢下手了
            //还是要对自己的直觉保持信心，对于算法的理解要比写代码本身好太多。
            double result = Math.pow(2,num_01-num_02);
            System.out.println((long)result);
        }
    }
}
