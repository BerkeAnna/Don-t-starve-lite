package map;

import Player.Player;

import java.util.Random;
import java.util.Scanner;

public class Map {
    int width=10;
    int height=10;
    MapField[][] map;
    int fieldsCount= width*height;
    int playerPosX=1;
    int playerPosY=9;
    Player player = new Player();


    public Map() {

         map = new MapField[width][height];

    }
    public void mapWrite(){
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
                            if(ratio>5) {
//                                isItPlayer(i,j ,"|Gr|" );
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Grass();
                                    System.out.print("|Gr|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 1:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Tree();
                                    System.out.print("|Tr|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 2:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Stone();
                                    System.out.print("|St|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 3:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Flower();
                                    System.out.print("|Fl|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 4:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Twig();
                                    System.out.print("|Tw|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                System.out.print("|00|");
                                 }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 5:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Carrot();
                                    System.out.print("|Cr|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
                                }
                            }
                            break;
                        case 6:
                            if(ratio>5) {
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new Berry();
                                    System.out.print("|Be|");
                                }
                            }else{
                                if(i==playerPosX && j== playerPosY){
                                    System.out.print("|00|");
                                }else {
                                    map[i][j] = new MapField();
                                    System.out.print("|  |");
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

        public void playerPos(){

            System.out.println("Direction (l, r, u, d): ");
            Scanner in = new Scanner(System.in);
            String direction = in.nextLine();
            String directionName;
            switch (direction){
                case "l": playerPosY = playerPosY-1;
                    if(playerPosY<0){
                        playerPosY=0;
                    }
                    directionName="left";
                    break;
                case "r": playerPosY = playerPosY+1;
                    if(playerPosY>=width){
                        playerPosY=width-1;
                    }
                    directionName="right";
                    break;
                case "u": playerPosX = playerPosX-1;
                    if(playerPosX<0){
                        playerPosX=0;
                    }
                    directionName="up";
                    break;
                case "d": playerPosX = playerPosX+1;
                    if(playerPosX>=height){
                        playerPosX=height-1;
                    }
                    directionName="down";
                    break;
                default:
                    directionName = "";
            }
            System.out.println("New step is " + directionName + "\nAnd the new position: ("+ playerPosX + ";" + playerPosY + ")" );


            mapWrite();
            playerPos();


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





