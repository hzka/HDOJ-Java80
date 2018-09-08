//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc_01 = new Scanner(System.in);
//        int testing_num = sc_01.nextInt();
//        int fa_fen = sc_01.nextInt();
//        ArrayList<Score_stu> arrayList_01 = new ArrayList<Score_stu>();
//        String[] Origin_value = new String[6 * (testing_num + 1)];
//        //输入原始数据。
//        for (int i = 0; i < 6 * (testing_num + 1); i++) {
//            Origin_value[i] = sc_01.next();
//        }
//        //计算答题数、总分。
//        for (int i = 0; i < 6; i++) {
//            Score_stu score_stu_01 = new Score_stu();
//            score_stu_01.stu_name = Origin_value[i * (testing_num + 1)];
//            //答题数，总分。
//            int counting = 0, total_score = 0;
//            for (int j = (i * (testing_num + 1) + 1); j <= (i * (testing_num + 1) + testing_num); j++) {
//                if (Origin_value[j].contains("(")) {
//                    counting++;
//                    int left_loc = Origin_value[j].indexOf("(");
//                    int right_loc = Origin_value[j].indexOf(")");
//                    total_score += (Integer.parseInt(Origin_value[j].substring(0, left_loc)) +
//                            Integer.parseInt(Origin_value[j].substring(left_loc + 1, right_loc)) * fa_fen);
//                } else if (Integer.parseInt(Origin_value[j]) > 0) {
//                    counting++;
//                    total_score += Integer.parseInt(Origin_value[j]);
//                }
//            }
//            //将结果进行赋值
//            score_stu_01.stu_jietishu = counting;
//            score_stu_01.stu_score = total_score;
//            //添加到动态数组中
//            arrayList_01.add(score_stu_01);
//            //进行排序
//        }
//        //按照计题数大小排序
//        for (int i = 0; i < arrayList_01.size() - 1; i++) {
//            for (int j = i + 1; j < arrayList_01.size(); j++) {
//                if (arrayList_01.get(j).stu_jietishu > arrayList_01.get(i).stu_jietishu) {
//                    //暂存该大数组
//                    Score_stu score_stu_tmp = new Score_stu();
//                    score_stu_tmp.stu_name = arrayList_01.get(j).stu_name;
//                    score_stu_tmp.stu_jietishu = arrayList_01.get(j).stu_jietishu;
//                    score_stu_tmp.stu_score = arrayList_01.get(j).stu_score;
//                    //将小一点的数放在后面
//                    arrayList_01.get(j).stu_name = arrayList_01.get(i).stu_name;
//                    arrayList_01.get(j).stu_jietishu = arrayList_01.get(i).stu_jietishu;
//                    arrayList_01.get(j).stu_score = arrayList_01.get(i).stu_score;
//                    //将大数放在前面
//                    arrayList_01.get(i).stu_name = score_stu_tmp.stu_name;
//                    arrayList_01.get(i).stu_jietishu = score_stu_tmp.stu_jietishu;
//                    arrayList_01.get(i).stu_score = score_stu_tmp.stu_score;
//                }
//            }
//        }
//        //按照分数从小到大排序
//        for (int i = 0; i < arrayList_01.size() - 1; i++) {
//            for (int j = i + 1; j < arrayList_01.size(); j++) {
//                if (arrayList_01.get(j).stu_jietishu == arrayList_01.get(i).stu_jietishu) {
//                    if (arrayList_01.get(j).stu_score < arrayList_01.get(i).stu_score) {
//                        //暂存该大数组
//                        Score_stu score_stu_tmp = new Score_stu();
//                        score_stu_tmp.stu_name = arrayList_01.get(j).stu_name;
//                        score_stu_tmp.stu_jietishu = arrayList_01.get(j).stu_jietishu;
//                        score_stu_tmp.stu_score = arrayList_01.get(j).stu_score;
//                        //将小一点的数放在后面
//                        arrayList_01.get(j).stu_name = arrayList_01.get(i).stu_name;
//                        arrayList_01.get(j).stu_jietishu = arrayList_01.get(i).stu_jietishu;
//                        arrayList_01.get(j).stu_score = arrayList_01.get(i).stu_score;
//                        //将大数放在前面
//                        arrayList_01.get(i).stu_name = score_stu_tmp.stu_name;
//                        arrayList_01.get(i).stu_jietishu = score_stu_tmp.stu_jietishu;
//                        arrayList_01.get(i).stu_score = score_stu_tmp.stu_score;
//                        //按照字典序排名
//                    }
//                }
//            }
//        }
//        //按照字典序输出
//        for (int i = 0; i < arrayList_01.size() - 1; i++) {
//            for (int j = i + 1; j < arrayList_01.size(); j++) {
//                if (arrayList_01.get(j).stu_score == arrayList_01.get(i).stu_score) {
//                    if (arrayList_01.get(j).stu_jietishu == arrayList_01.get(i).stu_jietishu) {
//                        {
//                            if (arrayList_01.get(j).stu_name.charAt(0) < arrayList_01.get(i).stu_name.charAt(0)) {
//                                //暂存该大数组
//                                Score_stu score_stu_tmp = new Score_stu();
//                                score_stu_tmp.stu_name = arrayList_01.get(j).stu_name;
//                                score_stu_tmp.stu_jietishu = arrayList_01.get(j).stu_jietishu;
//                                score_stu_tmp.stu_score = arrayList_01.get(j).stu_score;
//                                //将小一点的数放在后面
//                                arrayList_01.get(j).stu_name = arrayList_01.get(i).stu_name;
//                                arrayList_01.get(j).stu_jietishu = arrayList_01.get(i).stu_jietishu;
//                                arrayList_01.get(j).stu_score = arrayList_01.get(i).stu_score;
//                                //将大数放在前面
//                                arrayList_01.get(i).stu_name = score_stu_tmp.stu_name;
//                                arrayList_01.get(i).stu_jietishu = score_stu_tmp.stu_jietishu;
//                                arrayList_01.get(i).stu_score = score_stu_tmp.stu_score;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < arrayList_01.size() - 1; i++) {
//            for (int j = i + 1; j < arrayList_01.size(); j++) {
//                if (arrayList_01.get(j).stu_score == arrayList_01.get(i).stu_score) {
//                    if (arrayList_01.get(j).stu_jietishu == arrayList_01.get(i).stu_jietishu) {
//                        {
//                            if (arrayList_01.get(j).stu_name.charAt(0) == arrayList_01.get(i).stu_name.charAt(0)) {
//                                if (arrayList_01.get(j).stu_name.charAt(1) < arrayList_01.get(i).stu_name.charAt(1)) {
//                                    //暂存该大数组
//                                    Score_stu score_stu_tmp = new Score_stu();
//                                    score_stu_tmp.stu_name = arrayList_01.get(j).stu_name;
//                                    score_stu_tmp.stu_jietishu = arrayList_01.get(j).stu_jietishu;
//                                    score_stu_tmp.stu_score = arrayList_01.get(j).stu_score;
//                                    //将小一点的数放在后面
//                                    arrayList_01.get(j).stu_name = arrayList_01.get(i).stu_name;
//                                    arrayList_01.get(j).stu_jietishu = arrayList_01.get(i).stu_jietishu;
//                                    arrayList_01.get(j).stu_score = arrayList_01.get(i).stu_score;
//                                    //将大数放在前面
//                                    arrayList_01.get(i).stu_name = score_stu_tmp.stu_name;
//                                    arrayList_01.get(i).stu_jietishu = score_stu_tmp.stu_jietishu;
//                                    arrayList_01.get(i).stu_score = score_stu_tmp.stu_score;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        //最后进行输出
//        for (int i = 0; i < arrayList_01.size(); i++) {
//            System.out.printf("%-10s %2d %4d", arrayList_01.get(i).stu_name,arrayList_01.get(i).stu_jietishu,arrayList_01.get(i).stu_score);
//            System.out.println();
//        }
//    }
//
//    private static class Score_stu {
//        private String stu_name;
//        private int stu_jietishu;
//        private int stu_score;
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static Scanner scanner;
    static List<Main.person> list;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int probrom = scanner.nextInt();// 题目数量
        int pubScore = scanner.nextInt();// 单位罚分
        list = new ArrayList<Main.person>();
        while (scanner.hasNext()) {
            int ac = 0;// ac题目个数
            int score = 0;// 罚分
            String name = "";// 姓名

            String strings[] = new String[probrom + 1];
            // 输入一个考生的信息
            // strings[0]是名字
            for (int i = 0; i < strings.length; i++) {
                strings[i] = scanner.next();
            }
            name = strings[0];
            // 计算AC题目个数
            for (int i = 1; i < strings.length; i++) {
                char ch = strings[i].charAt(0);
                if (ch >= '1' && ch <= '9') {
                    ac++;
                    try {
                        score += Integer.parseInt(strings[i]);
                    } catch (Exception e) {
                    }
                }
            }
            // 计算分数
            for (int i = 1; i < strings.length; i++) {
                // 第i个元素的 最后一个字符是否为')'// 也可以使用contains
                char ch = strings[i].charAt(strings[i].length() - 1);
                if (ch == ')') {
                    String[] split = strings[i].split("[(,)]");
                    score += pubScore * Integer.parseInt(split[1]) + Integer.parseInt(split[0]);
                }
            }
            Main p = new Main();
            person per = p.new person(ac, score, name);
            list.add(per);
        }
        listSort();
        for (person person : list) {
            System.out.printf("%-10s %2d %4d", person.getName(), person.getAcNum(), person.getScore());
            System.out.println();
        }

    }

    // 排序
    private static void listSort() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                String iName = list.get(i).getName();
                String jName = list.get(j).getName();
                int iAc = list.get(i).getAcNum();
                int jAc = list.get(j).getAcNum();
                int iScore = list.get(i).getScore();
                int jScore = list.get(j).getScore();

                if (iAc < jAc) {
                    sort(i, j);
                } else if (iAc == jAc) {
                    if (iScore > jScore) {
                        sort(i, j);
                    } else if (iScore == jScore) {
                        int compareTo = iName.compareTo(jName);
                        if (compareTo > 0) {
                            sort(i, j);
                        }
                    }
                }
            }
        }
    }

    // 交换
    public static void sort(int i, int j) {
        int temp = list.get(i).getAcNum();
        list.get(i).setAcNum(list.get(j).acNum);
        list.get(j).setAcNum(temp);

        temp = list.get(i).getScore();
        list.get(i).setScore(list.get(j).score);
        list.get(j).setScore(temp);

        String string = list.get(i).getName();
        list.get(i).setName(list.get(j).getName());
        list.get(j).setName(string);
    }

    class person {
        int acNum;
        int score;
        String name;

        public person(int acNum, int score, String name) {
            super();
            this.acNum = acNum;
            this.score = score;
            this.name = name;
        }

        public void setAcNum(int acNum) {
            this.acNum = acNum;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAcNum() {
            return acNum;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }

    }
}