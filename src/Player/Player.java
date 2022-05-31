package Player;

import map.*;
import Player.Axe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    Flower flower = new Flower();
     Twig twig = new Twig();
    Axe axe = new Axe();
    Pick pick = new Pick();
    CampFire campFire = new CampFire();
    FlowerWreath flowerWreath = new FlowerWreath();


    public Player() {
        this.HP=100.0;
        this.brain=100.0;
        this.hunger=100.0;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP -= HP;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) { //gettert kap
        this.hunger -= hunger;
    }

    public double getBrain() {
        return brain;
    }

    public void setBrain(double brain) {
        this.brain -= brain;
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
                            berry.setPiece(berry.getPiece()+1);
                            System.out.print(berry);
                        } else if (map[i][j] instanceof Carrot) {
                            carrot.setPiece(carrot.getPiece()+1);
                            System.out.print(carrot);
                        } else if (map[i][j] instanceof Grass) {
                            grass.setPiece(grass.getPiece()+1);
                            System.out.print(grass);
                        } else if (map[i][j] instanceof Stone) {
                            stone.setPiece(stone.getPiece()+1);
                            System.out.print(stone);
                        } else if (map[i][j] instanceof Tree) {
                            tree.setPiece(tree.getPiece()+1);
                            System.out.print(tree);
                        } else if (map[i][j] instanceof Twig) {
                            twig.setPiece(twig.getPiece()+1);
                            System.out.println("\nTwig db: " + twig.getPiece());
                        } else if (map[i][j] instanceof Water){

                        }
                    }
            }
        }

    }

    public void playerDoTools(String tool){
        if(Objects.equals(tool, "axe") && grass.getPiece()>=2 && twig.getPiece()>=3){
            axe.createAxe(grass.getPiece(),twig.getPiece());
            grass.setPiece(grass.getPiece()-2);
            twig.setPiece(twig.getPiece()-3);
            System.out.println("Grass: " + grass.getPiece());
            System.out.println("Twig " + twig.getPiece());
        }
        else if(Objects.equals(tool, "pick") && grass.getPiece()>=2 && tree.getPiece()>=2){
            pick.createPick(grass.getPiece(),tree.getPiece());
            grass.setPiece(grass.getPiece()-2);
            tree.setPiece(tree.getPiece()-2);
            System.out.println("Grass: " + grass.getPiece());
            System.out.println("tree " + tree.getPiece());

        }
        else if(Objects.equals(tool, "campfire") && grass.getPiece()>=2 && tree.getPiece()>=2 && stone.getPiece()>=4){
            campFire.createFire(grass.getPiece(),tree.getPiece(), stone.getPiece());
            grass.setPiece(grass.getPiece()-2);
            tree.setPiece(tree.getPiece()-2);
            stone.setPiece(stone.getPiece()-4);
            System.out.println("Grass: " + grass.getPiece());
            System.out.println("tree " + tree.getPiece());
            System.out.println("stone " + stone.getPiece());

        }
        else if(Objects.equals(tool, "wreath") && flower.getPiece()>=10 ){
            flowerWreath.createWreath(flower.getPiece());
            flower.setPiece(flower.getPiece()-10);
            System.out.println("Flower: " + flower.getPiece());

        }

    }




}
