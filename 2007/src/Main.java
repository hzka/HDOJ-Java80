import java.util.Scanner;
//唉。。。。都听不懂人话了，没理解题意。，参考网上代码重新写的，仅此一次
public class Main{
    public static void main(String[] args){
        Scanner sc_01 = new Scanner(System.in);

        while(sc_01.hasNext()){
            int number_01 = sc_01.nextInt();
            int number_02 = sc_01.nextInt();
            // 还要考虑大于的情况。充分考虑一切情况。
            if(number_01>number_02){
                int tmp = number_01;
                number_01 = number_02;
                number_02 = tmp;
            }
            int result1 = 0,result2 = 0;
            for(int i = number_01;i<=number_02;i++){
                if(i%2==0){
                    result1+=Math.pow(i,2);
                }else{
                    result2+=Math.pow(i,3);
                }
            }
            System.out.println(result1+" "+result2);
        }
    }
}