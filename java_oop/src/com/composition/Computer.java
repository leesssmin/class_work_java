package com.composition;

public class Computer {

    private String type ;
    CPU[] cpus;

    public Computer(String type){
        this.type = type;
        this.cpus = new CPU[2];
        cpus[0] = new CPU("CPU1");
        cpus[1] = new CPU("CPU2");
    }

    void showCpu() {
        System.out.println(type + "의 종류");
        for (int i = 0; i < cpus.length; i++) {
            if (cpus[i] != null) {
                cpus[i].describe();
            }
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer("cpu");
        computer.showCpu();


    }

    }



