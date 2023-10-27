package classContent.wk12.exam5;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int[][] edges1 = {{0, 1}, {0, 2}, {0, 3}};
        int[][] edges2 = {{0, 1}, {1, 2}, {2, 3}, {2, 4}};
        int[][] edges3 = { {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {0, 8}, {0, 9}, {0, 10}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}, {1, 8}, {1, 9}, {1, 10} };
        System.out.println(communicationLatency(4, edges1));
        System.out.println(communicationLatency(5, edges2));
        System.out.println(communicationLatency(4, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {2, 3} }));
        System.out.println(communicationLatency(5, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4} }));
        System.out.println(communicationLatency(6, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {2, 3}, {2, 4}, {2, 5}, {3, 4}, {3, 5}, {4, 5} }));
        System.out.println(communicationLatency(7, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {1, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}, {5, 6} }));
        System.out.println(communicationLatency(8, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {1, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}, {3, 7}, {4, 5}, {4, 6}, {5, 7} }));
        System.out.println(communicationLatency(9, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {0, 8}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}, {1, 8}, {2, 3}, {2, 4}, {3, 5}, {4, 6}, {7, 8}}));
        System.out.println(communicationLatency(10, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {0, 8}, {0, 9}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}, {1, 8}, {1, 9}, {2, 3}, {2, 4}, {3, 5} }));
        System.out.println(communicationLatency(11, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {0, 8}, {0, 9}, {0, 10}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}, {1, 8}, {1, 9}, {1, 10}, {2, 3} }));
        System.out.println(communicationLatency(6, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {1, 2}, {1, 3}, {1, 4}, {1, 5} }));
        System.out.println(communicationLatency(7, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {2, 3}, {2, 4}, {2, 5} }));
        System.out.println(communicationLatency(8, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}, {2, 3}, {2, 4}, {2, 5}, {2, 6}, {2, 7} }));
        System.out.println(communicationLatency(5, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3} }));
        System.out.println(communicationLatency(9, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {0, 8}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}, {1, 8}, {2, 3}, {2, 4}, {2, 5}, {2, 6} }));
        System.out.println(communicationLatency(10, new int[][]{ {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}, {0, 8}, {0, 9}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}, {1, 8}, {1, 9}, {2, 3}, {2, 4} }));
        System.out.println(communicationLatency(11, edges3));
    }

    /**
     * 
     * @param n number of planets
     * @param channels every channel between 2 planets
     * @return max shortest path length
     */
    public static int communicationLatency(int n, int[][] channels) {
        boolean[] visited = new boolean[n];
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        buildGraph(channels, map);

        return DFS(map, visited, -1);
    }

    /**
     * @param map
     * @param visited
     * @param curNode current Node
     * @return
     */
    public static int DFS(Map<Integer, LinkedList<Integer>> map, boolean[] visited, int curNode) {
        int count = 0;
        if (curNode != -1) {
            visited[curNode] = true;
            LinkedList<Integer> l = map.get(curNode); //adjacent vertices
            if (l != null) {
                for (Integer nodeId : l) {  
                    if (!visited[nodeId]) {
                        boolean[] arr = Arrays.copyOf(visited, visited.length);
                        count = Math.max(count, 1 + DFS(map, arr, nodeId));
                    }
                }
            }
        } else {
            Set<Integer> keys = map.keySet();
            for (Integer key :
                    keys) {
                if (!visited[key]) {
                    LinkedList<Integer> l = map.get(key); //adjacent vertices
                    if (l != null) {
                        for (Integer nodeId : l) {
                            if (!visited[nodeId]) {
                                boolean[] arr = Arrays.copyOf(visited, visited.length);
                                arr[key] = true;
                                count = Math.max(count, 1 + DFS(map, arr, nodeId));
                            }
                        }
                    }

                }
            }
        }
        return count;
    }

    /**
     * build a bidirectional Graph based on channels
     * @param channels
     * @param map key-vertex, value- list of its destination
     */
    public static void buildGraph(int[][] channels, Map<Integer, LinkedList<Integer>> map) {
        int length = channels.length;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            int[] channel = channels[i];
            if (map.containsKey(channel[0])) {
                map.get(channel[0]).add(channel[1]);
            } else {
                LinkedList<Integer> l = new LinkedList<>();
                l.add(channel[1]);
                map.put(channel[0], l);
            }
            if (map.containsKey(channel[1])) {
                map.get(channel[1]).add(channel[0]);
            } else {
                LinkedList<Integer> l = new LinkedList<>();
                l.add(channel[0]);
                map.put(channel[1], l);
            }
        }
    }
}
