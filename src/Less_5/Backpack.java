package Less_5;

/**
 * Created by mma on 16.01.2020.
 */
public class Backpack {
    private int volume;
    private MyArray goods = new MyArray(10);
    private int weight = 0;

    public Backpack(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void print() {
        for (int i = 0; i < goods.size(); i++) {
            System.out.println(goods.getItem(i).getName());
        }
    }

    public void filling(MyArray arr) {
        arr.quickSort(0, arr.size() - 1);

        for (int i = 0; i < arr.size(); i++) {
            if (volume - weight - arr.getItem(i).getWeight() >= 0) {
                weight += arr.getItem(i).getWeight();;
                goods.add(arr.getItem(i));
            }
        }
        System.out.println("Рюкзак полон");
        this.print();
    }
}
