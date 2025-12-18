package assignments;

public class Assignment13 {

	public static void main(String[] args) {

		System.out.println(calculatePowerOfNumber(2,10));  //example-1
		System.out.println(calculatePowerOfNumber(2.10,3)); //example-2
		System.out.println(calculatePowerOfNumber(2.0,-2)); //example-3 
	}
	
	private static double calculatePowerOfNumber(double number, int power)
	{
		if(power<0)
		{
			number = (1/number);
			power = power * -1;
		}
		double result = 1.0;
		for(int i=1;i<=power;i++)
		{
		 	result = result * number;
		 	
		}
		return  result;
	}

}
