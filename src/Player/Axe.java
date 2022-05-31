package Player;

import map.Grass;
import map.Twig;

public class Axe {
    private int piece;
    public Grass grass = new Grass();
    public Twig twig = new Twig();

    public Axe() {

    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public void createAxe(int grass, int twig){
        if(grass>=2 && twig>=3){
            this.grass.minus(2);
            this.twig.minus(3);
            this.piece++;
            System.out.println("+1 axe");
        }


    }

//    @Override
//    public String toString() {
//        return "+1 axe";
//    }
}
