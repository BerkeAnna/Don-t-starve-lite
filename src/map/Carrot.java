package map;

public class Carrot extends MapField implements ItemPlus{
    private int piece;
    public Carrot() {
        this.piece=0;

    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    @Override
    public void plus() {
        piece++;
    }

    @Override
    public void minus(int number) {
        this.piece-=number;
    }

    @Override
    public String toString() {
        return "+1 carrot\n";
    }

    public void eatCarrot(){
        setPiece(getPiece()-1);
        System.out.println("Eat carrot!\n-1 Carrot");
    }
}
