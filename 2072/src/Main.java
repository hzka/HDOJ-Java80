import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            String strings_01 = sc_01.nextLine();
            //判断有没有#
            boolean flag = false;
            if (strings_01.contains("#")) {
                flag = true;
            }
            if (flag == true) break;
            //进行正常判断
            int test_result = checkZimu(strings_01);
            System.out.println(test_result);

        }
    }

    private static int checkZimu(String strings_01) {
        String[] words = strings_01.split(" ");
        ArrayList<String> arrayList_01 = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (!arrayList_01.contains(words[i])) {
                arrayList_01.add(words[i]);
            }
        }
        if(arrayList_01.contains("")){
            return arrayList_01.size()-1;
        }else{
            return arrayList_01.size();
        }
    }
}
