package Hw3;
import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {

        System.out.println("bán kính của hình cầu là: "+V());
    }
    public static double V(){
        Scanner sc= new Scanner(System.in);

        System.out.println("nhập bán kính của hình cầu");
        double r= sc.nextDouble();
        double volume= (4*3.14*r*r*r)/3;
        return volume;
    }
}
