package com.Strings;

public class PrintPalindromeWordInGivenString {

	public static void main(String[] args) {
		String s = "Madam Sir Racecar sis";
//		String [] s1 = s.split(" ");
//		
//		for(int i = 0; i < s1.length; i++) {
//			if(CheckPalindrome.isPalindrome(s1[i]))
//				System.out.println(s1[i]);
//		}
		int i = 0;
		int j = 0;
		int k=0;
		for(; j<s.length(); j++ )
		{
			while(j<=s.length()-1 && s.charAt(j)!=' ')
			{
				j++;
			}
			 k=j-1;
		}
		if(isPallword(s, i, k))
			{
			String s1="";
				for(; i<=k; i++)
				{
					s1+=s.charAt(i);
				}
				System.out.println(s1);
			}
		j=k+1;

	}
	
	public static boolean isPallword(String s, int start, int end)
	{
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
