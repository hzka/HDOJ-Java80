import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        for(int num = 2991;num<10000;num++){
            //计算十进制下的和。
            int result_10 = num/1000+num%1000/100+num%1000%100/10+num%1000%100%10;
            //将十进制转成十六进制。
            String result_01 = Integer.toHexString(num);
            //计算十六进制的和
            int result_16 = 0;
            for(int i = 0 ;i<result_01.length();i++){
                //获得该位数的值
                switch(String.valueOf(result_01.charAt(i))){
                    case "a":
                        result_16 += 10;break;
                    case "b":
                        result_16 += 11;break;
                    case "c":
                        result_16 += 12;break;
                    case "d":
                        result_16 += 13;break;
                    case "e":
                        result_16 += 14;break;
                    case "f":
                        result_16 += 15;break;
                    default:
                        result_16 += Integer.parseInt(String.valueOf(result_01.charAt(i)));
                        break;
                }
            }
            //十二进制的字符串
            int result_12 = num/1728+num%1728/144+num%1728%144/12+num%1728%144%12;
            //判断结果输出。
            if(result_10 == result_12&& result_10 == result_16){
                System.out.println(num);
            }
        }
    }
}
