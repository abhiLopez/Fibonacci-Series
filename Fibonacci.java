
class Fibonacci
{  
	public static void main(String args[])  
	{    
		int n=0,m=1,l,i,count=10;    
		System.out.print(n+" "+m);    

		for(i=2;i<count;++i)   
		{    
			l=n+m;    
			System.out.print(" "+l);    
			n=m;    
			m=l;    
		}    

	 }
}  