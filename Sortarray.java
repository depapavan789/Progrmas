public class Sortarray {
	static void sort(int []a) {
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

public static void main(String[] args) {
     int []a= {1,9,7,2,10,4};
     sort(a);
     for(int n:a)
     {
    	 System.out.println(n);
     }

	}

}
