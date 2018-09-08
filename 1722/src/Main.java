import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()){
           int num_01 = sc_01.nextInt();
           int num_02 = sc_01.nextInt();
           int tmp = 0;
           //将较小的数放在第一个。
           if(num_01 > num_02){
               tmp = num_01;
               num_01 = num_02;
               num_02 = tmp;
           }

           if(num_01 != num_02){
               //若是不相等
               //注意一定是首尾相连的形状情况，因为有两刀是重合的，以题目4，6为例，所以按照图中的标记全部切割是4+6-2，
               // 2是重合的切割标记数量，数学意义上是4，6的最大公约数，这样如果4人，则1+8 2+3 4+5 6+7，如果6人，
               // 则1+2 3+4 5+6.......(可以以圆心角的度数来理解)
               int Gre_Div = greatest_divisor(num_01, num_02);
               System.out.println((num_02 + num_01)-Gre_Div);

           }else{
               //如果两个数相等，就不用进行判断了。
               System.out.println(num_01);
           }
        }
    }
    //利用辗转相除法。
    private static int greatest_divisor(int num_01, int num_02) {
        int tmp = 0;
        while (num_01 % num_02 != 0) {
            tmp = num_02;
            num_02 = num_01 % num_02;
            num_01 = tmp;
        }
        return num_02;
    }
}
