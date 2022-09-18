public class Manage {
    //Method qui supprime un joueur en donnant son numero d'equipe
        public static boolean supprimerJoueur(int n,Equipe a)
        {
            return a.supprimerJoueur(n);
        }
        public static boolean supprimerJoueur(String nom,Equipe a)
        {
            return a.supprimerJoueur(nom);
        }
        public static boolean ajouterJoueur(Joueur a,Equipe b)
        {
            return b.ajouterJoueur(a);
        }
        public static void afficherStats(Equipe a)
        {}
        public static void afficherPlusStats(Equipe a)
        {}
        public static boolean remplacerJoueur(Joueur a,Equipe b)
        {
            return false;}
        public static boolean remplacerEntraineur(Entraineur a,Equipe b)
        {
            return false;}
        public static boolean virerEntraineur(Entraineur a, Equipe b)
        {
            return false;}
        public static boolean recruterEntraineur(Entraineur a, Equipe b)
        {
            return false;
        }
        public static boolean virerEquipe(Equipe a)
        {
			return false;
        }
        
}