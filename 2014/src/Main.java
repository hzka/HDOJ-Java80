import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int rater_num = sc_01.nextInt();
            int[] score = new int[rater_num];
            for (int i = 0; i < score.length; i++) {
                score[i] = sc_01.nextInt();
            }
            //去掉最低分。
            score = removeMin(score);
            //去掉最高分。
            score = removeMax(score);
            int result = 0;
            for (int i = 0; i < score.length; i++) {
//                if (score[i] != -1)
                    result += score[i];
            }
            System.out.println(String.format("%.2f",(double)result/(score.length)));
        }

    }

    private static int[] removeMax(int[] score) {
        int max = score[0];
        int flag = 0;
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                flag = i;
            }
        }
        score[flag] = score[score.length-1];
        score = Arrays.copyOf(score,score.length-1);
//        score[flag] = -1;
        return score;
    }

    private static int[] removeMin(int[] score) {
        int min = score[0];
        int flag = 0;
        for (int i = 1; i < score.length; i++) {
            if (score[i] < min) {
                min = score[i];
                flag = i;
            }
        }
//        score[flag] = -1;
        //对数组进行缩容
        score[flag] = score[score.length-1];
        score = Arrays.copyOf(score,score.length-1);
        return score;
    }
}
