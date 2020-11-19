package com.company;

public class Main {

    public static void main(String[] args) {

        String[] comm = {"стой","иди","сиди"};
        Dog dog = new Dog("Jack","haski",comm);
        dog.makeVoice(3,"GAv");
        dog.makeVoice("FaF",5);

        System.out.println(dog);
        System.out.println("______________________________________________________________");
        Alabai alabai = new Alabai("Lost","Alabai",comm,Color.BLACK);
        alabai.makeVoice(10,"Ups");
        alabai.makePersonalCommand("dead");
        System.out.println(alabai.getInfo());


        System.out.println("______________________________________________________________");
        Dog dog1 = new Dog("Bobik","Dvornyaga",comm);
        dog1.setName("Rex");
        dog1.setBreed("Bulldog");
        dog1.setCommands(new String[]{"sit", "run"});
        dog1.setColor(Color.BLACK);
        dog1.setShelter(new Shelter("Приют №1", "Советская 2"));

        System.out.println(dog1.getInfo());
        dog1.makeVoice(3, "Gav");

    }

    }


