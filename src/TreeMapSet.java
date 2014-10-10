import java.util.TreeMap;


public class TreeMapSet<Key extends Comparable<Key>, Value> implements WordSet<Key,Word>{

	private TreeMap<Key, Word> base;
	
	public TreeMapSet(){
		base = new TreeMap<Key,Word>();
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
