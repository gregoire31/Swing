class Representant extends Commercial {
    private static final double POURCENT_REPRESENTANT = 0.2D;
    private static final int BONUS_REPRESENTANT = 800;

    public Representant(String prenom, String nom, int age, String date, double chiffreAffaire) {
        super(prenom, nom, age, date, chiffreAffaire);
    }

    public double calculerSalaire() {
        return 0.2D * this.getChiffreAffaire() + 800.0D;
    }

    public String getTitre() {
        return "Le représentant ";
    }
}
