import java.util.*;
class CountWords
{
	public static void main(String args[])
	{
	  Scanner s =new Scanner(System.in);
	  System.out.println("Enter the String :");
	  String str1=s.nextLine();
	  String[] str=str1.split("\\s+");
	  System.out.print("Number of words in string are : "+str.length);
	}
}