import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);
        while (scanner01.hasNext()) {
            //读取字符串
            String string01 = scanner01.next();
            char[] character = new char[string01.length()];
            //将字符串切割成单个字符
            for (int i = 0; i < string01.length(); i++) {
                character[i] = string01.charAt(i);
            }
            int count = 0;
            char tmp;
            //先获取最小值，很笨的排序方法
            for (int i = 0; i < string01.length(); i++) {
//                char min = character[count];//赋给他最小值
                //双重循环进行判定
                for (int j = count; j < character.length; j++) {
                    if (character[j] < character[count]) {
                        tmp = character[count];
                        character[count] = character[j];
                        character[j] = tmp;
                    }
                }
                count++;
            }
            //按照格式输出。最后一个不加空格。
            for (int i = 0; i < character.length; i++) {
                System.out.print(character[i]);
                if(i<character.length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
