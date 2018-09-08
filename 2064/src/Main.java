//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc_01 = new Scanner(System.in);
//        while (sc_01.hasNext()) {
//            String strings_01 = sc_01.next();
//
//            ArrayList<String> arrayList_01 = new ArrayList<String>();
//            ArrayList<String> oper = new ArrayList<String>();
//            int begin_pos = 0;
//            for (int i = 0; i < strings_01.length(); i++) {
//                if (strings_01.charAt(i) == '+' || strings_01.charAt(i) == '-'
//                        || strings_01.charAt(i) == '*' || strings_01.charAt(i) == '/') {
//                    arrayList_01.add(strings_01.substring(begin_pos, i));
//                    oper.add(String.valueOf(strings_01.charAt(i)));
//                    begin_pos = i + 1;
//                }
//                if (i == strings_01.length() - 1) {
//                    arrayList_01.add(strings_01.substring(begin_pos, strings_01.length()));
//                }
//            }
//            for (int i = 0; i < oper.size(); i++) {
//                int result = 0;
//                if (oper.get(i).equals("+")) {
//                    result = Integer.parseInt(arrayList_01.get(i)) + Integer.parseInt(arrayList_01.get(i + 1));
//                    arrayList_01.set(i, String.valueOf(result));
//                    arrayList_01.remove(arrayList_01.get(i + 1));
//                    oper.remove(i);
//                    i--;
//                } else if (oper.get(i).equals("-")) {
//                    result = Integer.parseInt(arrayList_01.get(i)) - Integer.parseInt(arrayList_01.get(i + 1));
//                    arrayList_01.set(i, String.valueOf(result));
//                    arrayList_01.remove(arrayList_01.get(i + 1));
//                    oper.remove(i);
//                    i--;
//                }
//
//            }
//            for (int i = 0; i < oper.size(); i++) {
//                int result = 0;
//                if (oper.get(i).equals("*")) {
//                    result = Integer.parseInt(arrayList_01.get(i)) * Integer.parseInt(arrayList_01.get(i + 1));
//                    arrayList_01.set(i, String.valueOf(result));
//                    arrayList_01.remove(arrayList_01.get(i + 1));
//                    oper.remove(i);
//                    i--;
//                } else if (oper.get(i).equals("/")) {
//                    result = Integer.parseInt(arrayList_01.get(i)) / Integer.parseInt(arrayList_01.get(i + 1));
//                    arrayList_01.set(i, String.valueOf(result));
//                    arrayList_01.remove(arrayList_01.get(i + 1));
//                    oper.remove(i);
//                    i--;
//                }
//            }
//            for (int i = 0; i < arrayList_01.size(); i++) {
//                System.out.println(Integer.parseInt(arrayList_01.get(i)));
//            }
//
//        }
//    }
//}

import java.util.Scanner;

/**
 * Create by tianchaoxiong on 18-9-3.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int result = getResult(string);
        System.out.println(result);
    }

    private static int getResult(String string) {
        while (true){
            int index = getOPT(string);
            if(index==-1)
                return Integer.parseInt(string);
            else {
                string = DelString(index,string);
            }
        }
    }

    private static String DelString(int index, String string) {
        int a = string.charAt(index-1)-'0';
        int b = string.charAt(index+1)-'0';
        String tmp = null;
        if(string.charAt(index)=='+')
            tmp = (a+b)+"";
        if(string.charAt(index)=='-')
            tmp = (a-b)+"";
        if(string.charAt(index)=='*')
            tmp = (a*b)+"";
        if(string.charAt(index)=='/')
            tmp = (a/b)+"";
        return string.replace(string.substring(index-1,index+2),tmp);
    }

    private static int getOPT(String string) {
        int op1 = string.indexOf("+");
        if(op1!=-1)
            return op1;
        int op2 = string.indexOf("-");
        if(op2!=-1)
            return op2;
        int op3 = string.indexOf("*");
        if(op3!=-1)
            return op3;
        int op4 = string.indexOf("/");
        return op4;
    }

}

