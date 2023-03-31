package org.example;

public class Artifact {

    //указываю переменные для обозначения порядкового номера, культуры древностей и века создания
    static int count = 0;
    String culture;
    int century;

    // для артефактов, где известен только порядковый номер
    public void Artifact() {
        count++;
        System.out.println("Номер:" + count);
    }

    // для артефактов, где известен номер и культура, которой он был создан
    public void Artifact(String culture) {
        this.count = count;
        this.culture = culture;
        count++;
        System.out.println("Номер:" + "Культура:" + count + culture);
    }
    // для артефактов, где известен номер и культура и век, в которой он был создан
    public void Artifact(String culture, int century) {
        this.count = count;
        this.culture = culture;
        this.century = century;
        count++;
        System.out.println("Номер:" + "Культура:" + count + culture + "Век:" + century);
    }
    public static void main(java.lang.String[] args) {
        Artifact TARDIS = new Artifact();
        Artifact Dinosaur = new Artifact("aztek");
        Artifact Papyrus = new Artifact("yegipet", 3);
    }
}

