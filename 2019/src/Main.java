import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        //以后麻烦用Arraylist存，这样很low，谢谢。
        while (sc_01.hasNext()){
            int num_coun = sc_01.nextInt();
            int Insert_num = sc_01.nextInt();
            int []num = new int[num_coun];
            int flag = 0;
            if(num_coun == 0 && Insert_num ==0){break;}
            else {
                for(int i = 0;i<num_coun;i++){
                    num[i] = sc_01.nextInt();
                    if(Insert_num>=num[i]){
                        flag = i;
                    }
                }
                for(int i = 0;i<num_coun-1;i++){
                    if(i!=flag){
                        System.out.print(num[i]+" ");
                    }else{
                        System.out.print(num[i]+" ");
                        System.out.print(Insert_num+" ");
                    }
                }
                if(flag!=(num_coun-1)) {
                    System.out.println(num[num_coun - 1]);
                }else{
                    System.out.println(Insert_num);
                } }
        }
    }
}
