package fr.umontpellier.iut.expressions;

public class Nombre implements Expression {

    private double chiffre;
    public Nombre(double valeur) {
        this.chiffre = valeur;
    }

    @Override
    public double calculerValeur() {
         return chiffre;

    }

    @Override
    public String toString() {
        return "" + chiffre;
    }
}
