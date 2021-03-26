package fr.umontpellier.iut.svg;

import java.util.Locale;

public class Rectangle extends Tag2{
    private double x;
    private double y;
    private double width;
    private double height;



    public Rectangle(double x, double y, double width, double height) {
        super("rect");
        this.x = x;
        this.y = y;
        this.width = width;
        this.height= height;

    }


    @Override
    public String getParameters() {
        return String.format(Locale.US, "x=\"%f\" y=\"%f\" width=\"%f\" height=\"%f\"", this.x, this.y, this.width, this.height);
    }


}
