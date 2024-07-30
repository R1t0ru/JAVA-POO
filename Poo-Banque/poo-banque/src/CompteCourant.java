//public class CompteCourant {
//    private Personne proprietaire;
//    private long numero;
//    private double solde;
//    private double decouvert;
//
//    public CompteCourant(Personne proprietaire, long numero, double solde, double decouvert) {
//        this.proprietaire = proprietaire;
//        this.numero = numero;
//        this.solde = solde;
//        this.decouvert = decouvert;
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
//    public double getDecouvert() {
//        return decouvert;
//    }
//
//    public void setDecouvert(double decouvert) {
//        this.decouvert = decouvert;
//    }
//
//    public void retirer(double montant) {
//        if (this.solde - montant >= -this.decouvert) {
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

public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(Personne proprietaire, double solde, double decouvert) {
        super(proprietaire, solde);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant) {
        if (this.getSolde() - montant >= -this.decouvert) {
            this.setSolde(this.getSolde() - montant);
            System.out.println("Retrait effectué. Nouveau solde: " + this.getSolde());
        } else {
            System.out.println("Retrait impossible, solde insuffisant.");
        }
    }
}