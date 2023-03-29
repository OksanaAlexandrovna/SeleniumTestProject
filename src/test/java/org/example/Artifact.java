package example.artifact;

public class Main {

    //указываю переменные для обозначения порядкового номера, культуры древностей и века создания
    static int number = 0;
    String culture;
    int century;
    public static void main(String[] args) {
        Artifact TARDIS = new Artifact();
        Artifact Dinosaur = new Artifact("aztek");
        Artifact Papyrus = new Artifact("yegipet" + 3);
    }
    // для артефактов, где известен только порядковый номер
    public Artifact() {
        number++;
        System.out.println("Номер:" + number);
    }

    // для артефактов, где известен номер и культура, которой он был создан
    public Artifact(String culture) {
        this.number = number;
        this.culture = culture;
        number++;
        System.out.println("Номер:" + "Культура:" + number + culture);
    }
    // для артефактов, где известен номер и культура и век, в которой он был создан
    public Artifact(String culture, int century) {
        this.number = number;
        this.culture = culture;
        this.century = century;
        number++;
        System.out.println("Номер:" + "Культура:" + number + culture + "Век:" + century);
    }
}
