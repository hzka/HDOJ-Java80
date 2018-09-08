import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a[] = new long[21];//a[n]表示个数；一定要用长整形，不然数字越界
        a[1] = 1;
        for (int i = 2; i < 21; i++) {
            a[i] = i * (a[i - 1] + 1);
        }
        while (sc.hasNext()) {
            long m = sc.nextLong();
            long n = sc.nextLong();
            if (m <= 0 || m > 20 || n <= 0 || n > a[(int) m]) {
                break;
            }
            List list = new ArrayList();//初始化。
            for (int i = 1; i < m + 1; i++) {
                list.add(i);
            }
            out(m, n, a, list);
            System.out.println();
        }
    }

    private static void out(long m, long n, long a[], List list) {
        //m第几个    a[m]总个数    n第几个
        if (m == 1) {
            System.out.print(list.get((int) (m - 1)));
        }//不出意外输出到最后
        else {
            long a1 = a[(int) m] / m;//看每一小块有多少个数
            long a2 = (n - 1) / a1 + 1;//当前要输出数（其实也是位置第一位对应的是他本身，后面就不一定）。这样可以避免刚好成倍数的数和前面分组不同
            int a3 = (int) a2;
            if (n % a1 != 1) {

                System.out.print(list.get(a3 - 1) + " ");
                list.remove(a3 - 1);
                out(m - 1, (n - 1) % a1, a, list);
            } else//特殊情况就停止，也就是每次数值位置变更的时候会停止
                System.out.print(list.get(a3 - 1));
        }
    }
}