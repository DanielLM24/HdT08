import java.util.HashMap;


public class HashMapSet<Key extends Comparable<Key>, Value> implements WordSet<Key,Word>{

	private HashMap<Key, Word> base;
	
	public HashMapSet(){
		base = new HashMap<Key,Word>();
	}
	@Override
	public void add(Key key, Word wordObject) {
		base.put(key, wordObject);
	}

	@Override
	public Word get(Word word) {
		return base.get(word);
	}

}
