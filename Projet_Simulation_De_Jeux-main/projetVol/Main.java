import java.util.Scanner;  // Import the Scanner class
public class Main {
	public static void main(String[] args) {
	// 	int reponse;
	// 	do
	// 	{
	// 	    Scanner scan = new Scanner(System.in);
	// 		// mot du bienvenue
	// 		System.out.println("Bonjour Monsieur Le manager qu'est ce que vous voulez faire ? ");
	// 		//on demande ici d'entrer un numero
	// 		System.out.println(" 1 - Gerer l'equipe 1  ");
	// 		System.out.println(" 2 - Gerer l'equipe 2  ");
	// 		System.out.println(" 3 - Faire une simulation d'un match entre l'equipe 1 et equipe 2 ");
	// 		//on lit l'entr�
	// 		reponse = scan.nextInt();
	// 		//
	// 		System.out.println("Voulez vous revenir au Menu principal (0/1) ?");
	// 		//on recupere l'entr�e dans reponse
	// 		reponse = scan.nextInt()	;
	// 	}while(reponse==1);//on boucle si oui

	//Premiere equippe 
	Equipe eA= new Equipe("Anges"); 

	eA.ajouterAttaquant("Malek", 20, 0); 
	eA.ajouterAttaquant("Jasim", 19, 0);
	eA.ajouterAttaquant("Lulwa", 11, 0);
	eA.ajouterDefenceur("Ahmad", 13, 0);
	eA.ajouterDefenceur("Yuri", 20, 0);
	eA.ajouterDefenceur("Paul", 18, 0);


	//Deuxieme equippe
	Equipe eB= new Equipe("Shayateen"); 

	eB.ajouterAttaquant("Amine", 19, 1);
	eB.ajouterAttaquant("Manel", 19, 1);
	eB.ajouterAttaquant("sana", 11, 1);
	eB.ajouterDefenceur("Sara", 22, 1);
	eB.ajouterDefenceur("Shaima", 17, 1);
	eB.ajouterDefenceur("Sabrina", 18, 1);


	//Lancer le match 
	Match m= new Match(eA, eB); 

	Joueur g[][]= m.getGrille(); 

	for(int i=0; i<4; i++){
		for (int j=0; j<3; j++){
			System.out.print( g[j][i].getId()); 
		}
		System.out.println(); 
	}

	m.rotation(eA); 


	//Lancer la ball et la creer 
	Ballon bal= m.lancerBall();

	// for(int mat=0; mat<5; mat++){ 
	for(int i=0; i<30; i++){
		m.jouer(bal);
		int s[] = ScoreBoard.getScore(); 
		System.out.println("L'equipe " + eA.getNom() + " a " + s[0]+ " points"); 
		System.out.println("L'equipe " + eB.getNom() + " a " + s[1]+ " points"); 	
	}

	if(m.finirMatch()){
		System.out.println("c'est fini");
	}

	else{
		System.out.println("It's a tie, one more round");
		while(m.finirMatch()==false){
			m.jouer(bal);
		}
	}

	int s[] = ScoreBoard.getScore(); 
	System.out.println(s[0]);
	System.out.println(s[1]);
	if(s[0]>s[1]){ 
		System.out.println("L'equipe " + eA.getNom() + " a gagne");
		System.out.println(eA.celebrer());
	}
	else{
		System.out.println("L'equipe " + eB.getNom() + " a gagne");
		System.out.println(eB.celebrer());
	}

	ScoreBoard.reset();
	
	
	System.out.println(eA); 
	System.out.println(eB);

	}

}
