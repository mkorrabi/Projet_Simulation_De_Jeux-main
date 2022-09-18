public class Equipe{
    
    private int max;
    private String nom;
    private static final int size = 6;
    private Joueur[] j;
    private int win; 
    private int defeat; 

    public Equipe(String nom){
        j= new Joueur[size]; 
        max= 0;
        this.nom=nom;
        win=0;
        defeat=0;
    }

    public boolean ajouterAttaquant(String nom, int age, int eq){
    	Attaquant e = new Attaquant(nom, age, eq);
    	if(max>6)
        {
            return false;
        }
        j[max]=e;
        max++;
        return true;
    }
    public boolean ajouterDefenceur(String nom, int age, int eq){ 
    	Defenceur e = new Defenceur(nom, age, eq);
    	if(max>6)
        {
            return false;
        }
        j[max]=e;
        max++;
        return true;
    }
    public boolean ajouterJoueur(Joueur e){
        if(max>6)
        {
            return false;
        }
        j[max]=e;
        max++;
        return true;
    }

    public boolean supprimerJoueur(String nJoueur){
        for(int i=0; i< j.length; i++){
            if (j[i].getNom()== nJoueur){  
                j[i]=null;
                max--;
                return true; 
            }
        }
        return false;
    }

    public boolean supprimerJoueur(int num){
        for(int i=0; i< j.length; i++){
            if (j[i].getid()== num){  
                j[i]=null;
                max--;
                return true; 
            }
        }
        return false;
    }
    public String celebrer(){
        return "L'equipe " + this.nom + " fait une fete!!!";
    }

    public double salaire(){
        return 2000*max;
    }

    public String getNom(){
        return nom; 
    }
    public Joueur[] getPlayers()
    {
    	return this.j;
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

    public void addJWin()
    {
        for(int i=0;i<size;i++)
        {
            j[i].addWin();
        }
    }
    public void addJDefeat()
    {
        for(int i=0;i<size;i++)
        {
            j[i].addDefeat();
        }
    }

    public String toString(){
        return "L'equipe " + nom +" a "+ win + " win et " + defeat + " defeat "; 
    }


}