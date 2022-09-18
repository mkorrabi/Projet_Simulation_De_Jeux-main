public abstract class Joueur implements Personne {
	private String nom;
	private int age;
    private final int id;
	private static int cpt=1;
	private int win;
	private int defeat; 
    private int energie;
	public int equipe;//on stock ici 0 si le joueur est dans l'equipe � gauche sinn � droite 1
	
    public Joueur(String nom, int age, int equipe){
        this.nom=nom;
        this.age=age;
        id=cpt;
        cpt++;
		energie= 6; //Energie au debut 
		win = 0; 
		defeat = 0; 
		this.equipe= equipe; 
    } 
    public String getNumber(){
        return "Le numero de ce joueur: " + id; 
    }
    //method qui permet au joueur d'envoyer la balle au adversaire avec une probabilit� definit sinn il la ratte 
    public abstract boolean Jouer(Ballon ball);

	public int getid() {
		return id;
	}


	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }
    public void addWin()
    {
        this.win++;
    }
    public void addDefeat()
    {
        this.defeat++;
    }
}