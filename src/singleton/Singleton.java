package singleton;

public final class Singleton {
    
	private static Singleton instance = null;
	 
	
	 // D'autres attributs, classiques et non "static".
	 private int x;
	 private int y;
	 
	 
	 // Constructeur de l'objet.
	 private Singleton() 
	 {
			 // La pr�sence d'un constructeur priv� supprime le constructeur public par d�faut.
			 super();
	 }
	 
	 
	 // un autre constructeur.
	 private Singleton(int x, int y) 
	 {
		     this.x=x;
			 this.y=y;
	 
     }
	 
	 
	 // M�thode renvoyant une instance de la classe Singleton
	  public static Singleton getInstance() 
		  {
				  if (instance == null) 
				  {
					 instance = new Singleton();
				  }
				    return instance;
		  }
	  
	  
	  // M�thode renvoyant une instance de la classe Singleton
	  public static Singleton getInstance(int x, int y) 
		   {
				  if (instance == null) 
				  {
					 instance = new Singleton(x, y);
				  }
				    return instance;
		  }
	  
	  
	   // D'autres m�thodes classiques et non "static".
		   public int somme(int x, int y) 
			   {
			      return x+y;
			   }
		   
		   public float moyenne(int x, int y) 
			   {
			      return somme(x, y)/2;
			   }
		   
		   public void affiche() 
			   {
			      System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " + this.y);
			   }
		   
		   
	   // redefinir la m�thode clone pour emp�cher son utilisation
	   @Override
	   public Object clone() throws CloneNotSupportedException {
	      throw new CloneNotSupportedException();
	   }
	
}
