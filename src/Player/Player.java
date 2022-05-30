package Player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private double HP;
    private double hunger;
    private double brain;
    //TODO: items variables, and methods for objects like fire or pick. Like: public void makePick(int tree_count, grass_count){ tree--; grass--; pick++}
    private List<String> bag = new ArrayList<>();

    public Player() {
        this.HP=100;
        this.brain=100;
        this.hunger=100;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP-1;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) { //gettert kap
        this.hunger = hunger-1;
    }

    public double getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain-1;
    }

    public List<String> getBag() {
        return bag;
    }

    public void setBag(List<String> bag) {
        this.bag = bag;
    }
    public void newBagItem(String name){
        bag.add(name);

    }

    public void writeBagItems(){
        for (int i=0; i < bag.size(); i++) {
            System.out.println(bag.get(i) + " ");
        }
    }

}
