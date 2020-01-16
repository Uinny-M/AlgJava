package Less_5;


/**
 * Created by mma on 16.01.2020.
 */
public class MyArray {
    private Subject[] list;
    private int size = 0;


    public MyArray(int capacity) {
        list = new Subject[capacity];
    }

    public void add(Subject item) {
        list[size] = item;
        size++;
    }

    public int size() {
        return size;
    }

    private void swap(int index1, int index2) {
        Subject temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
    public Subject getItem(int i) {
        return list[i];
    }


    public void quickSort(int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        Subject opora = list[middle];

        int i = low;
        int j = high;

        while (i <= j) {
            while (list[i].getUnitPrice() > opora.getUnitPrice()) {
                i++;
            }
            while (list[j].getUnitPrice() < opora.getUnitPrice()) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, j);
        }
        if (high > i) {
            quickSort(i, high);
        }
    }
}
