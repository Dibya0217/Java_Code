package com.Strings;

public class Problem_4 {

	public static void main(String[] args) {
		String s1 = "Hello Elephant";
		s1 = s1.toLowerCase();
		
		char[] ch = s1.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'a' && ch[i] <= 'z') {
				int j = i + 1;
				char count = '1';
				while(j < ch.length) {
					if(ch[i] == ch[j]) {
						count++;
						ch[j] = count;
					}
					j++;
				}
				if(count > '1')
					ch[i] = '1';
			}
		}
		System.out.println(ch);
		
	}

}
