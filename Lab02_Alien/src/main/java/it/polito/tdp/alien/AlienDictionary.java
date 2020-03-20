package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {

	private LinkedList<WordEnahnced> parole;

	public AlienDictionary() {
		parole = new LinkedList<WordEnahnced>();
	}

	public void addWord(String alienWord, String translation) {
		for (WordEnahnced w : parole)
			if (w.getAlienWord().equals(alienWord)) {
				w.WordEnahncedGiaEsistente(translation);
				return;
			}
		WordEnahnced temp = new WordEnahnced(alienWord, translation);
		parole.add(temp);
		return;
	}

	public WordEnahnced translate(String wordX) {

		for (WordEnahnced w : this.parole)
			if (wordX.equals(w.getAlienWord()))
				return w;

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
