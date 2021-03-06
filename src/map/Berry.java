package map;

public class Berry extends MapField implements ItemPlus {
    private int piece;

    public Berry() {
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
        return  "+1 berry\n";
    }

    public void eatBerry(){
        setPiece(getPiece()-1);
        System.out.println("Eat berry!\n-1 Berry");
    }


}
