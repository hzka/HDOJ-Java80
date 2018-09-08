import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc_01= new Scanner(System.in);
        while (sc_01.hasNext()){
            String strings = sc_01.next();
            int max = strings.charAt(0);
            //获取字符串的Max值
            for(int i = 0;i<strings.length();i++){
                if(strings.charAt(i)>max){
                    max = strings.charAt(i);
                }
            }
            //输出max
            String outputstring=new String();
            for(int i = 0;i<strings.length();i++){
                outputstring+=strings.charAt(i);
                if(strings.charAt(i)==max){
                    outputstring+="(max)";
                }
            }
            System.out.println(outputstring);
        }
    }
    }
