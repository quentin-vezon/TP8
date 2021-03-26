package fr.umontpellier.iut.expressions;

public class Operation implements Expression {

    char signe;
    Expression eDroite;
    Expression eGauche;

    public Operation(char operateur, Expression expressionGauche, Expression expressionDroite){
     this.signe = operateur;
     this.eDroite = expressionDroite;
     this.eGauche = expressionGauche;

    }

    @Override
    public double calculerValeur() {
        if(signe == '+'){
            return (eGauche.calculerValeur() + eDroite.calculerValeur());
        }
        if(signe == '-'){
            return (eGauche.calculerValeur() - eDroite.calculerValeur());
        }
        if(signe == '*'){
            return (eGauche.calculerValeur() * eDroite.calculerValeur());
        }
        if(signe == '/'){
          if(eDroite.calculerValeur() != 0){
              return (eGauche.calculerValeur() / eDroite.calculerValeur());
          }
        }
        return(0);
    }


    @Override
    public String toString() {
        return "(" + eGauche + signe + eDroite + ")" ;
    }
}
