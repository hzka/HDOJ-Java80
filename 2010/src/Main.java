import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int begin_num = sc_01.nextInt();
            int end_num = sc_01.nextInt();
            ArrayList<Integer> arrayList01 = new ArrayList<Integer>();
            for (int i = begin_num; i <= end_num; i++) {
                int Percentile = i / 100;
                int Tenth_place = i % 100 / 10;
                int Quota = i % 100 % 10;
                if(i == Math.pow(Percentile,3)+Math.pow(Tenth_place,3)+Math.pow(Quota,3)){
                    arrayList01.add(i);
                }
            }
            if(arrayList01.size() == 0 ){
                 System.out.println("no");
            }else{
                for(int i= 0;i<arrayList01.size()-1;i++){
                    System.out.print(arrayList01.get(i)+" ");
                }
                System.out.println(arrayList01.get(arrayList01.size()-1));
            }
        }
    }
}
