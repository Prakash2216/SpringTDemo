package com.tutorial.spring.injectingInnerbeans;

public class TextEditor {
	private SpellChecker spellchecker;

	public SpellChecker getSpellchecker() {
		return spellchecker;
	}

	public void setSpellchecker(SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}
	
	public void spellCheck(){
		spellchecker.checkingSpelling();
	}
}
