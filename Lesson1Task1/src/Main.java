import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Введите количество чисел Фибоначчи ... ");
        Scanner in = new Scanner(System.in);
        int iterations = in.nextInt();
        long  fibVector[] = new long[iterations];
        for(int i=0;i<iterations;i++){
            if((i==0)||(i==1)) fibVector[i] = 1;
            else{
                fibVector[i]=fibVector[i-1]+fibVector[i-2];
            }
            System.out.print(fibVector[i]+" ");
        }
    }
}
