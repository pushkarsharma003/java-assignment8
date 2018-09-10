import java.util.*;
class Occurence
{
	public static void main(String args[])
	{
	  Scanner s =new Scanner(System.in);
	  System.out.println("Enter the first String:");
	  String str1=s.nextLine();
	   System.out.println("Enter the second String:");
	  String str2=s.nextLine();
	  if(str1.contains(str2))
	  {
		  System.out.print("present ");
	  }
	  else
		  System.out.print("not present");
	}
}