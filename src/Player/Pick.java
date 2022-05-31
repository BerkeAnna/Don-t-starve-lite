package Player;

public class Pick {
    private int piece;

    public Pick() {

    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public void createPick(int grass, int tree){
        if(grass>=2 && tree>=2){
            this.piece++;
            System.out.println("+1 pick");
        }else{
            System.out.println("You can't make Picks!");
        }


    }

}
