package it.polito.tdp.alien;
import java.util.LinkedList;

public class WordEnahnced {
	
	private LinkedList<String> dizzi;
	private String alienWord;
	
	public WordEnahnced(String alienWord, String traslation) {
		super();
		this.alienWord = alienWord;
		dizzi = new LinkedList<String>();
		dizzi.add(traslation);
	}
	
	public void WordEnahncedGiaEsistente (String translation) {
		dizzi.add(translation);
	}

	public String getAlienWord() {
		return alienWord;
	}

	public LinkedList<String> getDizzi() {
		return dizzi;
	}
	
	
	
	
	
	

}
