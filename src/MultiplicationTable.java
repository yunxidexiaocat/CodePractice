/**
 * Created by yunxi on 16/3/17.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if(i*j < 10){
                System.out.print(i+"×"+j+"="+" "+i*j+" ");
            }
                else if(i*j >= 10) {
                    System.out.print(i + "×" + j + "=" + i * j + " ");
                }
            }
            System.out.println();
        }
    }
}
