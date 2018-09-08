import java.text.NumberFormat;
import java.util.*;

public class Main {
    //贪心算法解决。但解决错误。
    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int Capacity = sc_01.nextInt();//背包容量
            int Number = sc_01.nextInt();//物品个数
            int[] weight = new int[Number];
            double[] price = new double[Number];
            if (Capacity != 0 && Number != 0) {
                //（2）将Price和概率输入。
                for (int i = 0; i < Number; i++) {
                    weight[i] = sc_01.nextInt();
                    price[i] = sc_01.nextDouble();
                }
                double result[][] = BackResult(Capacity, Number, weight, price);
                int t = 1;
                int j = 1;
                for (t = 1; t <=Number; t++) {
                    for (j = 1; j <=Capacity; j++) {

                    }
                }
                System.out.print(result[t-1][j-1]);
                int a1 = 23;
            } else {
                break;
            }
        }
    }

    /**
     * @param capacity 表示背包的最大容量
     * @param number   表示商品个数
     * @param weight   表示商品重量数组
     * @param price    表示商品价值数组
     */
    private static double[][] BackResult(int capacity, int number, int[] weight, double[] price) {
        //c[i][v]表示前i件物品恰放入一个重量为m的背包可以获得的最大价值
        double result[][] = new double[number + 1][capacity + 1];
        //将零行和零列置零
        for (int i = 0; i < capacity + 1; i++) {
            result[0][i] = 0;
        }
        for (int j = 0; j < number + 1; j++) {
            result[j][0] = 0;
        }
        //开始执行零一背包算法
        for (int i = 1; i < number + 1; i++) {
            for (int j = 1; j < capacity + 1; j++) {
                //当物品为i件重量为j时，如果第i件的重量(weight[i-1])小于重量j时，c[i][j]为下列两种情况之一：
                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
                if (weight[i - 1] <= j) {
                    if (result[i - 1][j] < result[i - 1][j - weight[i - 1]] + price[i - 1]) {
                        result[i][j] = result[i - 1][j - weight[i - 1]] + price[i - 1];
                    } else {
                        result[i][j] = result[i - 1][j];
                    }
                } else {
                    result[i][j] = result[i - 1][j];
                }
            }
        }
        return result;
    }
}

