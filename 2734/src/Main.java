import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            String newString = sc_01.nextLine();
            int result = 0;
            if (!newString.equals("#")) {
                int[] bytesString = new int[newString.length()];
                for (int i = 0; i < bytesString.length; i++) {
                    bytesString[i] = newString.charAt(i);
                    if(bytesString[i] > 96){
                        bytesString[i] -= 96;
                    }else if(bytesString[i] == 32){
                        bytesString[i] = 0;
                    }else{
                        bytesString[i]-=64;
                    }
                    result+=(bytesString[i]*(i+1));
                }
                System.out.println(result);
            } else {
                break;
            }
        }
    }
}
