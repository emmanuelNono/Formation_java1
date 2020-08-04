package em.java_.collection_hashtable_hashset;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class Hashtable_et_Hashset {
	/*	Hashtable est de type MAP et fonctionne avec des couple <Key,value>. On parcourt cet objet gr�ce aux key
	 *  et a l'objet Enumeration(L'objet Enumeration va contenir notre Hashtable et va permettre de le parcourir simplement)

		=>	isEmpty() retourne � vrai � si l'objet est vide ;
		=>	contains(Object value) retourne � vrai � si la valeur est pr�sente. Identique � containsValue(Object value) ;
		=>	containsKey(Object key) retourne � vrai � si la cl� pass�e en param�tre est pr�sente dans la Hashtable ;
		=>	put(Object key, Object value) ajoute le couple key - value dans l'objet ;
		=>	elements() retourne une �num�ration des �l�ments de l'objet ;
		=>	keys() retourne la liste des cl�s sous forme d'�num�ration.
		
		hashtable est Thread Safe ou multi-threads (ie +sieurs �lt du prog peuvent l'utiliser simultan�ment)
	 * */
	
	public static void main(String[] args) {
		
		System.out.println("\t\t Hashtable ==> efiicace pr rechercher une valeur via une cl� de recherche");
		System.out.println("\t\t----------------------------------------------------------------------------------");
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(10, "Printemps");
		ht.put(3, "�t�");
		ht.put(29, "automne");
		ht.put(11, "hiver");
		
		Enumeration<String> e = ht.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		ht.clear();
		
		if(!ht.isEmpty()) {
			System.out.println("la valeur 'printemps' existe ? " + ht.contains("printemps"));
		} else {
			System.out.println("Le hashtable est vide...");
		}
		
		//---------------------------------------------------------------------------------------------------------------
		
		System.out.println("\t\t HashSet ==> efiicace pr grde qte de donn�es avec insertion en fin de queue et recherche d'elt");
		System.out.println("\t\t HashSet ==> permet aussi d'extraire un tableau d'objet de HashSet");
		System.out.println("\t\t----------------------------");
		/*	Voici une liste des m�thodes que l'on trouve dans cet objet :
	
			=>	add() ajoute un �l�ment ;
			=>	contains(Object value) retourne � vrai � si l'objet contient value ;
			=>	isEmpty() retourne � vrai � si l'objet est vide ;
			=>	iterator() renvoie un objet de type Iterator ;
			=>	remove(Object o) retire l'objet o de la collection ;
			=>	toArray() retourne un tableau d'Object
		 */
		
		HashSet hs = new HashSet();
	    hs.add("toto");
	    hs.add(12);
	    hs.add('d');

	    Iterator it = hs.iterator();
	    while(it.hasNext())
	      System.out.println(it.next());
	 
	    System.out.println("\n\t\t Parcours avec un tableau d'objet");
	    System.out.println("\t\t-----------------------------------");
	                
	    Object[] obj = hs.toArray();
	    for(Object o : obj)
	      System.out.println(o);     
		
	}

}
