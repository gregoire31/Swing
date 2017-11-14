abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private String date;

    public Employe(String prenom, String nom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    public abstract double calculerSalaire();

    public String getTitre() {
        return "L'employé ";
    }

    public String getNom() {
        return this.getTitre() + this.prenom + " " + this.nom;
    }

    public String getnom() {
        return this.nom;
    }
    public String getprenom() {
        return this.prenom;
    }
    public int getage() {
        return this.age;
    }
    public String getdate() {
        return this.date;
    }
    public double getsalaire() {
        return calculerSalaire();
    }
}
