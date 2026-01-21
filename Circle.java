import java.util.Scanner;
public class Circle {
    public static void main(String []args){
        Scanner sca = new Scanner(System.in);
        System.out.println("Please Enter radius of the circle.");
        float radius = sca.nextFloat();
        float pi = 3.14159f;
        float result = pi * radius * radius;
        System.out.printf("Circle area %.5f",result);
        sca.close();
    }
}