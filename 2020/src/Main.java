import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num_count = sc_01.nextInt();
            int[] num_all = new int[num_count];
            if (num_count != 0) {
                //输入所有int类型数组
                for (int i = 0; i < num_count; i++) {
                    num_all[i] = sc_01.nextInt();
                }
                //对所有数组进行排序,每次都拿最大绝对值的数字。
                //冒泡、快速、插入、希尔、归并、堆排序。
                for (int i = 0; i < num_count; i++) {
                    int max ;//将最大值定为第i个
                    for(int j = i;j<num_count;j++){//进行最大值的计算。
                        if(Math.abs(num_all[j])>Math.abs(num_all[i])){
                            max = num_all[i];//每次进行更新。
                            num_all[i] = num_all[j];
                            num_all[j] = max;
                        }
                    }
                }
                //对所有数组进行输出
                for (int i = 0; i < num_count; i++) {
                    if (i < num_count - 1) {
                        System.out.print(num_all[i] + " ");
                    } else {
                        System.out.println(num_all[i]);
                    }
                }
            } else {
                break;
            }
        }
    }
}
