import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);
        int line = scanner01.nextInt();
        int count = 0;
        //注意判断条件
        while(count<line){
            int number01 = scanner01.nextInt();
            int number02 = scanner01.nextInt();
            System.out.println(number01+number02);
            count++;
        }

    }
}
