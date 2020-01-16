package Less_5;

/**
 * Created by mma on 16.01.2020.
 */
public class Subject {
    private String name;
    private int weight;
    private int cost;

    public Subject(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }
    public Subject(int weight, int cost) {
        this.name = "неведомая фигня";
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getUnitPrice() {
         return cost/weight;
    }
}

