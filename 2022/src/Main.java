import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int line_num = sc_01.nextInt();//行数
            int column_num = sc_01.nextInt();//列数
            //输入所有行列的值
            int[][] all_num = new int[line_num][column_num];
            for (int i = 0; i < line_num; i++) {
                for (int j = 0; j < column_num; j++) {
                    all_num[i][j] = sc_01.nextInt();
                }
            }
            //记录绝对值最大的值
            int max = Math.abs(all_num[0][0]), flag_line = 0, flag_column = 0;
            //反向遍历，从最后一个逐列逐行反着去读，若小于等于，则更新。
            for (int i = line_num - 1; i >= 0; i--) {
                for (int j = column_num - 1; j >= 0; j--) {
                    if (max <= Math.abs(all_num[i][j])) {
                        max = Math.abs(all_num[i][j]);
                        flag_line = i;
                        flag_column = j;
                    }
                }
            }
            System.out.print((flag_line+1)+" "+(flag_column+1)+" ");
            System.out.println(all_num[flag_line][flag_column]);
        }

    }
}
