package Less_6;


import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();

//        map.put(5, "five");
//        map.put(1, "one");
//        map.put(3, "tree");
//        map.put(2, "two");
//        map.put(4, "four");
//
//        System.out.println(map.get(1));
//        System.out.println(map.get(2));
//        map.delete(2);
//        map.delete(3);
//        System.out.println(map.contains(2));
//        System.out.println(map.contains(1));
//        System.out.println(map);


        int numbers = 6;
        MyTreeMap[] forest = new MyTreeMap[numbers];
        for (int i = 0; i < numbers; i++) {
            forest[i] = new MyTreeMap();
            fullMyTreeMap(forest[i]);
        }

        System.out.println(forest[0]);

    }

    //Заполнение дерева
    private static void fullMyTreeMap(MyTreeMap tree)  {
        do {
            int a = (int) (Math.random() * 200) - 100;

            tree.put(((int) (Math.random() * 200) - 100), a);
        } while (tree.deepOfTree(tree.getRoot(tree)) <= 6);
    }


}
