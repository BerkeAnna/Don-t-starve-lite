package map;

public class Twig extends MapField{
    private int piece;
    public Twig() {
        this.piece=0;

    }

    public void plus() {
        piece++;
    }

    @Override
    public String toString() {
        return "+1 twig\n";
    }
}
