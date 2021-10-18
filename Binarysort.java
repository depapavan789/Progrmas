public class Binarysort {
	static int search(int []a,int e)
	{
		int f=0;
		int l=a.length-1;
		while(f<=l)
		{
			int m=(f+l)/2;
			if(e==a[m]) return m;
			else if(e<a[m])l=m-1;
			else f=m+1;
		}
		return-1;
	}

	public static void main(String[] args) {
     int []a= {1,2,3,4,5,6,7};
     System.out.println(search(a,6));
     System.out.println(search(a,9));

	}

}
