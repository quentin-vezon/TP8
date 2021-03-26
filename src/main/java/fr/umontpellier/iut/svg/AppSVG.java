package fr.umontpellier.iut.svg;

public class AppSVG {
    public static void main(String[] args) {

       // SVG s1 = new SVG(1000, 1000);
        Circle c1 = new Circle(50, 50, 20);
      /* Style p1 = new Style();
        p1.setStroke("black");
        p1.setFill("red");
        c1.setStyle(p1);
        c1.toSVG();
        s1.add(c1);
        s1.saveAsFile("cercletest.svg");
      */
      //  SVG s2 = new SVG(1000, 1000);
        Rectangle r1 = new Rectangle(100, 100, 50, 20);
      /*  r1.toSVG();
        Style  p2 = new Style();
        p2.setStroke("blue");
        p2.setFill("green");
        r1.setStyle(p2);
        s2.add(r1);
        s2.saveAsFile("rectangletest.svg");
       */
     /*   SVG s3 = new SVG(1000, 1000);
        s3.add(c1);
        s3.add(r1);
        s3.saveAsFile("q5test.svg");
     */
        SVG s4 = new SVG(1000, 1000);
        Group g1 = new Group();
        g1.add(c1);
        g1.add(r1);
        Style p3 = new Style();
        p3.setFill("blue");
        g1.setStyle(p3);
        s4.add(g1);
        s4.saveAsFile("testgroup.svg");

    }
}
