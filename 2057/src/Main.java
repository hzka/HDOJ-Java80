import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()){
            String num_01 = sc_01.next();
            String num_02 = sc_01.next();
            //1.先将字符串转为十六进制,十六进制转为十进制
            long result = Long.parseLong(num_01, 16)+ Long.parseLong(num_02,16);
            if(result>=0){
                System.out.println(Long.toHexString(result).toUpperCase());
            }else {
                System.out.println("-"+(Long.toHexString(Math.abs(result))).toUpperCase());
            }
        }
    }
}

