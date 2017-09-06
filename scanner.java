import java.util.Scanner;

public class scanner{
	public static void main(String[] args){
		System.out.println("Enter an integer:");
		Scanner t = new Scanner(System.in);
		int s = t.nextInt();
		int sum = 0;
		for (int i=1;i<=s;i++){
			sum += i;
		}
		System.out.println("The sum from 1 to "+s+" is "+sum);	
	}
}

