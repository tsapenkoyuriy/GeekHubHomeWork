import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static String erlString (String str){
		int count = 1;
		String result="";
		char temp=str.charAt(0);
		for(int i=1;i<str.length();++i){
			if (str.charAt(i)!=' ')
			if(str.charAt(i)==temp){
				count++;
				temp=str.charAt(i);
			}
			else{
				if (count>1) result+=count;
				result+= String.valueOf(temp);
				count=1;
				temp=str.charAt(i);
			}
		
		}
		if(count>1) result+=count;
		result+=String.valueOf(temp);
		return result;
	}
	public static void main(String[] args){
		System.out.println("¬ведите строку:");
		Scanner in = new Scanner(System.in);
		String myString = in.nextLine();
		System.out.println("result: "+erlString(myString));
	}
}
