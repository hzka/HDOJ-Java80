import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for(int i = 0 ;i<line_num;i++){
            int num_01 = sc_01.nextInt();
            int num_02 = sc_01.nextInt();
            num_01 = deal(num_01);
            num_02 = deal(num_02);
            if(num_01+num_02<100){
                System.out.println(num_01+num_02);
            }else{
                String tmp =  String.valueOf(num_01+num_02);
                System.out.println(Integer.parseInt(tmp.substring
                        (tmp.length()-2,tmp.length())));
            }
        }
    }

    private static int deal(int num_01) {
       if(num_01<100 && num_01>-100){
           return Math.abs(num_01);
       }else{
           num_01 = Math.abs(num_01);
           String tmp = String.valueOf(num_01);
           return Integer.parseInt(tmp.substring(tmp.length()-2,tmp.length()));
       }
    }
}
