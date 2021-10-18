public class Count {

	public static void main(String[] args) {
	String s="Java1Programs";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=1)
			count++;
	}
		
	System.out.println(count);

	}

}
