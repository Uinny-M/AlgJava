package lesson7;


public class Distance {
    public Distance(Graph g, int start, int finish) {

        distance(g, start, finish);
    }

    private void distance(Graph g, int start, int finish) {
        BreadthFirstPath bfp = new BreadthFirstPath(g, start);
        System.out.println(start + ", " + bfp.pathTo(finish));
    }
}
