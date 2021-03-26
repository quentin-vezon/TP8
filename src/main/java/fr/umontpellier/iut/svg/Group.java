package fr.umontpellier.iut.svg;

import java.util.List;
import java.util.LinkedList;

public class Group extends Tag2{

    //private List<Tag2> gList;
    private SVG gSVG ;

    public Group() {
        super("g");
        //this.gList = new LinkedList<Tag2>();
        this.gSVG = new SVG(0,0);
    }

    public void add(Tag2 t) {
        gSVG.add(t);
        //  gList.add(t);
    }

    @Override
    public String getParameters(){
        return "";
    }

    @Override
    public String getContent() {
        return gSVG.getContent();
    }



}
