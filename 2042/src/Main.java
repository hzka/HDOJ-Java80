import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line = sc_01.nextInt();
        for(int i =0;i<line;i++){
            int toll_station = sc_01.nextInt();
            int total_goat = 3;
            for(int j = 0;j<toll_station;j++){
                total_goat = (total_goat - 1) *2;
            }
            System.out.println(total_goat);
        }

    }
}
