package javaimpatient.chapter1;

//import javax.print.attribute.IntegerSyntax;
/**
 * Created by yunxi on 16/3/19.
 */
import java.util.Scanner;
public class BasePrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("请输入一个数字");
        int  number = input.nextInt();
        print(number);
        print(Integer.toBinaryString(number));
        print(Integer.toOctalString(number));
        print(Integer.toHexString(number));
    }
    static void print(Object object){
        System.out.println(object);}
}

