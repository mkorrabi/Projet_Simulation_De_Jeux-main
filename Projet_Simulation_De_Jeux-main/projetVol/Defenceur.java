public class Defenceur extends Joueur {
    private static final double pjouer=0.3; //Probabilite de jouer la balle
	public Defenceur(String nom, int age, int e) {
		super(nom, age, e); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean Jouer(Ballon ball){
        if(Math.random() < pjouer){
            //on deplace la ball
            ball.seDeplacer();
            return true ;
        }
        return false; 
    }   

}
