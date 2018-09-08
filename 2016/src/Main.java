import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int count_num = sc_01.nextInt();
            int[] num_array = new int[count_num];
            if (count_num == 0) {
                break;
            } else {
                //输入数组所有元素
                for (int i = 0; i < count_num; i++) {
                    num_array[i] = sc_01.nextInt();
                }
                int min = num_array[0], flag = 0, tmp;
                //获取最小元素的下标
                for (int i = 1; i < count_num; i++) {
                    if (num_array[i] < min) {
                        //是不是傻啊，不对最小值进行更新。
                        min = num_array[i];
                        flag = i;
                    }
                }
                //将两者进行交换
                tmp = num_array[0];
                num_array[0] = num_array[flag];
                num_array[flag] = tmp;
                //输出最终排序结果
                for (int i = 0; i < count_num; i++) {
                    if(i<count_num-1){
                        System.out.print(num_array[i]+" ");
                    }else{
                        System.out.println(num_array[i]);
                    }
                }
            }
        }

    }
}
