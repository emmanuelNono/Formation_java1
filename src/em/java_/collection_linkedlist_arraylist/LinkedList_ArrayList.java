package em.java_.collection_linkedlist_arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;;

public class LinkedList_ArrayList {
	
	/*	La liste des methodes ArrayList:
			add() permet d'ajouter un élément ;
			get(int index) retourne l'élément à l'indice demandé ;
			remove(int index) efface l'entrée à l'indice demandé ;
			isEmpty() renvoie « vrai » si l'objet est vide ;
			removeAll() efface tout le contenu de l'objet ;
			contains(Object element) retourne « vrai » si l'élément passé en paramètre est dans l'ArrayList.
	 * */

	public static void main(String[] args) {
		
		System.out.println("\t\t LinkedList ==> efiicace pr insertion et suppression frequente en milieu de la liste  ");
		System.out.println("\t\t----------------------------------------------------------------------------------");
		 List l = new LinkedList();
		    l.add(12);
		    l.add("toto ! !");
		    l.add(12.20f);

		    for(int i = 0; i < l.size(); i++)
		      System.out.println("Élément à l'index " + i + " = " + l.get(i));

		      System.out.println("\n \t LinkedList implement Iterator ==> Parcours avec un itérateur ");
		      System.out.println("\t\t----------------------------------------------------");
		      ListIterator li = l.listIterator();

		      while(li.hasNext())
		        System.out.println(li.next());
		      
		      System.out.println("\n\t ArrayList ==> efiicace pr lecture des gros objets ss se soucier de l'odre des elts");
		      System.out.println("\t\t----------------------------------------------------");
		      ArrayList al = new ArrayList();
		      al.add(12);
		      al.add("Une chaîne de caractères !");
		      al.add(12.20f);
		      al.add(null);			//	prend tt type d'objet meme null
		      al.add('d');
		                  
		      for(int i = 0; i < al.size(); i++)
		      {
		        System.out.println("donnée à l'indice " + i + " = " + al.get(i));
		      }
		      
		      System.out.println("\n \t ArrayList implement Iterator ==> Parcours ArrayList avec un itérateur ");
		      System.out.println("\t\t----------------------------------------------------");
		      
		      ListIterator lArray = al.listIterator();

		      while(lArray.hasNext())
		        System.out.println(lArray.next());
	}

}
