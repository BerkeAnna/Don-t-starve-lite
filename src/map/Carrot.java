package map;

public class Carrot extends MapField{
    private int piece;
    public Carrot() {
        this.piece=0;

    }

    public void plus() {
        piece++;
    }

    @Override
    public String toString() {
        return "+1 carrot\n";
    }
}
