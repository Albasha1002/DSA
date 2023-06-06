package Bs;

import java.util.ArrayList;
import java.util.Arrays;

public class Perumutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutationList("","abc");
		ArrayList<String> str=permutationRet("","abc");
		System.out.println(str);
		int c=count1("","abc");
		System.out.println(c);
		int p=permutationsCount("", "abc");
		System.out.println(p);
		ArrayList<String> per=permutationsList("", "abc");
		System.out.println(per);

	}
   public static void  permutationList(String p, String up) {
	   if(up.isEmpty()) {
		   System.out.println(p);
		   return;
	   }
	   
	   
	   for(int i=0;i<=p.length();i++) {
		   char ch=up.charAt(0);
		  
		   String f=p.substring(0,i);//give p's string
		   String s=p.substring(i,p.length());
		   permutationList(f+ch+s,up.substring(1)); 
	   }    
   }
   
   public static ArrayList<String> permutationRet(String p, String up){
	   
	   if(up.isEmpty()) {
		   ArrayList<String
		   > list=new ArrayList<>();
		   list.add(p);
		   return list;
	   }
	   char ch=up.charAt(0);
	   ArrayList<String> ls=new ArrayList<>();
	   // very important this i<=p.length
	   for(int i=0;i<=p.length();i++) { 
		   String f=p.substring(0,i);
		   String s=p.substring(i,p.length());
		   
		   
		   
		   ls.addAll(permutationRet(f+ ch+ s,up.substring(1)));
	   }
	  
	   
	   return ls;
	   
   }
   
   static ArrayList<String> permutationsList(String p, String up) {
       if (up.isEmpty()) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
       }
       char ch = up.charAt(0);

       // local to this call
       ArrayList<String> ans = new ArrayList<>();

       for (int i = 0; i <= p.length(); i++) {
           String f = p.substring(0, i);
           String s = p.substring(i, p.length());
           ans.addAll(permutationsList(f + ch + s, up.substring(1)));
       }
       return ans;
   }
   
public static int  count1(String p, String up){
	   
	   if(up.isEmpty()) {
		  return 1;
	   }
	   int count=0;
	   char ch=up.charAt(0);
	   
	   
	   ArrayList<String> ls=new ArrayList<>();
	   for(int i=0;i<=p.length();i++) { 
		   String f=p.substring(0,i);
		   String s=p.substring(i,p.length());
		   
		   count=count+count1(f+ch+s,up.substring(1));
	   }
	  
	   
	   return count;
	   
   }
static int permutationsCount(String p, String up) {
    if (up.isEmpty()) {
        return 1;
    }
    int count = 0;
    char ch = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
        String f = p.substring(0, i);
        String s = p.substring(i, p.length());
        count = count + permutationsCount(f + ch + s, up.substring(1));
    }
    return count;
}
   
   
}
