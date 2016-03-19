import javax.print.attribute.IntegerSyntax;

/**
 * Created by yunxi on 16/3/19.
 */
public class practice101 {
    public static void main(String[] args) {
        int a = 33;
        print(Integer.toBinaryString(a));
        print(Integer.toOctalString(a));
        print(Integer.toHexString(a));
    }
    static void print(Object object){
        System.out.println(object);}
}

