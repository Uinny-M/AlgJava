package lesson7;

public class Main {
    public static void main(String[] args) {
//        Graph graph = new Graph(10);
//
//        graph.addEdge(1,2);
//        graph.addEdge(0,4);
//        graph.addEdge(1,4);
//        graph.addEdge(3,4);
//        graph.addEdge(7,8);
//        graph.addEdge(1,3);
//
//        System.out.println(graph.getAdjList(1));
//        System.out.println(graph.getEdgeCount());

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(4));
//        System.out.println(dfp.hasPathTo(8));
//        System.out.println(dfp.pathTo(4));

//        BreadthFirstPath bfp = new BreadthFirstPath(graph, 2);
//        System.out.println(bfp.hasPathTo(4));
//        System.out.println(bfp.hasPathTo(8));
//        System.out.println(bfp.pathTo(3));


        //Домашка к 7 уроку
        Graph dracula = new Graph(10);

        dracula.addEdge(1,2);
        dracula.addEdge(0,4);
        dracula.addEdge(1,4);
        dracula.addEdge(3,4);
        dracula.addEdge(7,8);
        dracula.addEdge(1,3);
        dracula.addEdge(0,7);
        dracula.addEdge(9,5);
        dracula.addEdge(6,2);
        dracula.addEdge(0,9);
        dracula.addEdge(6,9);
        dracula.addEdge(5,3);

        Distance distance = new Distance(dracula, 1,9);

    }
}
