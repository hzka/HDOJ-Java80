import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for(int i = 0;i<line_num;i++){
            long num_01 = sc_01.nextLong();
            long num_02 = sc_01.nextLong();
            if(num_01 % num_02 == 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
