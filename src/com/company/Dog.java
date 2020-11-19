package com.company;

import java.util.Arrays;

public class Dog extends Pet{

    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice, int num){
        for (int i = 0; i <num ; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i <num ; i++) {
            System.out.println(voice);
        }
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", commands=" + Arrays.toString(commands) +
                '}';
    }
}
