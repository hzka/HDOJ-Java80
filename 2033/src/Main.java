import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int num_line = sc_01.nextInt();
        for (int i = 0; i < num_line; i++) {
            int []time = new int[6];
            for(int j = 0;j<time.length;j++){
                time[j] = sc_01.nextInt();
            }
            int allseconds = (time[0]+time[3])*3600+(time[1]+time[4])*60+(time[2]+time[5]);
            int result_hour = allseconds / 3600;
            int reuslut_min = allseconds % 3600 / 60;
            int result_seconds = allseconds %3600 %60;
            System.out.println(result_hour+" "+reuslut_min+" "+result_seconds);
        }
    }
}
