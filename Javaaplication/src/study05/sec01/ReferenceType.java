package study05.sec01;

import java.util.Scanner;

public class ReferenceType {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ReferenceType obj = new ReferenceType();
        obj.process();
    }

    public void process() {
        method3();
        method2();
    }

    public void method3() {
        int a = 10;
        // 1
        int b = 11;
        // 2
        if (a == 10) {
            String c = "abc";
            // 3
            int sum = 0;

            // 4
            for (int i = 0; i < 3; i++) {
                // 5
                int d = 0;
                // 6
                sum += i;
            }

            if (sum == 3) {
                for (int i = 0; i < 3; i++) {
                    // 7
                    sum += i;
                }
            }
        }
    }

    public void method2() {
        int a = 10;
        // 1
        if (a == 0) {
            int b = 11;
            // 2
        } else {
            int c = 12;
            // 3
            if (c++ + a == 22) {
                // 4
                int d = 13;
                // 5
            }
            // 6
            int e = 14;
            // 7
        }
    }
}
