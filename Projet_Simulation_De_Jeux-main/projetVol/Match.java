public class Match {
	//la grille contenant le terrain
	private Joueur[][] grille =new Joueur[3][4];
	private Equipe a;//equipe gauche
	private Equipe b;//equipe droite
    //constructeur qui place les joueur en grille
    
	public Match(Equipe a, Equipe b){
		this.a=a;
		this.b=b;
        Joueur[] playersA = a.getPlayers(); 
        Joueur[] playersB= b.getPlayers(); 
        int tempa=0; 
        int tempb=0; 
        
        for(int j=0; j<4; j++){
            for(int i=0; i<3; i++){
                if (j<2){
                    grille[i][j]=playersA[tempa]; 
                    tempa++; 
                }
                else{
                    grille[i][j]= playersB[tempb]; 
                    tempb++; 
                }
            }
        }
    } 

    public Joueur[][] getGrille(){
        return grille; 
    }
    
	//fonction qui place randomly la ball pour un joueur en position 1 pour faire le service 
    public Ballon lancerBall()
    {
        //pour equipe a
        if ( Math.random()<0.5) 
        {
            return new Ballon(0,0,3,4);
        }
        //pour equipe b
        else {
            return new Ballon(2,3,3,4);
        }
    }
    
	//fonction qui permet d'effectuer la rotation
    public void rotation(Equipe c){
        Joueur[] players= c.getPlayers(); //Recupere la liste des joueurs qui vont faire la rotation 
        int maxg=0; 
        int maxd=0;
        //Diviser la liste des joueurs en 2 listes de 3 joueurs (car chaque equippe prends occupe 2 colonnes)
        
        Joueur[] tempg= new Joueur [3];  //Colonne gauche 
        Joueur[] tempd= new Joueur [3];  //Colonne droite 

        //Remplir les 3 premiers membres dans tempg et les 3 derniers dans tempd 
        if(c==this.a)
        {
        	for(int i=0; i<3; i++){
                for(int j=0;j<2;j++)
                {
                	if(j==0)
                	{
                		tempg[maxg]=grille[i][j];
                		maxg++;
                	}
                	else {
                		tempd[maxd]=grille[i][j];
                		maxd++;
    				}
                }
            }
        }
        else {
        	for(int i=0; i<3; i++){
                for(int j=2;j<4;j++)
                {
                	if(j==2)
                	{
                		tempg[maxg]=grille[i][j];
                		maxg++;
                	}
                	else {
                		tempd[maxd]=grille[i][j];
                		maxd++;
    				}
                }
            }
        }
        /*
         * cf exception en bas
         */
        
        //faire la rotation
        Joueur temp;
        temp=tempg[0];
        tempg[0]=tempg[1];
        tempg[1]=tempg[2];
        tempg[2]=tempd[2];
        tempd[2]=tempd[1];
        tempd[1]=tempd[0];
        tempd[0]=temp;
   
        
        //si c'est l'equipe gauche un donc on determine l'intervale
        int a=0;
        if(c==this.a)
        //si c'est l'equipe droite
        if (c==this.b) {
			a=2;
		}
    
    	/*
    	 * ICI ON HANDLE L EXCEPTION DE ELSE
    	 * else if(c!=this.a)
    	 * {
    	 * } 
    	 */
    
        //on applique la rotation dans la grille
        maxg=0;
        for(int j=0;j<3;j++)
        {
        	grille[j][a]=tempg[maxg];
        	maxg++;
        }
        maxd=0;
        for(int j=0;j<3;j++)
        {
        	grille[j][a+1]=tempd[maxd];
        	maxd++;
        }
    } 


    public void jouer(Ballon bal)
    {
    	int x = bal.getX();
    	int y = bal.getY();
    	boolean jouer = grille[x][y].Jouer(bal);
    	if(!jouer)
    	{
    		if(grille[x][y].equipe==0) {
                ScoreBoard.addPD();
                this.rotation(a); 
            }
            else{
                ScoreBoard.addPG();
                this.rotation(b);  
            }
    	}
    
    }

    //fonction qui arrete le match si seulement si ils ont pas le meme score 
    public boolean finirMatch()
    {
        //si ils ont pas le meme score
        if(ScoreBoard.draw()==false)
        {
            //on determine l'equipe qui a plus de points
            //si c'est l'equipe à gauche
            if (ScoreBoard.plusDeP()==0) 
            {
                //ajouter les win/lose dans la carriere des equipes
                a.addWin();
                b.addDefeat();
                //ajouter les win/lose dans la carriere des joueurs
                a.addJWin();
                b.addJDefeat();
            }
            //si c'est l equipe à droite
            else {
                b.addWin();
                a.addDefeat();
                b.addJWin();
                a.addJDefeat();
            }
            // ScoreBoard.reset();
            return true;//le match est fini
        }
        //si ils ont le meme score
        else {
            return false;
        }
        
    }

}