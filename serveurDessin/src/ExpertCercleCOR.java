import java.awt.*;
import java.awt.geom.Ellipse2D;

public class ExpertCercleCOR extends ExpertDessinCOR {

    protected ExpertCercleCOR(ExpertDessinCOR suivant) {
        super(suivant);
    }

    @Override
    public boolean Dessiner(String s, Graphics2D g) {
        //pour un cercle on envoi sous forme  : 2;nbPoints;rayon;centre;color
        String sousChaine[]= s.split(";");
        int cl[]= new int[3];
        if(sousChaine[0].equals("2")){
            cl= RecupererCouleur(sousChaine);
            Color c = new Color(cl[0],cl[1],cl[2]);
            g.setColor(c);
            String point[] =sousChaine[3].split(",") ;
           /* Shape cercle = new Ellipse2D.Double(Double.parseDouble(point[0]),Double.parseDouble(point[1]),Double.parseDouble(sousChaine[2]),Double.parseDouble(sousChaine[2]));
            g.draw(cercle);*/
            g.fillOval(Integer.parseInt(point[0]) + Dessin.boundsX,Integer.parseInt(point[1]) + Dessin.boundsY,Integer.parseInt(sousChaine[2]),Integer.parseInt(sousChaine[2]));
            return true;
        }
        return false;
    }
}
