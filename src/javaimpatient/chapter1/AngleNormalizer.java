package javaimpatient.chapter1;

/**
 * Created by yunxi on 16/3/19.
 */
import java.util.Scanner;
public class AngleNormalizer {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        print("请输入角度?");
        int Angle = in.nextInt();
        print(Angle%360);
        print(Math.floorMod(Angle,360));
    }
    static void print(Object object){
        System.out.println(object);
    }
}
