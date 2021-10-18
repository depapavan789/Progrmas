import java.util.Scanner;
public class Primenumbers {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scn.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not a prime");
				return;
			}
		}
		System.out.println("It is a prime");

	}

}
