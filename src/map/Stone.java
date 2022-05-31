package map;

public class Stone extends MapField{
    private int piece;
    public Stone() {
        this.piece=0;

    }

    public void plus() {
        piece++;
    }

    @Override
    public String toString() {
        return "+1 stone\n";
    }
}
