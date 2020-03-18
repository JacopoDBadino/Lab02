package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {

	private LinkedList<Word> parole;
	
	public AlienDictionary() {
		parole = new LinkedList<Word>();
	}

	public void addWord (String alienWord, String translation) {
		Word temp = new Word(alienWord, translation);
		parole.add(temp);
	}
	
	public String translate (String wordX) {
		
		for (Word w : this.parole)
			if (wordX.equals(w.getAlienWord()))
				return w.getTranslation();
		
		return null;
	}
}
