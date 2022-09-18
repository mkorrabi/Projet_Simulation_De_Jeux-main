public class Entraineur implements Personne{
    private final int id= 0;
    private String nom;
    private int age;
    public Entraineur(String nom, int age){
       this.nom=nom;
       this.age=age;
    }

    public String getNumber(){
        return  "C'est un entraineur";
    }

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	} 
}