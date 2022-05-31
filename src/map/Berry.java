package map;

public class Berry extends MapField {
    private int piece;

    public Berry() {
        this.piece=0;
    }

    public void plus() {
        piece++;
    }


    @Override
    public String toString() {
        return  "+1 berry\n";
    }


}
