public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne();
        personne.setPrenom("Martin");
        personne.setNom("Dupont");
        System.out.println(personne.toString());

        CompteEpargne compteEpargne = new CompteEpargne(personne, 1000, 0.02);

        CompteCourant compteCourant = new CompteCourant(personne, 2000, 0.03);

    }
}