package datastructures.graphs;

import java.util.ArrayList;
import java.util.Hashtable;

public class Graph {
    int length=0;
    Hashtable<Integer, ArrayList<Integer>> adjacentList = new Hashtable();

    public int getLength() {return length;}
    public void addVertex(int vertex){
        ArrayList<Integer> adjacentNode = new ArrayList<Integer>();
        adjacentList.put(vertex, adjacentNode);
        length++;
    }
    public void addEdge(int node1, int node2){
        adjacentList.get(node1).add(node2);
        adjacentList.get(node2).add(node1);
    }
    public void traverse()
    {
        Object[] keys = adjacentList.keySet().toArray();
        for (Object key : keys) {
            System.out.println(key + " ---> " + adjacentList.get(Integer.parseInt(key.toString())));
        }
    }
    public static void main(String []args){
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        graph.traverse();
    }
}
