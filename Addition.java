class Addition
{
	public static void sum(int number1, int number2)
	{
		System.out.println("sum method started!!!");
		int result = 0;
		result = number1 + number2;
		System.out.println(result);
		System.out.println("sum method ended!!!");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method started!!!");
		// sum method called and passed int arguments 
		sum(40, 30);
		System.out.println("Main method ended!!!");
		System.out.println("Main method ended2222222222222!!!");
	}
	

}
