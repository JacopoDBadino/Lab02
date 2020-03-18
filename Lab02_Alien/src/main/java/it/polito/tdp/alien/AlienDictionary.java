package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {

	private LinkedList<Word> parole;

	public AlienDictionary() {
		parole = new LinkedList<Word>();
	}

	public void addWord(String alienWord, String translation) {
		Word temp = new Word(alienWord, translation);
		parole.add(temp);
	}

	public String translate(String wordX) {

		for (Word w : this.parole)
			if (wordX.equals(w.getAlienWord()))
				return w.getTranslation();

		return null;
	}

	public boolean contieneNumero(String alienWord, String translation) {

		for (int i = 0; i < alienWord.length(); i++)
			if (Character.isLetter(alienWord.charAt(i))==false)
				return true;

		for (int i = 0; i < translation.length(); i++)
			if (Character.isLetter(translation.charAt(i))==false)
				return true;

		return false;
	};
}
