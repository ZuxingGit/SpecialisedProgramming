package classContent.wk12.exam5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        int[] p1 = {1, -1, 1};
        int[] p2 = {5, -1, 0, 1, 3, 1};
        int[] p3 = {-1, 0, 0, 1, 1};

        System.out.println(Arrays.toString(bridgeMap(p1, 1, 2)));
        System.out.println(Arrays.toString(bridgeMap(p2, 1, 3)));
        System.out.println(Arrays.toString(bridgeMap(p3, 0, 3)));
    }

    public static int[] bridgeMap(int[] p, int r1, int r2) {

        int length = p.length;
        int[] res = new int[length];

        Node node = buildNode(p, r1);
        res[r2] = -1;
        newNodeRelation(node, -1, res, r2);

        return res;
    }

    public static void newNodeRelation(Node node, int parentVal, int[] res, int r2) {
        if (node.val == r2) {
            res[r2] = -1;
        }

        if (node.neighbors != null && node.neighbors.size() > 0) {
            List<Node> neighbors = node.neighbors;
            for (Node neighbor :
                    neighbors) {
                if (neighbor.val == r2) {
                    res[node.val] = r2;
                    if (parentVal != -1)
                        res[parentVal] = node.val;
                }
                res[neighbor.val] = node.val;
                newNodeRelation(neighbor, node.val, res, r2);
            }
        }
    }

    /**
     * recover the original tree
     *
     * @param p
     * @param r1
     * @return
     */
    public static Node buildNode(int[] p, int r1) {
        int length = p.length;
        Node node = new Node(r1);
        for (int i = 0; i < length; i++) {
            if (p[i] == r1) {
                node.neighbors.add(buildNode(p, i));
            }
        }
        return node;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}