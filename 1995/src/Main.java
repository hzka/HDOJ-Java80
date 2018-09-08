import java.util.*;
public class Main {
    public static int counting = 0;

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for(int i = 0;i<line_num;i++){
            int all_plate = sc_01.nextInt();
            int point_plate = sc_01.nextInt();
            Stack<Integer> a_pillar = new Stack<Integer>();
            Stack<Integer> b_pillar = new Stack<Integer>();
            Stack<Integer> c_pillar = new Stack<Integer>();
            for(int j=all_plate;j>0;j--){
                a_pillar.push(j);
            }
            //从a移动到c,以b为辅助。
            move(all_plate,a_pillar,b_pillar,c_pillar,point_plate);
            System.out.println(counting);
        }
    }
    //但时间复杂度太大，递归本来就大，故而寻找其中规律。
    private static void move(int all_plate, Stack<Integer> a_pillar, Stack<Integer> b_pillar, Stack<Integer> c_pillar,int point_plate) {
       if(all_plate == 0 ) return;
       move(all_plate-1,a_pillar,c_pillar,b_pillar,point_plate);
       int move_num = a_pillar.pop();
       if(move_num == point_plate){
           counting++;
       }
       c_pillar.push(move_num);
       move(all_plate-1,b_pillar,a_pillar,c_pillar,point_plate);
    }
}
