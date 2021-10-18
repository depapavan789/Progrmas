public class Reversedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456;
		int m=0;
		while(n>0)
		{
			m=(m*10)+(n%10);
			n/=10;
		}
	System.out.println(m);
}
}
