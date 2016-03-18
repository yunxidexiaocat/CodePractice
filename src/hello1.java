/**
 * Created by yunxi on 16/3/17.
 */
public class hello1 {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                if(a*b < 10){
                System.out.print(a+"×"+b+"="+" "+a*b+" ");
            }
                else if(a*b >= 10) {
                    System.out.print(a + "×" + b + "=" + a * b + " ");
                }
            }
            System.out.println();
        }
    }
}
