package DSAlgorithms.GraphTheory.MST;

import java.util.*;

public class DFS {
    
    static class City{
        String name;

        public City(String name){
        this.name = name;

    }

        public String toString(){
            return name;
        }
    }
    static class Edge{

        int weight;
        City destination;

        public Edge (City destination, int weight){
            this.destination = destination;
            this.weight = weight;
        }

        public String toString(){
            return "(" + this.destination + ", "+this.weight+")";
        }
    }

    static class Graph{
        Map<City, List<Edge>> adjacencyList = new HashMap<>();

        public void addCity(City city, List<Edge> dCities){
            adjacencyList.putIfAbsent(city, new ArrayList<>());
            adjacencyList.get(city).addAll(dCities);
        }

        public void DepthFirstTraverse(City start, Set<City> visited){
            System.out.print(start + " ");
            visited.add(start);

                List<Edge> neighbors = adjacencyList.get(start);
                if (neighbors != null){
                for (Edge neighbor: adjacencyList.get(start)){
                    if(!visited.contains(neighbor.destination)){
                        DepthFirstTraverse(neighbor.destination, visited);
                    }
                }
            }

        }

        public void displayGraph() {
            System.out.println("Graph:");
            for (Map.Entry<City, List<Edge>> entry : adjacencyList.entrySet()) {
                System.out.print(entry.getKey() + " -> ");
                System.out.println(entry.getValue());
            }
        }
    }


    public static class Main{
        public static void main(String[] args){
            // Create a graph given in the above diagram
            
            City cityV1 = new City("Kansas City");
            City cityV2 = new City("St. Louis");
            City cityV3 = new City("Springfield");
            City cityV4 = new City("Columbia");
            City cityV5 = new City("Jefferson City");

            Graph g = new Graph();

            g.addCity(cityV5, Arrays.asList(new Edge(cityV1, 10), new Edge(cityV2, 25)));
            g.addCity(cityV4, Arrays.asList(new Edge(cityV2, 2), new Edge(cityV3, 1)));
            g.addCity(cityV3, Arrays.asList(new Edge(cityV4, 3), new Edge(cityV2, 4)));
            g.addCity(cityV2, Arrays.asList(new Edge(cityV5, 1), new Edge(cityV1, 4)));
            g.addCity(cityV5, Arrays.asList(new Edge(cityV4, 35), new Edge(cityV3, 15)));

            g.displayGraph();

            Set<City> visited = new HashSet<>();
            City startCity = getRandomCity(g.adjacencyList.keySet());
            System.out.println("Starting vertex: " + startCity);
            System.out.println("Depth-First Traversal:");
            g.DepthFirstTraverse(startCity, visited);
        }

        private static <T> T getRandomCity(Set<T> citySet) {
            int randomIndex = new Random().nextInt(citySet.size());
            Iterator<T> iterator = citySet.iterator();
            for (int i = 0; i < randomIndex; i++) {
                iterator.next();
            }
            return iterator.next();
        }
    }
}

