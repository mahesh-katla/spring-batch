package com.example.batch.dto;

public class FindWord {
	
	
	public boolean findword( String [][] args, String word) {
		
		int i = args.length;
		int j = args.length;
		
		if(word == null || word.equals(""))
			return true;
		String temp = "";
		
		 for(int k= 0; k < i ; i++) {
			 
			 for(int l =0 ; l< j ; l++ ) {
				 
				 temp = temp + args[i][j];
				 
				 
			 }
			 
			 if(word.contains(temp)) {
				 return true;
			 }
			 temp = "";
			 
		 }
		
		return false;
	}
	
	public static void main(String args[]) {
		
		System.out.println(12/10);
		System.out.println(12%10);
	}

}
