package Hw3;
public class hw4 {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        int sum=0;

        for (int i=0;i<=100;i++){
            if(i%5==0){
                sum += i;
            }
        }
        System.out.println("tổng các số chia hết cho 5 từ 0 -> 100: " +sum);
        return sum;
    }
}
