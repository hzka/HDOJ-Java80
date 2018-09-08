import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        while (sc01.hasNext()) {  //杭电OJ对输入输出有严格的要求
            int number01 = sc01.nextInt();
            int number02 = sc01.nextInt();
            int result = number01 + number02;
            System.out.println(result);
        }
    }
}
