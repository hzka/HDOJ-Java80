import java.text.NumberFormat;
import java.util.*;

public class Main {
    //贪心算法解决。但解决错误。
    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int all_money = sc_01.nextInt();
            int al_school = sc_01.nextInt();
            SchMon[] schMons = new SchMon[al_school];
            //（1）必须要将每个类初始化啊。
            for (int i = 0; i < al_school; i++) {
                schMons[i] = new SchMon();
            }
            if (all_money != 0 && al_school != 0) {
                //（2）将Price和概率输入。
                for (int i = 0; i < al_school; i++) {
                    schMons[i].price = sc_01.nextInt();
                    schMons[i].percent = sc_01.nextDouble();
                    schMons[i].ratio = schMons[i].percent / schMons[i].price;
                }
                double tmp = 0;
                //（3）比较ratio大小,按照Ratio大小从大到大小进行排序。
                SchMon tmp_Sch = new SchMon();
                for (int i = 0; i < al_school - 1; i++) {
                    tmp = schMons[i].ratio;
                    for (int j = i; j < al_school; j++) {
                        if (tmp < schMons[j].ratio) {
                            tmp_Sch = schMons[i];
                            schMons[i] = schMons[j];
                            schMons[j] = tmp_Sch;
                        }
                    }
                }
                //（4）按照排序结果，结合其费用，选择相应的方案
                int all_price = 0;
                int j = 0;
                for(int i = 0;i<al_school;i++){
                    if((all_price += schMons[i].price) <= all_money){
                        j++;
                    }
                }
                //(5)计算出至少一个发生的概率。
                double all_percent = 1;
                for (int i = 0; i < j; i++) {
                    all_percent *= (1 - schMons[i].percent);
                }
                NumberFormat nt = NumberFormat.getPercentInstance();//获取格式化对象
                nt.setMinimumFractionDigits(1);//设置百分数精确度2即保留两位小数
                String result = nt.format(1-all_percent);
                //（6）进行输出
                System.out.println(result);
            } else {
                break;
            }
        }
    }

    public static class SchMon {
        int price;
        double percent;
        double ratio;
    }
}

