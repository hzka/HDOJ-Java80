import java.util.*;

public class Main {

    public static void main(String[] args) {
        //最后一天是第几天。
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int day = sc_01.nextInt();
            int All_Peach = 1;
            for (int i = 1; i < day; i++)
                All_Peach = (All_Peach+1)*2;
            System.out.println(All_Peach);
        }
    }
}
