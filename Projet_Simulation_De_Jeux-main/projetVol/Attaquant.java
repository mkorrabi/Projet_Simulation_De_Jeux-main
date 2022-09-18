public class Attaquant extends Joueur {
    private static final double pjouer=0.7; //Probabilite de jouer la balle
	public Attaquant(String nom, int age, int e) {
		super(nom, age, e);
		// TODO Auto-generated constructor stub
	}
	@Override
	 //method qui permet au joueur d'envoyer la balle au adversaire avec une probabilit� definit sinn il la ratte 
    public boolean Jouer(Ballon ball){
        if(Math.random() < pjouer){
            //on deplace la ball
            ball.seDeplacer();
            return true ;
        }
        return false; 
    }   

}
