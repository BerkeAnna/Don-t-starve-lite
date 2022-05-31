package Player;

import map.Grass;
import map.Twig;

public class Axe {
    private int piece;

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
            this.piece++;
            System.out.println("+1 axe");
        }else{
            System.out.println("You can't make Axe!");
        }


    }

//    @Override
//    public String toString() {
//        return "+1 axe";
//    }
}
