//public class CompteEpargne {
//    private Personne proprietaire;
//    private long numero;
//    private double solde;
//    private double interet;
//
//    public CompteEpargne(Personne proprietaire, long numero, double solde, double interet) {
//        this.proprietaire = proprietaire;
//        this.numero = numero;
//        this.solde = solde;
//        this.interet = interet;
//    }
//
//    public Personne getProprietaire() {
//        return proprietaire;
//    }
//
//    public void setProprietaire(Personne proprietaire) {
//        this.proprietaire = proprietaire;
//    }
//
//    public long getNumero() {
//        return numero;
//    }
//
//    public void setNumero(long numero) {
//        this.numero = numero;
//    }
//
//    public double getSolde() {
//        return solde;
//    }
//
//    public void setSolde(double solde) {
//        this.solde = solde;
//    }
//
//    public double getInteret() {
//        return interet;
//    }
//
//    public void setInteret(double interet) {
//        this.interet = interet;
//    }
//
//    public void retirer(double montant) {
//        if (this.solde - montant >= 0) {
//            this.solde -= montant;
//            System.out.println("Retrait effectué. Nouveau solde: " + this.solde);
//        } else {
//            System.out.println("Retrait impossible, solde insuffisant.");
//        }
//    }
//
//    public void crediter(double montant) {
//        this.solde += montant;
//        System.out.println("Crédit effectué. Nouveau solde: " + this.solde);
//    }
//}

public class CompteEpargne extends Compte {
    private double interet;

    public CompteEpargne(Personne proprietaire, double solde, double interet) {
        super(proprietaire, solde);
        this.interet = interet;
    }

    public double getInteret() {
        return interet;
    }

    public void setInteret(double interet) {
        this.interet = interet;
    }

}