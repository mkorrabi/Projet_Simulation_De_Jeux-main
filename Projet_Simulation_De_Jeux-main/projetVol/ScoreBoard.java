public class ScoreBoard{
	private static int[] sb= {0,0};
    private ScoreBoard(){}

    public static void afficherScore(int score1, int score2){
    }
    public static void setScoreG(int a)
    {
    	sb[0]=a;
    }
    public static void setScoreD(int a)
    {
    	sb[1]=a;
    }
    public static int[] getScore()
    {
    	return sb;
    }
    //ajouter un points � gauche
    public static void addPG()
    {
    	sb[0]++;
    }
    //ajouter un points � droite 
    public static void addPD()
    {
    	sb[1]++;
    }

    //determiner qui a plus de points 0 equipe gauche 1 equipe gauche
    public static int plusDeP()
    {
        if (sb[0]> sb[1]) return 0;
        else return 1;
    }

    public static boolean draw()
    {
        if (sb[0]==sb[1]) return true;
        else return false;
    }

    public static void reset()
    {
        sb[0]=0;
        sb[1]=0;
    }
}