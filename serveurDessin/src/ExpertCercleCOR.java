import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ExpertCercleCOR extends ExpertDessinCOR {

    protected ExpertCercleCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }

    @Override
    public boolean Dessiner(String s, Graphics2D g) {
        //pour un cercle on envoi sous forme  : 2;rayon;centre
        String sousChaine[]= s.split(";");


        if(sousChaine[0].equals("2")){
            String point[] =sousChaine[2].split(",") ;
            Shape c = new Ellipse2D.Double(Double.parseDouble(point[0]),Double.parseDouble(point[1]),Double.parseDouble(sousChaine[1]),Double.parseDouble(sousChaine[1]));
            g.draw(c);
            return true;
        }
        return false;
    }
}
