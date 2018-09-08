import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {

            int teach_num = sc_01.nextInt();
            int[] Payer = new int[teach_num];
            if (teach_num != 0) {
                //输入所有老师的个数和老师的工资。
                for (int i = 0; i < teach_num; i++) {
                    Payer[i] = sc_01.nextInt();
                }
                int result = 0;
                //输入面币种类
                int[] Money = {100, 50, 10, 5, 2, 1};
                for(int i = 0;i<teach_num;i++){
                   for(int j = 0;j<Money.length;j++){
                       result+=(Payer[i]/Money[j]);
                       //对result进行累加。
                       Payer[i] = Payer[i]%Money[j];
                       //每次更新Payer[i]
                   }
                }
                System.out.println(result);
            } else {
                break;
            }
        }
    }
}
