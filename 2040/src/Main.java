import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for(int i= 0;i<line_num;i++){
            int num_01 = sc_01.nextInt();
            int num_02 = sc_01.nextInt();
            int result_01 = 0,result_02 = 0;
            //计算其第一个数的真约数之和
            for(int j=1;j<num_01;j++){
                if(num_01%j==0){
                    result_01+=j;
                }
            }
            //计算第二个数的真约数之和
            for(int j=1;j<num_02;j++){
                if(num_02%j==0){
                    result_02+=j;
                }
            }
            if(num_01==result_02 && num_02 ==result_01){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
