package com.tutorial.spring.annotationbasedconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellchecker;

	public SpellChecker getSpellcheker() {
		return spellchecker;
	}
	@Autowired
	public void setSpellcheker(SpellChecker spellcheker) {
		this.spellchecker = spellcheker;
	}
	
	public void SpellCheck(){
		spellchecker.checkSpelling();
	}
}
