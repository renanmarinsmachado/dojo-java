package dojo.model;

import dojo.helper.PhraseHelper;

public class Phrase {
	
	private String description;
	
	private Integer qtVowel;
	
	private Integer qtConsonant;
	
	private Integer qtSpace;
	
	private Integer qtNumber;

	private Integer qtSpecialChar;
	
	public Phrase(){}
	
	public Phrase(String description){
		this.setDescription(description);
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description.trim();
	}

	public Integer getQtVowel() {
		qtVowel = PhraseHelper.countVowel(description);
		return qtVowel;
	}

	public Integer getQtConsonant() {
		qtConsonant = PhraseHelper.countConsonant(description);
		return qtConsonant;
	}

	public Integer getQtSpace() {
		qtSpace = PhraseHelper.countSpace(description);
		return qtSpace;
	}

	public Integer getQtNumber() {
		qtNumber = PhraseHelper.countNumber(description);
		return qtNumber;
	}

	public Integer getQtSpecialChar() {
		qtSpecialChar = PhraseHelper.countSpecialChar(description);
		return qtSpecialChar;
	}
}
