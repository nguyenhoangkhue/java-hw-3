package Hw3;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {

        System.out.println(repeated());


    }
    public static String repeated(){
        Scanner sc=new Scanner(System.in);

        System.out.println("nhap vao 1 chuoi bat ki");
        String para=sc.nextLine();
        String para1=para.repeat(10);
        return para1;
    }


}
