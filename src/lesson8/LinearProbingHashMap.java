package lesson8;

public class LinearProbingHashMap<Key, Value> {
    private int capacity = 40;
    private int size = 0;
    private Integer key0 = 2147483647;


    private Key[] keys = (Key[]) new Object[capacity];
    private Value[] values = (Value[]) new Object[capacity];

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public final int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public final int hash2(Key key) {
        return 7 - (key.hashCode() & 0x7fffffff) % 7;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    private void isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("key == null");
        }
    }

    public void put(Key key, Value value) {
        isKeyNotNull(key);
        if (size == capacity - 1) {
            throw new RuntimeException("Места нет ");
        }

        int i;
        for (i = hash(key); keys[i] != null&&keys[i] != key0; i = (i + 1) % capacity) {
            if (key.equals(keys[i])) {
                values[i] = value;
                return;
            }
        }

        keys[i] = key;
        values[i] = value;
        size++;
    }



    public Value get(Key key) {
        isKeyNotNull(key);
        for (int i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if (key.equals(keys[i])) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            sb.append(keys[i]).append(", ");
        }
        return sb.toString();
    }

    //домашка к 8 уроку
    public void del(Key key) {
        isKeyNotNull(key);
        int j = 0;
        for (int i = 0; i < capacity; i++) {
            if (key.equals(keys[i])) {
                keys[i]=(Key)key0;
                values[i] = null;
                size--;
                return;
            }
        }
    }
}
