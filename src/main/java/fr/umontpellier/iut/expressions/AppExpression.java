package fr.umontpellier.iut.expressions;

public class AppExpression {

    public static void main(String[] args) {


        Expression monExpr = new Operation( '*', new Operation('-', new Nombre(2), new Nombre(3)), new Nombre(5));
        double resultat = monExpr.calculerValeur();
        System.out.println(monExpr.toString());
        System.out.println(resultat);

        Expression monExpr2 = new Operation( '+', new Operation('*', new Nombre(2), new Nombre(3)), new Nombre(5));
        double resultat2 = monExpr2.calculerValeur();
        System.out.println(monExpr2.toString());
        System.out.println(resultat2);

        Expression monExpr3 = new Operation( '-', new Operation('*', new Nombre(5), new Nombre(4)), new Operation('/', new Nombre(9), new Nombre(6)));
        double resultat3 = monExpr3.calculerValeur();
        System.out.println(monExpr3.toString());
        System.out.println(resultat3);
    }
}
