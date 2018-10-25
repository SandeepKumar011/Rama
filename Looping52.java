class Looping52
{
	public static void main(String[] args) 
	{
		if(false)
		{
       System.out.println("from  if");
		}

		else if(true)
		{
       System.out.println("from  inner if1");
		}

		else if(true)
		{
			System.out.println("inner if2");
		}

      
		System.out.println("end of main");
	
		
	}
}
