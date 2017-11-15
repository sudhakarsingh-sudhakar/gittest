class pangram
{
	boolean pangram(String s)
	{
		
		boolean pangr=false;
		int count=1;
		char [] c={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		s=s.toLowerCase();
		char [] c1=s.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[j]==c1[i])
				{
					c=c-c[j];
					count++;
					
				}
				
					
			}
		}
		if(count==26)
				{
					pangr=true;
					return pangr;
				}
		else
		{
		return pangr;
		}
}
class main
{
	public static void main(String s[])
	{
		scanner sc=new scanner(System.in);
		string s=sc.nextline();
		pangram p=new pangram();
		system.out.print("given String is pangram =");
		System.out.println(p.pangram(s));
	}
}