class Personnel {
    private Employe[] staff = new Employe[200];
    private int nbreEmploye = 0;
    private static final int MAXEMPLOYE = 200;


    public Personnel() {
    }

    public String[] getNom(){
        String[] Nom = new String[nbreEmploye];
        for(int i = 0 ; i < nbreEmploye; i++){

            Nom[i] = staff[i].getnom();
        }
        return Nom;
    }
    public String[] getPrenom(){
        String[] Prenom = new String[nbreEmploye];
        for(int i = 0 ; i < nbreEmploye; i++){
            Prenom[i] = staff[i].getprenom();
        }
        return Prenom;
    }
    public int[] getAge(){
        int[] Age = new int[nbreEmploye];
        for(int i = 0 ; i < nbreEmploye; i++){
            Age[i] = staff[i].getage();
        }
        return Age;
    }
    public String[] getDateEntree(){
        String[] Date = new String[nbreEmploye];
        for(int i = 0 ; i < nbreEmploye; i++){
            Date[i] = staff[i].getdate();
        }
        return Date;
    }
    public double[] getSalaires(){
        double[] Salaire = new double[nbreEmploye];
        for(int i = 0 ; i < nbreEmploye; i++){
            Salaire[i] = staff[i].getsalaire();
        }
        return Salaire;
    }
    public String[] getCategorie(){
        String[] categorie = new String[nbreEmploye];
        for(int i = 0 ; i < nbreEmploye; i++){
            categorie[i] = staff[i].getClass().getSimpleName();
        }
        return categorie;
    }

    public void ajouterEmploye(Employe e) {
        ++this.nbreEmploye;
        if (this.nbreEmploye <= 200) {
            this.staff[this.nbreEmploye - 1] = e;
        } else {
            System.out.println("Pas plus de 200 employés");
        }

    }
    public int nombreEmploye(){
        return nbreEmploye;
    }

    public double salaireMoyen() {
        double somme = 0.0D;

        for(int i = 0; i < this.nbreEmploye; ++i) {
            somme += this.staff[i].calculerSalaire();
        }

        return somme / (double)this.nbreEmploye;
    }

    public void afficherSalaires() {
        for(int i = 0; i < this.nbreEmploye; ++i) {
            System.out.println(this.staff[i].getNom() + " gagne " + this.staff[i].calculerSalaire() + " francs.");
        }

    }
}
