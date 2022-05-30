package Player;

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
        if(grass<=2 && twig<=3){
            grass-=2;
            twig-=3;
            this.piece++;
        }

    }

    public void countAxe(){
        System.out.println("Axe: "+ piece);
    }
}
