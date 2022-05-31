package Player;

public class FlowerWreath {
    private int piece;

    public FlowerWreath() {

    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public void createWreath(int flower){
        if(flower>=10 ){
            this.piece++;
            System.out.println("+1 flower wreath");
        }else{
            System.out.println("You can't make flower wreath!");
        }


    }
}
