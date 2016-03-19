import javax.print.attribute.IntegerSyntax;

/**
 * Created by yunxi on 16/3/19.
 */
public class practice101 {
    public static void main(String[] args) {
        int a=(int)(Math.random()*200);
        print(a);
        print(Integer.toBinaryString(a));
        print(Integer.toOctalString(a));
        print(Integer.toHexString(a));
    }
    static void print(Object object){
        System.out.println(object);}
}

