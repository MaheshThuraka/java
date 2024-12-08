
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base=in.nextInt();
        System.out.print("Enter the height: ");
        int height=in.nextInt();
        int area=base*height/2;
        System.out.println("area of triangle is:"+area);
    }
}
