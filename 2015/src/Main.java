import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num_01 = sc_01.nextInt();//数字的个数
            int cha_ju = sc_01.nextInt();//几个数字的均值。
            int[] allnum = new int[num_01];//所有数字
            for (int i = 0; i < num_01; i++) {
                allnum[i] = 2 * (i + 1);
            }
            for (int i = 0; i < num_01; i = i + cha_ju) {
                int result = 0;
                int counting =0,j=0;
                //计算所有项之和。
                for (j = i; j < i + cha_ju; j++) {
                    if (j >= allnum.length) {//对后续不进行处理。
                    } else {
                        result += allnum[j];
                        counting++;//每一列到底有多少数
                    }
                }
                //对其求均值
                if(j<allnum.length){
                    System.out.print(result/counting+" ");
                }else{
                    System.out.println(result/counting);
                }
            }
        }

    }
}
