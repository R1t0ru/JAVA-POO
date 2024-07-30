import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    public abstract class Compte {
        private Personne proprietaire;
        private final long numero; // Immutable
        private double solde;
        private static long compteur;

        public Compte(Personne proprietaire, double solde) {
            this.proprietaire = proprietaire;
            this.numero = ++compteur;
            this.solde = solde;
        }

        public Personne getProprietaire() {return proprietaire;}
        public void setProprietaire(Personne proprietaire) {this.proprietaire = proprietaire;}

        public long getNumero() {return numero;}
        //public void setNumero(long numero) {this.numero = numero;}

        public double getSolde() {return solde;}
        public void setSolde(double solde) {this.solde = solde;}

        public void retirer(double montant) {
            if (montant <= solde) {
                solde -= montant;
                System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
            } else {
                System.out.println("Retrait impossible, solde insuffisant.");
            }
        }

        public void credit(double montant) {
            solde += montant;
            System.out.println("Crédit de " + montant + " effectué. Nouveau solde : " + solde);
        }

        public void virement(Compte destination, double montant) {
            if (montant <= solde) {
                this.retirer(montant);
                destination.credit(montant);
                System.out.println("Virement de " + montant + " vers le compte numéro " + destination.getNumero() + " effectué.");
            } else {
                System.out.println("Virement impossible, solde insuffisant.");
            }
        }

        @Override
        public String toString() {
            return "Compte { " +
                    "propriétaire = " + proprietaire +
                    ", numéro = " + numero +
                    ", solde = " + solde +
                    " }";
        }
    }
