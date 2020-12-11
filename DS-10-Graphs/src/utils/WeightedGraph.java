package utils;

public class WeightedGraph {

    // adjacency matrix
    private int [][] edges;
    private static Object [] labels;

    public WeightedGraph(int n){
        edges = new int [n][n];
        labels = new Object[n];
    }

    public int size() { return labels.length;}

    public void setVertex(int vertex, Object label){
        labels[vertex] = label;
    }
    public Object getLabel(int vertex){
        return labels[vertex];
    }

    public void addEdge(int source, int target, int w) { edges[source][target] = w; }
    public boolean isEdge(int source, int target) { return edges[source][target] > 0; }
    public void removeEdge(int source, int target)

}
