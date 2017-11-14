class Technicien extends Employe {
    private static final double FACTEUR_UNITE = 5.0D;
    private int unites;

    public Technicien(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date);
        this.unites = unites;
    }

    public double calculerSalaire() {
        return 5.0D * (double)this.unites;
    }

    public String getTitre() {
        return "Le technicien ";
    }
}
