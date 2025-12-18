package assignments;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Is 15 prime?: " + isPrime(15));
		System.out.println("Is 6 prime?: " + isPrime(6));
		System.out.println("Is 1 prime?: " + isPrime(1));
		System.out.println("Is 7 prime?: " + isPrime(7));
		System.out.println("Is 25 prime?: " + isPrime(25));
		
		
	}
	
	public static boolean isPrime(int number)
	{
		if(number<=1) {
			return false;
		} 
		
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				return false;
			}
			
		}
		return true;
	}

}
