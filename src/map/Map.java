package map;

import Player.Player;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Map {
    int width=10;
    int height=10;
    MapField[][] map;
    int fieldsCount= width*height;
    int playerPosX=1;
    int playerPosY=5;
    Player player = new Player();
    public boolean night = false;
    Twig twig = new Twig();


    public Map() {
         map = new MapField[width][height];
         mapFieldType();
    }

    public void mapFieldType(){
        int notfree = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                Random random = new Random();
                //            int x = random.nextInt(10);
                //            int y = random.nextInt(10);

                if (notfree < fieldsCount) {
                    int ratio = random.nextInt(10);
                    int field = random.nextInt(7);
                    switch (field) {
                        case 0:
                            if(ratio>6) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Grass();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 1:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Tree();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 2:
                            if(ratio>8) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Stone();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 3:
                            if(ratio>8) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Flower();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 4:
                            if(ratio>6) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Twig();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                 }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 5:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Carrot();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        case 6:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new Berry();
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                }else {
                                    map[i][j] = new MapField();
                                }
                            }
                            break;
                        default:
                            break;

                    }
                    notfree++;
                }

            }
            System.out.println();
        }
        }

        public void writeMap() {

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (i == playerPosX && j == playerPosY) {
                        System.out.print("|00|");
                    } else if (map[i][j] instanceof Berry ) {
                        System.out.print("|Be|");
                    } else if (map[i][j] instanceof Carrot) {
                        System.out.print("|Ca|");
                    }else if (map[i][j] instanceof Flower) {
                        System.out.print("|Fl|");
                    }else if (map[i][j] instanceof Grass) {
                        System.out.print("|Gr|");
                    } else if (map[i][j] instanceof Stone) {
                        System.out.print("|St|");
                    } else if (map[i][j] instanceof Tree) {
                        System.out.print("|Tr|");
                    } else if (map[i][j] instanceof Twig) {
                        System.out.print("|Tw|");
                    } else if (map[i][j] instanceof Water) {
                        System.out.print("|~~|");
                    } else {
                        System.out.print("|  |");
                    }
                }
                System.out.println();
            }
        }

        public void playerPos(){

            System.out.println("Direction (w, a, s, d): ");
            Scanner in = new Scanner(System.in);
            String direction = in.nextLine();
            String directionName;
            switch (direction){
                case "a": playerPosY = playerPosY-1;
                    if(playerPosY<0){
                        playerPosY=0;
                    }
                    directionName="left";
                    player.pickUpItem(map, playerPosX, playerPosY);
                    playerinfo();
                    break;
                case "d": playerPosY = playerPosY+1;
                    if(playerPosY>=width){
                        playerPosY=width-1;
                    }
                    directionName="right";
                    player.pickUpItem(map, playerPosX, playerPosY);
                    playerinfo();
                    break;
                case "w": playerPosX = playerPosX-1;
                    if(playerPosX<0){
                        playerPosX=0;
                    }
                    directionName="up";
                    player.pickUpItem(map, playerPosX, playerPosY);
                    playerinfo();
                    break;
                case "s": playerPosX = playerPosX+1;
                    if(playerPosX>=height){
                        playerPosX=height-1;
                    }
                    directionName="down";
                    player.pickUpItem(map, playerPosX, playerPosY);
                    playerinfo();
                    break;
                case "axe":
                    player.playerDoTools("axe");
                case "pick":
                    player.playerDoTools("pick");
                case "campfire":
                    player.playerDoTools("campfire");
                case "wreath":
                    player.playerDoTools("wreath");
                default:
                    directionName = "";
            }
            System.out.println("New step is " + directionName + "\nAnd the new position: ("+ playerPosX + ";" + playerPosY + ")" );
            System.out.println("Player HP: " + player.getHP() + " Brain: " + player.getBrain() + " Hunger: " + player.getHunger());
//            player.writePlayerBag();
//            player.toString();



//            mapFieldType();
            writeMap();
            playerPos();

        }

        public void playerinfo(){
            player.setHunger(0.4);
            if(night) {
                player.setBrain(0.4);
            }
        }

        public void putInTheBag(String step){
            switch (step){
                case "r" :
                    if(map[playerPosX][playerPosY-1] instanceof Berry){
                            player.newBagItem("Berry");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Carrot){
                        player.newBagItem("Carrot");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Flower){
                        player.newBagItem("Flower");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Grass){
                        player.newBagItem("Grass");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Stone){
                        player.newBagItem("Stone");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Tree){
                        player.newBagItem("Tree");
                    }
                    else if(map[playerPosX][playerPosY-1] instanceof Twig){
                        player.newBagItem("Twig");
                    }
                    player.writeBagItems();
            }
        }

        public void isItPlayer(int i, int j, String fieldname){
                if(i==playerPosX && j== playerPosY){
                    System.out.print("|00|");
                }else{
                    System.out.print(fieldname);
                    switch (fieldname){
                        case "|Gr|" : map[i][j] = new Grass();
                            System.out.print(fieldname);
                            break;
//                        case "|Be|" : map[i][j] = new Berry();
//                            break;
//                        case "|Ca|" : map[i][j] = new Carrot();
//                            break;
//                        case "|Fl|" : map[i][j] = new Flower();
//                            break;
//                        case "|St|" : map[i][j] = new Stone();
//                            break;
//                        case "|Tr|" : map[i][j] = new Tree();
//                            break;
//                        case "|Tw|" : map[i][j] = new Twig();
//                            break;
                        default:
                            System.out.print("|  |");
                            break;

                    }
                }
        }

        //végigmegy +1 random switchben mehgínzi melyik
//        public void MapObjects(){
//            int notfree=0;
//            for (int i = 0; i < map.length; i++) {
//                for (int j = 0; j < map[i].length; j++) {
//                    Random random = new Random();
//                    //            int x = random.nextInt(10);
//                    //            int y = random.nextInt(10);
//
//                    if (notfree<fieldsCount){
//                        int ratio = random.nextInt(10);
//                        int field = random.nextInt(2);
//                        switch (field){
//                            case 0 : map[i][j]= new Grass();
//                            case 1 : map[i][j] = new Water();
//                        }
//                    }
//                }
//            }
//        }
    }





