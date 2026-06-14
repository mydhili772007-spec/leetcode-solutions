// Last updated: 14/06/2026, 20:58:02
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20class Solution {
21    Map<Node, Node> map;
22
23    public void dfs(Node node, Node cloneNode, Map<Node, Node> map) {
24        for (Node neighbor : node.neighbors) {
25
26            // If neighbor is not cloned yet
27            if (!map.containsKey(neighbor)) {
28                Node cloneNeighbor = new Node(neighbor.val);
29                map.put(neighbor, cloneNeighbor);
30
31                cloneNode.neighbors.add(cloneNeighbor);
32                dfs(neighbor, cloneNeighbor, map);
33            } 
34            // If already cloned, reuse it
35            else {
36                cloneNode.neighbors.add(map.get(neighbor));
37            }
38        }
39    }
40
41    public Node cloneGraph(Node node) {
42        if (node == null) return null;
43
44        map = new HashMap<>();
45
46        Node cloneNode = new Node(node.val);
47        map.put(node, cloneNode);
48
49        dfs(node, cloneNode, map);
50        return cloneNode;
51    }
52}