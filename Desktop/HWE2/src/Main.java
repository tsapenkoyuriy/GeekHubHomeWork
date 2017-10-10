import java.util.Scanner;

public class Main {
    public static int factorial(int number){
        int fact = 1;
        if (number>0){
            if (number>10) {
                System.out.println("Calculating process will take some time");
            }

            for(int i=1;i<=number;i++){
                fact*=i;
            }
            return fact;
        }
        else return 0;
    }
    public static void main(String[] args){
       System.out.print("Введите число от которого вы желаете получчть факториал:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("факториал числа "+number+": "+ factorial(number));
    }
}
