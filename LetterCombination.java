package Bs;

import java.util.ArrayList;

public class LetterCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterCombination("", "12");
	}
	static void letterCombination(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digit=up.charAt(0)-'0';
		for(int i=((digit-1)*3);i<digit*3;i++) {
			char ch=(char)('a'+ i);//always put '+' symbol
			letterCombination(p+ch, up.substring(1));
			
		}


	}
	
	static ArrayList<String> letterCombinationReturn(String p, String up) {
		if(up.isEmpty()) {
			ArrayList<String> obj=new ArrayList<>();
			obj.add(p);
			
			return obj;
		}
		int digit=up.charAt(0)-'0';
		ArrayList<String> obj1=new ArrayList<>();
		for(int i=((digit-1)*3);i<digit*3;i++) {
			char ch=(char)('a'+ i);//always put '+' symbol
			
			obj1.addAll(letterCombinationReturn(p+ch, up.substring(1)));
			
		}
		return obj1;


	}

}
