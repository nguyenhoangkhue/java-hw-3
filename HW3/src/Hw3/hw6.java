package Hw3;

public class hw6 {
    public static void main(String[] args) {
        System.out.println(solution());
        }
        public static int solution(){
            for (int i = 0; i <= 100; i++) {
                if (i%5==0&&i%3==0) {
                    System.out.println("FizzBuzz");
                    continue;
                }
                if (i%3==0){
                    System.out.println("Fizz");
                    continue;
                }
                if (i%5==0){
                    System.out.println("Buzz");
                    continue;
                }
                if (i%5!=0&&i%3!=0){
                    System.out.println(i);
                }
            }
            return 0;
        }
    }
