package Player;

import map.*;
import Player.Axe;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private double HP;
    private double hunger;
    private double brain;
    //TODO: items variables, and methods for objects like fire or pick. Like: public void makePick(int tree_count, grass_count){ tree--; grass--; pick++}
    private List<String> bag = new ArrayList<>();
    public Berry berry = new Berry();
    public Carrot carrot = new Carrot();
    public Grass grass = new Grass();
    public Stone stone = new Stone();
    public Tree tree = new Tree();
    public Twig twig = new Twig();
   // Axe axe = new Axe();


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

    public void pickUpItem(MapField[][] map, int playerX, int playerY){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                    if(i== playerX && j == playerY){
                        if (map[i][j] instanceof Berry ) {
                            berry.plus();
                            System.out.print(berry);
                        } else if (map[i][j] instanceof Carrot) {
                            carrot.plus();
                            System.out.print(carrot);
                        } else if (map[i][j] instanceof Grass) {
                            grass.plus();
                            System.out.print(grass);
                        } else if (map[i][j] instanceof Stone) {
                            stone.plus();
                            System.out.print(stone);
                        } else if (map[i][j] instanceof Tree) {
                            tree.plus();
                            System.out.print(tree);
                        } else if (map[i][j] instanceof Twig) {
                            twig.plus();
                            System.out.print(twig);
                        } else if (map[i][j] instanceof Water){

                        }
                    }
            }
        }

    }




}
