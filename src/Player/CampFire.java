package Player;

public class CampFire {
    private int piece;

    public CampFire() {

    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public void createFire(int grass, int tree, int stone){
        if(grass>=2 && tree>=2 && stone>=4){
            this.piece++;
            System.out.println("+1 campfire");
        }else{
            System.out.println("You can't make campfire!");
        }


    }
}
