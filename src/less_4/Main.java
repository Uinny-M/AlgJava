package less_4;

import java.util.Iterator;

/**
 * Created by mma on 10.01.2020.
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Katia");
        mll.insertFirst("Maria");
        mll.insertFirst("Luba");
        mll.insertFirst("Luba");
        mll.insertFirst("Luba");
//        System.out.println(mll.contains("Maria"));
//        System.out.println(mll.indexOf("Luba"));
//        System.out.println(mll);
//        mll.insert(1,"Petia");

        System.out.println(mll);
        mll.insertLast("Sania");
        System.out.println(mll);

        mll.insert(3, "Petia");
        System.out.println(mll);

        mll.remove("Luba");
        System.out.println(mll);

//        for (String s : mll) {
//            System.out.print(s + " ");
//        }

        Iterator<String> iterator = mll.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println(iterator.hashCode());
        System.out.println(iterator.toString());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.getClass());

//ПРОВЕРКА КЛАССА MyLinkedList
        MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
        myLinkedQueue.enqueue("lsdfkj");
        myLinkedQueue.enqueue("aaa");
        myLinkedQueue.enqueue("xxx");

        System.out.println(myLinkedQueue.isEmpty());
        System.out.println(myLinkedQueue.peek());
        System.out.println(myLinkedQueue.dequeue());
        System.out.println(myLinkedQueue.peek());
        System.out.println(myLinkedQueue.size());


//ПРОВЕРКА КЛАССА MyOneLinkedList
        MyOneLinkedList<String> myOneLinkedList = new MyOneLinkedList<>();
        myOneLinkedList.insertFirst("111");
        myOneLinkedList.insert(1, "222");
        myOneLinkedList.insert(1, "333");
        myOneLinkedList.insertFirst("444");

        System.out.println(myOneLinkedList.toString());
        System.out.println(myOneLinkedList.getFirst());
        System.out.println(myOneLinkedList.indexOf("111"));

        myOneLinkedList.remove("111");

        System.out.println(myOneLinkedList.toString());



//        mll.removeLast();
//        mll.removeFirst();
//        System.out.println(mll);

//        System.out.println(mll.remove("Luba"));
//        System.out.println(mll);

//        for (int i = 0; i < 3 ; i++) {
//            System.out.print(mll.removeFirst()+" ");
//        }


    }


}

