/**
 * Created by yunxi on 16/3/3.
 */
public class Hello {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            int b;
            int c;
            b = a % 2;
            c = a % 3;
            if (b == 0 || c == 0) {
                System.out.println(a);
            }
            print(a);
        }
    }
    static void print(Object object) {
        System.out.println(object);
    }
}






