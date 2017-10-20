import java.util.Scanner;

public class Main {
    private static String archivate(String str){
       int count=1;
       String result ="";
       result+=str.substring(0,0);
           for(int i=1;i<str.length();i++){
               if(str.charAt(i)==str.charAt(i-1)){
                   count++;
               }
               else {
                   if (count>1) result+=count;
                   result+=str.charAt(i-1);
                   count=1;
               }
           }
           if (count>1){
               result+=count+str.charAt(str.length()-1);
           }
           return result;
    }

    public static void main(String[] args){
        System.out.println("Введите строку, которую вы хотите архивировать");
        Scanner scan = new Scanner(System.in);
        String yourString = scan.nextLine();
        System.out.println("Archivated string:"+archivate(yourString));
    }
}
