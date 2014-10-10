
public class RBTreeSet implements WordSet{
	
	private RedBlackBST base;
	
	public RBTreeSet(){
		base = new RedBlackBST();
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