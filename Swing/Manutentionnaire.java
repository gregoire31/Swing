class Manutentionnaire extends Employe {
    private static final double SALAIRE_HORAIRE = 65.0D;
    private int heures;

    public Manutentionnaire(String prenom, String nom, int age, String date, int heures) {
        super(prenom, nom, age, date);
        this.heures = heures;
    }

    public double calculerSalaire() {
        return 65.0D * (double)this.heures;
    }

    public String getTitre() {
        return "Le manut. ";
    }
}
