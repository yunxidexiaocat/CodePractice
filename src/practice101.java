import javax.print.attribute.IntegerSyntax;
        import java.util.Scanner;

/**
 * Created by yunxi on 16/3/19.
 */
import java.util.Scanner;
public class practice101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("请输入一个数字");
        int  number = input.nextInt();
        print(" "+number);
        print(Integer.toBinaryString(number));
        print(Integer.toOctalString(number));
        print(Integer.toHexString(number));
    }
    static void print(Object object){
        System.out.println(object);}
}

