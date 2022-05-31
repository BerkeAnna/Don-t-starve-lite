package map;

public class Carrot extends MapField implements ItemPlus{
    private int piece;
    public Carrot() {
        this.piece=0;

    }
    @Override
    public void plus() {
        piece++;
    }

    @Override
    public String toString() {
        return "+1 carrot\n";
    }
}
