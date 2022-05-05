package com.zoo;

import java.util.Scanner;

public class ZooProgram {
    public void informationAbout() {
        ZooGroup zooGroup = new ZooGroup();
        System.out.println("HelLo! Welcome to our program! This is our zoo list.");
        System.out.print("Now you can see the following animals: ");
        printChose();
        try {
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNext("")) {
                switch (scanner.nextInt()) {
                    case 1:
                        zooGroup.lion.informationAboutZoo();
                        System.out.println(zooGroup.lion.getMoveAnimal());
                        System.out.println(zooGroup.lion.getBreatheAnimal() + "\n");
                        printChose();
                        break;
                    case 2:
                        zooGroup.bear.informationAboutZoo();
                        System.out.println(zooGroup.bear.getMoveAnimal());
                        System.out.println(zooGroup.bear.getBreatheAnimal() + "\n");
                        printChose();
                        break;
                    case 3:
                        zooGroup.wolf.informationAboutZoo();
                        System.out.println(zooGroup.wolf.getMoveAnimal());
                        System.out.println(zooGroup.wolf.getBreatheAnimal() + "\n");
                        printChose();
                        break;
                    case 4:
                        zooGroup.flamingo.informationAboutZoo();
                        System.out.println(zooGroup.flamingo.getMoveBird());
                        System.out.println(zooGroup.flamingo.getBreatheBird() + "\n");
                        printChose();
                        break;
                    case 5:
                        zooGroup.parrot.informationAboutZoo();
                        System.out.println(zooGroup.parrot.getMoveBird());
                        System.out.println(zooGroup.parrot.getBreatheBird() + "\n");
                        printChose();
                        break;
                    case 6:
                        zooGroup.toucan.informationAboutZoo();
                        System.out.println(zooGroup.toucan.getMoveBird());
                        System.out.println(zooGroup.toucan.getBreatheBird() + "\n");
                        printChose();
                        break;
                    case 7:
                        zooGroup.lionFish.informationAboutZoo();
                        System.out.println(zooGroup.lionFish.getMoveFish());
                        System.out.println(zooGroup.lionFish.getBreatheFish() + "\n");
                        printChose();
                        break;
                    case 8:
                        zooGroup.morey.informationAboutZoo();
                        System.out.println(zooGroup.morey.getMoveFish());
                        System.out.println(zooGroup.morey.getBreatheFish() + "\n");
                        printChose();
                        break;
                    case 9:
                        zooGroup.pike.informationAboutZoo();
                        System.out.println(zooGroup.pike.getMoveFish());
                        System.out.println(zooGroup.pike.getBreatheFish() + "\n");
                        printChose();
                        break;
                    case 0:
                        System.out.println("Goodbye!!!");
                        System.exit(1);
                        break;
                    default:
                        System.out.println("OOPS! Something went wrong(((");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("sorry, an integer must be entered " + e.getMessage());
        }
    }

    public void printChose() {
        System.out.print("\n1.Lion" +
                "\n2.Bear" +
                "\n3.Wolf" +
                "\n4.Flamingo" +
                "\n5.Parrot" +
                "\n6.Toucan" +
                "\n7.Lion fish" +
                "\n8.Morey" +
                "\n9.Pike" +
                "\n0.Exit" +
                "\n Please make your chose: ");
    }
}