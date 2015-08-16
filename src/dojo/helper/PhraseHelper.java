package dojo.helper;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;

import dojo.exception.InitializationException;

public class PhraseHelper {

	private static final List<String> VOWEL = Arrays.asList("a","e","i","o","u");

	private static final List<String> CONSONANT = 
			Arrays.asList("b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z");

	private static final List<String> SPACE = Arrays.asList(" ");
	
	private static final List<String> NUMBER = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
	
	private static final List<String> SPECIAL_CHAR = Arrays.asList("!","@","#","$","%","¨","&","*","(",")","-","_","+",".",",");

	public static int countVowel(String phrase) {
		return countLetterTypes(phrase, VOWEL);
	}

	public static int countConsonant(String phrase) {
		return countLetterTypes(phrase, CONSONANT);
	}

	public static int countSpace(String phrase) {
		return countLetterTypes(phrase, SPACE);
	}
	
	public static int countNumber(String phrase) {
		return countLetterTypes(phrase, NUMBER);
	}
	
	public static int countSpecialChar(String phrase) {
		return countLetterTypes(phrase, SPECIAL_CHAR);
	}

	private static int countLetterTypes(String phrase, List<String> letterType) {
		
		if(phrase == null){
			throw new InitializationException();
		}
					
		int count = 0;
		for (char charLetter : phrase.toCharArray()) {
			
			String letter = removeAccent(Character.valueOf(charLetter).toString());
			
			for (String type : letterType) {
				if (letter.equalsIgnoreCase(type)) {
					count++;
				}

			}
		}

		return count;
	}
	
	private static String removeAccent(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
}
