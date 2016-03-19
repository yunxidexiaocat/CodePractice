package javaimpatient.chapter1;

import java.util.Scanner;

/**
 * Created by yunxi on 16/3/19.
 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        print("请输入3个数字(以空格隔开)");
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();
        int a = firstNumber;
        int b = secondNumber;
        int c = thirdNumber;

        if (a >= b && a >= c) {
            print(a);
        } else if (b > a && b >= c) {
            print(b);
        } else {
            print(c);
        }
        print(Math.max(Math.max(a, b), c));
    }

    static void print(Object object) {
        System.out.println(object);
    }
}

