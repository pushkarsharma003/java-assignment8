import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		String original,reverse="";
		Scanner scan=new Scanner(System.in);
		original=scan.nextLine();
		int length=original.length();
		for (int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
	}
}