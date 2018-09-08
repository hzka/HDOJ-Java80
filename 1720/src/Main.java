import java.util.Scanner;
public class Main {
    //注意自己找API
    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while(sc_01.hasNext()){
            String num_1 = sc_01.next();
            String num_2 = sc_01.next();
            int num_01 = Integer.parseInt(num_1,16);
            int num_02 = Integer.parseInt(num_2,16);
            System.out.println(num_01+num_02);
        }

    }
}
