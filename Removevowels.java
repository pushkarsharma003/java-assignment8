import java.util.Scanner;
class Removevowels
{
	public static void main(String[] args)
	{
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		str=scan.nextLine();
		System.out.println(str.replaceAll("[AIOUEaioue]",""));
	}
}