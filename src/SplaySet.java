
public class SplaySet implements WordSet{
	
	private SplayBST base;
	
	public SplaySet(){
		base = new SplayBST();
	}

	@Override
	public Word get(Word word) {
		return (Word) base.get(word);		
	}

	@Override
	public void add(Comparable key, Word wordObject) {
		base.put(key, wordObject);
	}
}
