import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int line_num = sc_01.nextInt();
            int conlmn_num = sc_01.nextInt();
            int [][]all_num = new int[line_num][conlmn_num];
            int []line_ave = new int[line_num];
            int []column_ave = new int[conlmn_num];
            //输入所有成绩
            for(int i = 0;i<line_num;i++) {
                for (int j = 0; j < conlmn_num; j++) {
                    all_num[i][j] = sc_01.nextInt();
                }
            }
            //输入并计算所有学生的成绩总和
            for(int i = 0;i<line_num;i++){
                for(int j= 0;j<conlmn_num;j++){
                    line_ave[i] += all_num[i][j];
                }
                //输出每个学生的平均成绩
                if(i<line_num-1){
                    System.out.print(String.format("%.2f",(double)(line_ave[i])/conlmn_num)+" ");
                }else{
                    System.out.println(String.format("%.2f",(double)(line_ave[i])/conlmn_num));
                }
            }
            //计算该门课的所有成绩。
            for(int i = 0;i<conlmn_num;i++){
                for(int j= 0;j<line_num;j++){
                    column_ave[i]+=all_num[j][i];
                }
                if(i<conlmn_num-1){
                    System.out.print(String.format("%.2f",(double)(column_ave[i])/line_num)+" ");
                }else{
                    System.out.println(String.format("%.2f",(double)(column_ave[i])/line_num));
                }
            }
            int counting =0;
            boolean flag = true;
            //计算大于所有平均成绩的学生
            for(int i = 0;i<line_num;i++){
                for(int j= 0;j<conlmn_num;j++){
                    if(all_num[i][j]<(double)(column_ave[j])/line_num){
                        flag =false;
                    }
                }
                if(flag) counting++;
                flag =true;
            }
            System.out.println(counting);
            System.out.println();
        }
    }
}
