import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        //最主要理解题意，一定要注意输入输出。
        while (sc01.hasNext()) {
            int result = 0, endnum = 0,count = 0;
            endnum = sc01.nextInt();
            while (count <= endnum) {
                result += count;
                count++;
            }
            System.out.println(result);
            System.out.println();
        }
    }
}
