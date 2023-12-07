package javaPackage;

public class BreakContinue {

	public static void main(String[] args) 
	{
		int n=150;
		int j=0;
		int k=0;
		
		for(int i=1;i<n;i++)
		{
			if(i==100)
			{
				break;
			}
			else if(i%10==0)
			{
				continue;
			}
			
			System.out.println("value of i is:"+i);
			
			
		}
		
		while(j<n)
		{
		
		    j++;	
			if(j==100)
			{
				break;
			}
			else if(j%10==0)
			{
				continue;
			}
			System.out.println("value of j is:"+j);
		}
		
		do
		{
			 k++;	
				if(k==100)
				{
					break;
				}
				else if(k%10==0)
				{
					continue;
				}
				System.out.println("value of k is:"+k);

		}while(k<n);
	}

}
