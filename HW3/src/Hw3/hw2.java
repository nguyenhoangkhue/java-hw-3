package Hw3;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("nhap vao chuoi ki tu bat ki:");
        String para= sc.nextLine();
        String para1=para+"-";
        String repeated=para1.repeat(10);
        System.out.println(repeated.substring(0,repeated.length()-1));

    }
}
