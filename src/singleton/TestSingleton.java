package singleton;

public class TestSingleton {

	  public static void main(String[] args) 
		  {
		  
		  // Méthodes classiques ayant été ajoutées dans le singletion Arithmétic
		  
		  float soustraction = Arithmetic.getInstance().soustraction(2, 5);
		  
		  System.out.printf("\nla soustraction est %f",soustraction);
		  
          int multiple = Arithmetic.getInstance().multiplication(2, 5);
		  
		  System.out.printf("\nla multiplication est %d",multiple);
		  
		  
		  // Instrutions initiales dans la classe TestSingleton
		  
			  int som = Arithmetic.getInstance().somme(2, 5);
			  
			  System.out.printf("\nla somme est %d \n",som);
			  
			  Arithmetic s1 = Arithmetic.getInstance(8, 3);
			  s1.affiche();
			  
			  Arithmetic s2 = Arithmetic.getInstance(5, 9);
			  s2.affiche();
			  
		 // Instanciation des nouveaux objets sNom et s3
			  
			  Arithmetic sNom = Arithmetic.getInstance("Banane");
			  sNom.afficheNom();
			  
			  Arithmetic s3 = Arithmetic.getInstance("Macabo");
			  s3.afficheNom();
		  }
	
}
