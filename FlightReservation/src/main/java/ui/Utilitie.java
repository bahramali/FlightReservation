package ui;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Utilitie
{
	public static Scanner sc = new Scanner(System.in);
	
	public static boolean nextBoolean(){
		String s= nextString("true or false?");
		if(s.equalsIgnoreCase("true"))
			return true;
		else if(s.equalsIgnoreCase("false"))
			return false;
		else{
			return nextBoolean();
		}
		
	}
	
	public static String nextString(String s){
		System.out.println(s);
		return returnTheWord(sc.nextLine());
	}
	
	public static String nextLine(String s){
		System.out.println(s);
		return sc.nextLine();
	}
	
	public static String getAndSetNumberAsString(String s,String alrt){
		try{
			Integer.valueOf(s);
			return s;
		}catch (NumberFormatException e) {
			System.out.println(alrt+" is not correct!");
			getAndSetNumberAsString(nextLine("Only number."),"");	
		}
		return s;
	}
	
	public static boolean isNumber(String s){
		try{
			Integer.valueOf(s);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static int nextInt(String s){
		System.out.println(s);
		int a;
		try{
			a= sc.nextInt();
			sc.nextLine();
			return a;
		}catch (InputMismatchException e) {
			sc.nextLine();
			return nextInt("Please Enter number");
		}	
	}
	public static int nextInt(int start,int end,String s){
		int a;boolean loop;
		try{
			do
			{
				loop = false;
				System.out.println(s);
				a= sc.nextInt();
				sc.nextLine();
				if(!(a>=start && a<=end)){
					System.out.println("( between "+start+" and "+end+")");
					loop = true;
				}
			} while (loop);
			return a;
		}catch (InputMismatchException e) {
			sc.nextLine();
			return nextInt(start,end,"Write a number!");
		}
	}
	public static String returnTheWord(String s){
		if (isWord(s))
			return s;
		else{
			while(!isWord(s)){
				s= Utilitie.nextLine("Please use only letter to write a word!");
			}
		return s;
		}
	}
	public static String returnStringOrNumber(String title){
		String s;
		do{
			s =Utilitie.nextLine(title);	
		}while(!(Utilitie.isNumber(s) ^ Utilitie.isWord(s)));
		return s;
	}
	public static boolean isWord(String s){
		char[] alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
		boolean isString = false;
		for(int i= 0;i< s.length();i++){
			isString = false;
			for(char c:alfabet){
				char a = s.charAt(i);
				if(a==c){
					isString = true;
					break;
				}
			}
			if (isString==false)
				return false;
		}
		if (isString)
			return true;
		else
			return false;
	}
	
	public static String doubleEnterNextLine(){
		boolean loop = true;
		String text="";
		int count = 0;
		System.out.println("Press on Enter button twice to finish the note.");
		while(loop)
		{
			String a = sc.nextLine();
			if(a.equals("")&&count==1){				
				loop= false;
				text =text.substring(0, text.indexOf("\n\n"));
				
			}else if(a.equals("")){	
				count= 0;
				count++;				
				text +=(a+"\n");
			}else{
				count = 0;
				text +=(a+"\n");
			}		
		}
		return text;	
	}
	
	public static String[] stringSpliter(String s){
		String[] str = new String[2];
		str[0]= s.substring(0, s.indexOf(" "));
		str[1]= s.substring(s.lastIndexOf(" ")+1,s.length());
		return str;
	}


}
