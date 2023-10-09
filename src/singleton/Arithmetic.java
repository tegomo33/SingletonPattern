package singleton;

public final class Arithmetic {
    
	private static Arithmetic instance = null;
	 
	
	 // D'autres attributs, classiques et non "static".
	 private int x;
	 private int y;
	 private String nom;
	 
	 
	 // Constructeur de l'objet.
	 private Arithmetic() 
	 {
			 // La pr�sence d'un constructeur priv� supprime le constructeur public par d�faut.
			 super();
	 }
	 
	 
	 // un deuxi�me constructeur.
	 private Arithmetic(int x, int y) 
	 {
		     this.x=x;
			 this.y=y;
	 
     }
	 
	 
	// un troisi�me constructeur.
	 private Arithmetic(String nom) 
	 {
		     this.nom =  nom;
	 
     }
	 
	 
	 // M�thode renvoyant une instance de la classe Singleton
	  public static Arithmetic getInstance() 
		  {
				  if (instance == null) 
				  {
					 instance = new Arithmetic();
				  }
				    return instance;
		  }
	  
	  
	  // M�thode renvoyant une instance de la classe Singleton
	  public static Arithmetic getInstance(int x, int y) 
		   {
				  if (instance == null) 
				  {
					 instance = new Arithmetic(x, y);
				  }
				    return instance;
		  }
	  
	  
	// M�thode renvoyant une instance de la classe Singleton
		  public static Arithmetic getInstance(String nom) 
			   {
					  if (instance == null) 
					  {
						 instance = new Arithmetic(nom);
					  }
					    return instance;
			  }
	  
	  
	   // D'autres m�thodes classiques et non "static".
		   public int somme(int x, int y) 
			   {
			      return x+y;
			   }
		   
		   public int multiplication(int x, int y) 
		   {
		      return x*y;
		   }
		   
		   public float soustraction(int x, int y) 
			   {
			      float soustract = 0;
			      
			      if(x < y) {
			    	  soustract = y-x;
			      }else {
			    	  soustract = x-y;
			      }
			      
			      return soustract;
			   }
		   
		   public float moyenne(int x, int y) 
		   {
		      return somme(x, y)/2;
		   }
		   
		   public void affiche() 
			   {
			      System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " + this.y);
			   }
		   
		   public void afficheNom() {
			   System.out.println("\nJe suis une m�thode qui retourne le nom : " + this.nom);
		   }
		   
		   
	   // redefinir la m�thode clone pour emp�cher son utilisation
	   @Override
	   public Object clone() throws CloneNotSupportedException {
	      throw new CloneNotSupportedException();
	   }
	
}
