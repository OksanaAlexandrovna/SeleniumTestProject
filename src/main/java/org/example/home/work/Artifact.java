package org.example.home.work;

public class Artifact {
    private static int count = 0;
    private String culture;
    private int century;

    // для артефактов, где известен только порядковый номер
    public Artifact() {
        count++;
        print();
    }

    // для артефактов, где известен номер и культура, которой он был создан
    public Artifact(String culture) {
        this.culture = culture;
        count++;
        print();
    }

    // для артефактов, где известен номер и культура и век, в которой он был создан
    public Artifact(String culture, int century) {
        this.culture = culture;
        this.century = century;
        count++;
        print();
    }

    public void print() {
        System.out.println(String.format("Номер: %s; Культура: %s; Век: %s", count, culture, century));
    }
}
