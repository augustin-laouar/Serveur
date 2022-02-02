//package ExpertCOR;
import java.awt.*;

public abstract class ExpertDessinCOR extends ExpertDessin {
    protected ExpertDessinCOR suivant;

    protected ExpertDessinCOR(ExpertDessinCOR suivant){
        this.suivant = suivant;
    }

    public boolean DessinerForme(String s, Graphics2D g){ //tu dois utiliser cette methode
        boolean result;
        result = Dessiner(s,g);
        if(!result){
            if(this.suivant != null){
                return this.suivant.DessinerForme(s,g);
            }
            else{
                return false;
            }
        }
        else{
            return result;
        }
    }
    public abstract boolean Dessiner(String s,Graphics2D g);
}
