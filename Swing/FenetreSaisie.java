import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static java.lang.System.*;



public class FenetreSaisie{
    JTextField jtfNom = new JTextField("");
    JTextField jtfPrenom = new JTextField("");
    JTextField jtfAge = new JTextField("");
    JTextField jtfAnneeEntree = new JTextField("");
    JTextField jtfUnite = new JTextField("");




    public FenetreSaisie() {

        Personnel p = new Personnel();


        p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000.0D));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000.0D));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));





        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");


        JFrame fenetre = new JFrame();


        fenetre.setTitle("Fenetre de saisie");

        fenetre.setSize(1920, 1500);

        fenetre.setLocationRelativeTo(null);

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel pan = new JPanel();

        JButton change = new JButton("Ajouter Employé");
        JButton afficherSalaries = new JButton("Afficher Employe");
        pan.setBackground(Color.LIGHT_GRAY);
        pan.add(change);
        pan.add(afficherSalaries);




        JPanel pan2 = new JPanel();
        JButton boutonR = new JButton("Revenir à l'écran d'accueil");





         JPanel container = new JPanel();

         JComboBox<String> combo = new JComboBox<String>();
        combo.addItem("Manutentionnaire");
        combo.addItem("Manutentionnaire à risque");
        combo.addItem("Representant");
        combo.addItem("Technicien");
        combo.addItem("Technicien à risque");
        combo.addItem("Vendeur");

        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fenetre.setContentPane(container);
                fenetre.revalidate();

            }
        });


        Font police = new Font("Arial", Font.BOLD, 14);
        jtfNom.setFont(police);
        jtfNom.setPreferredSize(new Dimension(150, 30));



        jtfPrenom.setFont(police);
        jtfPrenom.setPreferredSize(new Dimension(150, 30));

        jtfAge.setFont(police);
        jtfAge.setPreferredSize(new Dimension(150, 30));

        jtfAnneeEntree.setFont(police);
        jtfAnneeEntree.setPreferredSize(new Dimension(150, 30));


        jtfUnite.setFont(police);
        jtfUnite.setPreferredSize(new Dimension(150, 30));

        JLabel labelNom = new JLabel("                                                  NOM :");
        JLabel labelPrenom = new JLabel("PRENOM : ");
        JLabel labelAge = new JLabel("Age : ");
        JLabel labelAneeEntree = new JLabel("Annee Entrée : ");
        JLabel labelUnite = new JLabel("Unite : ");

        container.add(labelNom);
        container.add(jtfNom);
        container.add(labelPrenom);
        container.add(jtfPrenom);
        container.add(labelAge);
        container.add(jtfAge);
        container.add(labelAneeEntree);
        container.add(jtfAnneeEntree);
        container.add(labelUnite);
        container.add(jtfUnite);
        JLabel espace = new JLabel("                                 ");
        JLabel espace2 = new JLabel("                                 ");
        JLabel espace3 = new JLabel("                                                                                                                  ");
        JButton ajoutEmploye = new JButton ("Valider");
        JButton retour = new JButton ("Retour");
        container.add(espace);
        container.add(combo);
        container.add(espace2);
        container.add(ajoutEmploye);
        container.add(espace3);
        container.add(retour);

        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedItem().toString());
            }
        });
        retour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetre.setContentPane(pan);
                fenetre.revalidate();

            }
        });
        boutonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fenetre.setContentPane(pan);
                fenetre.revalidate();

            }
        });
        afficherSalaries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pan2.removeAll();
                int nbrEmp = p.nombreEmploye();
                String[] lesCategories;
                String[] lesNoms;
                String[] lesPrenoms;
                int[] lesAges;
                String[] lesDates;
                double[] lesSalaires;
                lesCategories = p.getCategorie();
                lesNoms = p.getNom();
                lesPrenoms = p.getPrenom();
                lesAges = p.getAge();
                lesSalaires = p.getSalaires();
                lesDates = p.getDateEntree();

                for(int i = 0 ; i < nbrEmp ; i++){

                    JLabel jlC = new JLabel("                Categorie : ");
                    jlC.setPreferredSize(new Dimension(150,30));
                    JTextField fjC = new JTextField(lesCategories[i]);
                    fjC.setPreferredSize(new Dimension(150,30));
                    pan2.add(jlC);
                    pan2.add(fjC);

                    JLabel jlN = new JLabel("                Nom : ");
                    jlN.setPreferredSize(new Dimension(150,30));
                    JTextField fjN = new JTextField(lesNoms[i]);
                    fjN.setPreferredSize(new Dimension(150,30));
                    pan2.add(jlN);
                    pan2.add(fjN);

                    JLabel jlP = new JLabel("                Prenom : ");
                    jlP.setPreferredSize(new Dimension(150,30));

                    JTextField fjP = new JTextField(lesPrenoms[i]);
                    fjP.setPreferredSize(new Dimension(150,30));
                    pan2.add(jlP);
                    pan2.add(fjP);

                    JLabel jlA = new JLabel("                 Age : ");
                    jlA.setPreferredSize(new Dimension(150,30));
                    String ageS = Integer.toString(lesAges[i]);
                    JTextField fjA = new JTextField(ageS);
                    fjA.setPreferredSize(new Dimension(150,30));
                    pan2.add(jlA);
                    pan2.add(fjA);

                    JLabel jlD = new JLabel("              Date d'entrée : ");
                    jlD.setPreferredSize(new Dimension(150,30));
                    JTextField fjD = new JTextField(lesDates[i]);
                    fjD.setPreferredSize(new Dimension(150,30));
                    pan2.add(jlD);
                    pan2.add(fjD);

                    JLabel jlS = new JLabel("              Salaire : ");
                    jlS.setPreferredSize(new Dimension(150,30));
                    String salaires = Double.toString(lesSalaires[i]);
                    JTextField fjS = new JTextField(salaires);
                    fjS.setPreferredSize(new Dimension(150,30));
                    pan2.add(jlS);
                    pan2.add(fjS);
                }

                pan2.add(boutonR);
                fenetre.setContentPane(pan2);
                fenetre.revalidate();

            }
        });

        ajoutEmploye.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String maSelection = combo.getSelectedItem().toString();

                String nom = jtfNom.getText();
                String prenom = jtfPrenom.getText();
                String ageI = jtfAge.getText();
                int age = Integer.parseInt(ageI);
                String Date = jtfAnneeEntree.getText();
                String unitex = jtfUnite.getText();
                int unite = Integer.parseInt(unitex);
                if(maSelection == "Manutentionnaire"){
                    p.ajouterEmploye(new Manutentionnaire(prenom,nom,age,Date,unite));
                }
                if(maSelection == "Manutentionnaire à risque"){
                    p.ajouterEmploye(new ManutARisque(prenom,nom,age,Date,unite));
                }
                if(maSelection == "Representant"){
                    p.ajouterEmploye(new Representant(prenom,nom,age,Date,unite));
                }
                if(maSelection == "Technicien"){
                    p.ajouterEmploye(new Technicien(prenom,nom,age,Date,unite));
                }
                if(maSelection == "Technicien à risque"){
                    p.ajouterEmploye(new TechnARisque(prenom,nom,age,Date,unite));
                }
                if(maSelection == "Vendeur"){
                    p.ajouterEmploye(new Vendeur(prenom,nom,age,Date,unite));
                }
                jtfNom.setText("");
                jtfPrenom.setText("");
                jtfAge.setText("");
                jtfAnneeEntree.setText("");
                jtfUnite.setText("");
                fenetre.setContentPane(pan);
                fenetre.revalidate();
            }

        });


        fenetre.setContentPane(pan);

        fenetre.setVisible(true);





    }

}
