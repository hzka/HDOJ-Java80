import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for(int i = 0;i<line_num;i++){
            String init_str = sc_01.next();
            System.out.println("6"+init_str.substring(6,11));//从下表为0的开始计数，下标为6，长度为5
        }
    }
}
