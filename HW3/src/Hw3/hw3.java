package Hw3;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        System.out.println(repeated());

    }
    public static String repeated(){
        Scanner sc=new Scanner(System.in);

        System.out.println("nhap vao chuoi ki tu bat ki:");
        String para= sc.nextLine();
        String para1=para+"-";
        System.out.println("nhap vao so lan lap lai");
        int times= sc.nextInt();
        String para2=para1.repeat(times);
        String para3= para2.substring(0,para2.length()-1);
        return para3;
    }
}
