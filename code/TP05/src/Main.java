import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) {
		System.out.println("TP05 : Graphes");
		
		// Partie 1: A completer : Création du graphe
		Node nodeA = new Node(1, "A");
		Node nodeB = new Node(2, "B");
		Node nodeC = new Node(3, "C");
		Node nodeD = new Node(4, "D");
		Node nodeE = new Node(5, "E");
		Node nodeF = new Node(6, "F");
		Node nodeG = new Node(7, "G");

		Edge edgeA1 = new Edge(nodeA, nodeB, 2);
		Edge edgeA2 = new Edge(nodeA, nodeC, 1);

		Edge edgeB1 = new Edge(nodeB, nodeA, 2);
		Edge edgeB2 = new Edge(nodeB, nodeC, 2);
		Edge edgeB3 = new Edge(nodeB, nodeD, 1);
		Edge edgeB4 = new Edge(nodeB, nodeE, 3);

		Edge edgeC1 = new Edge(nodeC, nodeA, 1);
		Edge edgeC2 = new Edge(nodeC, nodeB, 2);
		Edge edgeC3 = new Edge(nodeC, nodeD, 4);
		Edge edgeC4 = new Edge(nodeC, nodeE, 3);
		Edge edgeC5 = new Edge(nodeC, nodeF, 5);

		Edge edgeD1 = new Edge(nodeD, nodeB, 1);
		Edge edgeD2 = new Edge(nodeD, nodeC, 4);
		Edge edgeD3 = new Edge(nodeD, nodeF, 6);
		Edge edgeD4 = new Edge(nodeD, nodeG, 5);

		Edge edgeE1 = new Edge(nodeE, nodeB, 3);
		Edge edgeE2 = new Edge(nodeE, nodeC, 3);
		Edge edgeE3 = new Edge(nodeE, nodeF, 1);

		Edge edgeF1 = new Edge(nodeF, nodeC, 5);
		Edge edgeF2 = new Edge(nodeF, nodeD, 6);
		Edge edgeF3 = new Edge(nodeF, nodeE, 1);
		Edge edgeF4 = new Edge(nodeF, nodeG, 2);

		Edge edgeG1 = new Edge(nodeG, nodeD, 5);
		Edge edgeG2 = new Edge(nodeG, nodeF, 2);


		ArrayList<Node> nodeList = new ArrayList<>();
		nodeList.add(nodeA);
		nodeList.add(nodeB);
		nodeList.add(nodeC);
		nodeList.add(nodeD);
		nodeList.add(nodeE);
		nodeList.add(nodeF);
		nodeList.add(nodeG);

		ArrayList<Edge> edgeList = new ArrayList<>();
		edgeList.add(edgeA1);
		edgeList.add(edgeA2);

		edgeList.add(edgeB1);
		edgeList.add(edgeB2);
		edgeList.add(edgeB3);
		edgeList.add(edgeB4);

		edgeList.add(edgeC1);
		edgeList.add(edgeC2);
		edgeList.add(edgeC3);
		edgeList.add(edgeC4);
		edgeList.add(edgeC5);

		edgeList.add(edgeD1);
		edgeList.add(edgeD2);
		edgeList.add(edgeD3);
		edgeList.add(edgeD4);

		edgeList.add(edgeE1);
		edgeList.add(edgeE2);
		edgeList.add(edgeE3);

		edgeList.add(edgeF1);
		edgeList.add(edgeF2);
		edgeList.add(edgeF3);
		edgeList.add(edgeF4);

		edgeList.add(edgeG1);
		edgeList.add(edgeG2);

		//Creation du graph
		Graph myGraph = new Graph(nodeList, edgeList);
		
		// Partie 2: A completer : Implémentation de l’algorithme Dijkstra
		
		Dijkstra d = new Dijkstra(myGraph);
		


		// Affichage le chemin le plus court :
		System.out.println(d.printShortPath(nodeA, nodeG));

		d.showTable();
	
	}
}
