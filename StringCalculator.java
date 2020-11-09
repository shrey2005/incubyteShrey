/**
 * @author Shrey
 *
 */
import java.util.*;

public class StringCalculator 
{
	public int Add(String number)
	{
		//Splitting Array using comma separated values
		String userChar[] = number.split(",");
		int sum = 0;

		try
		{
			if(!userChar[0].startsWith("-"))
			{
				if(number.isEmpty())
				{
					sum = 0;
				}
				else
				{
					//Replacing non-digit number with space
					String newStr = number.replaceAll("[^\\d]", " ");
					
					//Removing Extra space
					newStr = newStr.trim();
					newStr = newStr.replaceAll(" +"," ");
		
					String userSpaceChar[] = newStr.split(" ");
					for(int i=0;i<userSpaceChar.length;i++)
					{
						//Converting String into int
						int getint = Integer.parseInt(userSpaceChar[i]);
						if(getint>1000)
						{
							continue;
						}
						//Calculating Sum
						sum = sum + getint;
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Negative is not Allowed.");
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Getting Result From user
		System.out.println("Enter String : ");
		String userStr = sc.nextLine();

		//Creating Object and Calling Method
		StringCalculator scObj = new StringCalculator();
		int returnSum = scObj.Add(userStr);
		System.out.println(returnSum);
	}
}
