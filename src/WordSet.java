/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7 
Autor: Eduardo Castellanos

Descripción: WordSet. Interfaz para las implementaciones de clases que almacenarán palabras.
*/
public interface WordSet<Key extends Comparable<Key>, Value> {
	public void add(Key key, Word wordObject);
	public Word get(Word word);
}