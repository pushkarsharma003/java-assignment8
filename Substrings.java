import java.util.Scanner;
class Substring
 {
	public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        String str;
        str=scan.nextLine();
        for(int i=0;i<str.length();i++)
        { 
    	   for(int j=i+1;j<=str.length();j++)
    	   {
    		  System.out.println(str.substring(i, j));
    	   }
        }
	}
}