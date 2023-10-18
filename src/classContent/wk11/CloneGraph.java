package classContent.wk11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);
        Node newNode = cloneGraph(n1);
    }

    public static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        } else {
            Node newNode = new Node(node.val);
            HashMap<Integer, Node> hashMap = new HashMap<>();
            hashMap.put(node.val, newNode);
            cloneGraph(node, newNode, hashMap);
            return newNode;
        }
    }

    public static void cloneGraph(Node node, Node preNode, HashMap<Integer, Node> hashMap) {
        if (node.neighbors.size() != 0) {
            List<Node> neighbors = node.neighbors;
            for (Node neighbor : neighbors) {
                if (!hashMap.containsKey(neighbor.val)) {
                    Node newNode = new Node(neighbor.val);
                    hashMap.put(neighbor.val, newNode);
                    preNode.neighbors.add(newNode);
                    cloneGraph(neighbor, newNode, hashMap);
                } else {
                    preNode.neighbors.add(hashMap.get(neighbor.val));
                }
            }
        }
    }
}
