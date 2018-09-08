

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            //获取输入的字符串
            String date = sc_01.next();
            //获取两次出现/的位置,并截取相应字符串。
            int t1 = date.indexOf("/");
            int t2 = date.lastIndexOf("/");
            //获取月日字符串
            String year = date.substring(0, t1);
            String month = date.substring(t1 + 1, t2);
            String day = date.substring(t2 + 1, date.length());
            //将其合并为数字
            int year1 = Integer.parseInt(year);
            int month1 = Integer.parseInt(month);
            int day1 = Integer.parseInt(day);
            int monthdays = 0;
            //使用两个数组将起存起来
            int []DateFormat1=new int[]{0,31,28,31,30,31,30,31,31,30,31,30};
            int []DateFormat2=new int[]{0,31,29,31,30,31,30,31,31,30,31,30};
            //判断是闰年。节省了很多代码不是吗
            if(year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0){
               for(int i = 0;i<month1;i++){
                   monthdays+=DateFormat2[i];
               }
            }else{
                for(int i = 0;i<month1;i++){
                    monthdays+=DateFormat1[i];
                }
            }
//            monthdays+=day1;
//            switch (month1) {
//                case 1:
//                    monthdays = 0;
//                    break;
//                case 2:
//                    monthdays = 31;
//                    break;
//                case 3:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29;
//                    } else {
//                        monthdays = 31 + 28;
//                    }
//                    break;
//                case 4:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31;
//                    } else {
//                        monthdays = 31 + 28 + 31;
//                    }
//                    break;
//                case 5:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31 + 30;
//                    } else {
//                        monthdays = 31 + 28 + 31 + 30;
//                    }
//                    break;
//                case 6:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31 + 30 + 31;
//                    } else {
//                        monthdays = 31 + 28 + 31 + 30 + 31;
//                    }
//                    break;
//                case 7:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31 + 30 + 31 + 30;
//                    } else {
//                        monthdays = 31 + 28 + 31 + 30 + 31 + 30;
//                    }
//                    break;
//                case 8:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31 + 30 + 31 + 30 + 31;
//                    } else {
//                        monthdays = 31 + 28 + 31 + 30 + 31 + 30 + 31;
//                    }
//                    break;
//                case 9:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
//                    } else {
//                        monthdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
//                    }
//                    break;
//                case 10:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
//                    } else {
//                        monthdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
//                    }
//                    break;
//                case 11:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
//                    } else {
//                        monthdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
//                    }
//                    break;
//                case 12:
//                    if (year1 % 4 == 0 && year1 % 100 != 0 || year1 %400 ==0) {
//                        monthdays = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
//                    } else {
//                        monthdays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
//                    }
//                    break;
//                default:
//                    System.err.print("error");
//            }
            System.out.println(monthdays + day1);
        }
    }
}
