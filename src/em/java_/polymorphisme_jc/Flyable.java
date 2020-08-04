package em.java_.polymorphisme_jc;

public interface Flyable {
	// Tte les methode de l'interface doivent obligatoirement etre override ds la class concrete

public void fly(String energy);

public void light(String energy);

default public void atteri() { 			// default public void marche sur les version de java plus recentes
System.out.println("atterissage sur terre");
}

/*
* IMPORTANT -> Une interface ne possede que des class abstraites. null besoin
* de preciser le mot abstract devant les methodes -> On ne l'instancie pas et
* elle n'a pas de constructeur
* 
* -> Les class abstraites sont generiques. -> si les class ont des liens
* etroits entre elles, et qu'on peut les hierachisées, on use des class
* abstraites. exp:homme qui herite de etre vivant
* 
* -> si par contre ces class st independantes les une des autres et qu'on veut
* leur implementer la meme attitude ou des fonctionnalité précise alors on
* faire appel aux interfaces
*/
}
