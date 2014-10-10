/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7
Autor: Eduardo Castellanos

Descripción: SimpleSet ejemplo con ArrayList.
*/
import java.util.ArrayList;

public class SimpleSet<Key extends Comparable<Key>, Value> implements WordSet<Key,Word>{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}

	@Override
	public void add(Key key, Word wordObject) {
		base.add(wordObject);		
	}
} 