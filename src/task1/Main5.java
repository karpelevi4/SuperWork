package task1;

import java.text.DecimalFormat;

public class Main5 {
    public static void main(String[] args) {
        for (double i = 1; i <= 10; i++)
            System.out.printf("%-8s",new DecimalFormat("0.000").format(1 / i));
    }
}
