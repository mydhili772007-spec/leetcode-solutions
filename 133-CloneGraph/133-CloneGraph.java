// Last updated: 14/06/2026, 20:58:37
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
25            if (!map.containsKey(neighbor)) {
26                Node cloneNeighbor = new Node(neighbor.val);
27                map.put(neighbor, cloneNeighbor);
28
29                cloneNode.neighbors.add(cloneNeighbor);
30                dfs(neighbor, cloneNeighbor, map);
31            }
32            else {
33                cloneNode.neighbors.add(map.get(neighbor));
34            }
35        }
36    }
37
38    public Node cloneGraph(Node node) {
39        if (node == null) return null;
40
41        map = new HashMap<>();
42
43        Node cloneNode = new Node(node.val);
44        map.put(node, cloneNode);
45
46        dfs(node, cloneNode, map);
47        return cloneNode;
48    }
49}