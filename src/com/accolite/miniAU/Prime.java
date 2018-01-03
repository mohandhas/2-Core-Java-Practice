package com.accolite.miniAU;

public class Prime {
	
	public static void main(String[] args)
	{

		PrimeOrNot pon = (n)->{ 
				int m=n/2;      
				if(n==0||n==1)
				{  
					return false;
				}
				else
				{  
				   for(int i=2;i<=m;i++)
				   {      
				    if(n%i==0)
				    {      
				    		return false;
				    	}  
				   }
				}
				return true;
			};
			int n=2;
			System.out.println(pon.isPrime(n));
	}
	
}
		
		
	