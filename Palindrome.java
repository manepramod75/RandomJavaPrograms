package basisprograms;

public class Palindrome 
{

	public static void main(String[] args)
	{

		String input = "ROR";
		String output = "";
		
		for (int i = input.length()-1;i>=0;i--)
		{
			char c = input.charAt(i);
			output = output+c;
		}
		System.out.println(input);
		System.out.println("Reverse output "+output);
		
		if (input.equals(output))
		{
			System.out.println("This is palindrom");
		}
		
		else
		{
			System.out.println("This is not palindrom");
		}
	}
	
	
}
