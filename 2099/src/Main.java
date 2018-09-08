import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num_1 = sc_01.nextInt();
            int num_2 = sc_01.nextInt();
            ArrayList<Integer> arrayList_01 = new ArrayList<Integer>();
            //判断并放进动态数组里
            if (num_1 != 0 && num_2 != 0) {
                for (int i = 0; i < 100; i++) {
                    if ((num_1 * 100 + i) % num_2 == 0) {
                        arrayList_01.add(i);
                    }
                }
            } else {
                break;
            }
            //输出该数组内容
            for(int i = 0;i<arrayList_01.size()-1;i++){
                if(arrayList_01.get(i)<10){
                    System.out.print("0"+arrayList_01.get(i)+" ");
                }else{
                    System.out.print(arrayList_01.get(i)+" ");
                }
            }
            if(arrayList_01.get(arrayList_01.size()-1)<10){
                System.out.println("0"+arrayList_01.get(arrayList_01.size()-1));
            }else{
                System.out.println(arrayList_01.get(arrayList_01.size()-1));
            }
        }
    }
}
