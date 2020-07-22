import java.util.*;
import java.io.*;
import java.lang.*;

public class RemoveChar
{
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if((s.charAt(0) == 'A') &&(s.charAt(1)=='A') || (s.charAt(0) == 'a') &&(s.charAt(1)=='a')|| (s.charAt(0) == 'A') &&(s.charAt(1)=='a')|| (s.charAt(0) == 'a') &&(s.charAt(1)=='A'))
		{
		s = s.substring(2,n);
		System.out.println("output string is:"+s);
		}
		else if((s.charAt(0) == 'A') && (s.charAt(1)!='A') || (s.charAt(0) == 'a') && (s.charAt(1)!='a') ){
		s = s.substring(1,n);
		System.out.println("output string is:"+s);
		}
		else
		System.out.println("output string is:"+s);
		
	}
}
