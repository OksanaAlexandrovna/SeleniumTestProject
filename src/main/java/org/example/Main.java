package org.example;

import org.example.home.work.Artifact;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Artifact TARDIS = new Artifact();
        Artifact Dinosaur = new Artifact("aztek");
        Artifact Papyrus = new Artifact("yegipet", 3);
    }
}