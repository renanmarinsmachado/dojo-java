package dojo.controller;

public class Main {

	public static void main(String[] args) {
		String f = "Eu moro em Paranapiacaba";
		String v = "aeiouAEIOU";
		int c = 0;
				
		for(int i = 0; i < f.length();i++){
			char letra = f.charAt(i);
			
			for(int b = 0; b < v.length();b++){
				char vogal = v.charAt(b);
				if(letra == vogal){
				c++;
				}
				
			}
		}
		
		System.out.println(c);
	}

}
