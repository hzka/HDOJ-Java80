

import java.util.*;

public class Main {

    static final double PI = 3.1415927;

    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);
        while (scanner01.hasNext()) {
            double radius = scanner01.nextDouble();
            System.out.println(String.format("%.3f", 4.0 / 3 * PI * Math.pow(radius, 3)));
        }
    }
}