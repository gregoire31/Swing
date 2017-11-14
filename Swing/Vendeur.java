class Vendeur extends Commercial {
    private static final double POURCENT_VENDEUR = 0.2D;
    private static final int BONUS_VENDEUR = 400;

    public Vendeur(String prenom, String nom, int age, String date, double chiffreAffaire) {
        super(prenom, nom, age, date, chiffreAffaire);
    }

    public double calculerSalaire() {
        return 0.2D * this.getChiffreAffaire() + 400.0D;
    }

    public String getTitre() {
        return "Le vendeur ";
    }
}
