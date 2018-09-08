import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num = sc_01.nextInt();
            int jinzhi = sc_01.nextInt();
            ArrayList<String> arrayList_01 = new ArrayList<String>();
            if (num >= 0) {
                while (num / jinzhi != 0) {
                    int tmp = num % jinzhi;
                    num = num / jinzhi;
                    arrayList_01.add(checknum(tmp));
                }
                //末尾的数加进去
                arrayList_01.add(checknum(num % jinzhi));
                for (int j = arrayList_01.size() - 1; j >= 0; j--) {
                    System.out.print(arrayList_01.get(j));
                }
                System.out.println();
            }else{

                while (Math.abs(num) / jinzhi != 0) {
                    int tmp = Math.abs(num) % jinzhi;
                    num = Math.abs(num) / jinzhi;
                    arrayList_01.add(checknum(tmp));
                }
                //末尾的数加进去
                arrayList_01.add(checknum(Math.abs(num) % jinzhi));
                arrayList_01.add("-");
                for (int j = arrayList_01.size() - 1; j >= 0; j--) {
                    System.out.print(arrayList_01.get(j));
                }

                System.out.println();
            }
        }
    }

    private static String checknum(int tmp) {
        if (tmp < 10) {
            return String.valueOf(tmp);
        } else {
            String Greater_10 = new String();
            switch (tmp) {
                case 10:
                    Greater_10 = "A";
                    break;
                case 11:
                    Greater_10 = "B";
                    break;
                case 12:
                    Greater_10 = "C";
                    break;
                case 13:
                    Greater_10 = "D";
                    break;
                case 14:
                    Greater_10 = "E";
                    break;
                case 15:
                    Greater_10 = "F";
                    break;
                default:
                    break;
            }
            return Greater_10;
        }
    }
}
