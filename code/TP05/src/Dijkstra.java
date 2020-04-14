import javafx.util.Pair;

import javax.swing.*;
import java.lang.reflect.Parameter;
import java.security.InvalidParameterException;
import java.sql.SQLSyntaxErrorException;
import java.util.*;
import java.util.Arrays;


public class Dijkstra {

	private Graph graph;
	private Map<Node, Edge> dijkstraTable[];
	private Stack<Edge> path;
	public int pathSize;
	public ArrayList<Edge> tempList;

	public Dijkstra(Graph g) {
		this.graph = g;
	}

	public void findPath(Node s, Node d) {
		dijkstraTable = new HashMap[graph.getNodes().size()];
		path = new Stack<Edge>();

		s.setPathDistance(0);
		s.setPrevousNode(s);
		s.setBestEdge(new Edge(s, s, 0));
		List<Edge> listEdgesGoingTo = graph.getEdgesGoingFrom(s);
		Node currentNode = new Node();

		for(int i = 0; i < graph.getNodes().size(); i++){
			dijkstraTable[i] = new HashMap<Node, Edge>();
		}

		dijkstraTable[0].put(s, s.getBestEdge());
		for(int i = 0; i < listEdgesGoingTo.size(); i++){
			listEdgesGoingTo.get(i).getDestination().setPathDistance(listEdgesGoingTo.get(i).getDistance());
			listEdgesGoingTo.get(i).getDestination().setBestEdge(listEdgesGoingTo.get(i));
			listEdgesGoingTo.get(i).getDestination().setPrevousNode(s);
		}

		s.setVisited(true);
		for(int j = 1; j < graph.getNodes().size(); j++){
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < graph.getNodes().size(); i++){
				if(graph.getNodes().get(i).getPathDistance() < min && graph.getNodes().get(i).isVisited() == false){
					min = graph.getNodes().get(i).getPathDistance();
					currentNode = graph.getNodes().get(i);
				}
			}

			listEdgesGoingTo = graph.getEdgesGoingFrom(currentNode);

			for(int i = 0; i < listEdgesGoingTo.size(); i++){
				if(currentNode.getPathDistance() + listEdgesGoingTo.get(i).getDistance() < listEdgesGoingTo.get(i).getDestination().getPathDistance()){
					listEdgesGoingTo.get(i).getDestination().setPathDistance(currentNode.getPathDistance() + listEdgesGoingTo.get(i).getDistance());
					listEdgesGoingTo.get(i).getDestination().setBestEdge(listEdgesGoingTo.get(i));
					listEdgesGoingTo.get(i).getDestination().setPrevousNode(currentNode);
				}
			}
			currentNode.setVisited(true);

			dijkstraTable[j].put(currentNode, new Edge(currentNode, currentNode.getBestEdge().getDestination(), currentNode.getPathDistance()));
		}

		currentNode = d;

		tempList = new ArrayList<>();
		int compteur = 0;
		while(currentNode!= s) {
			tempList.add(currentNode.getBestEdge());
			currentNode = currentNode.getPrevousNode();
			compteur++;
		}

		currentNode = d;

		for(int i = compteur -1; i >= 0; i--){
			path.push(tempList.get(i));
			currentNode = currentNode.getPrevousNode();
		}

		pathSize = path.size();

	}

	private Node getMinimum(Map<Node, Edge> map) {
		Edge min = null;
		for (Node Key : map.keySet()) {
			if (min == null || map.get(Key).getDistance() < min.getDistance()) {
				min = map.get(Key);
			}
		}
		return min.getDestination();
	}

	private Edge getMinimum(Edge e1, Edge e2) {
		try{

		}catch (InvalidParameterException e){
			if(e1 == null || e2 == null)
				throw e;
		}
		if(e1.getDistance() < e2.getDistance()){
			return e1;
		} else {
			return e2;
		}
	}

	public void showTable() {
		for(int i =0; i < pathSize; i++){
			System.out.print("| " + i + " |");
			for (Node node: graph.getNodes()) {
				System.out.print(" " + node.getPathDistance() + node.getName() + " |");
			}
			System.out.print("\n");
		}
	}

	public String printShortPath(Node source, Node destination) {
		{
			this.findPath(source, destination);
			StringBuilder chemin = new StringBuilder();
			//premiere itteration
			Edge lastEdge = path.pop();

			int longueurDuChemin = 0;
			chemin.append(lastEdge.getDestination().getName() + " ");
			longueurDuChemin =  longueurDuChemin + lastEdge.getSource().getBestEdge().getDistance();

			//le reste
			while (!path.empty()) {
				if (!path.empty() && path.peek().getDestination() == lastEdge.getSource()) {
					chemin.append(lastEdge.getSource().getName() + " ");
					longueurDuChemin =  longueurDuChemin + lastEdge.getDistance();
					lastEdge = path.pop();
				} else {
					path.pop();
				}
			}
			System.out.print("La longueur du plus court chemin est : ");
			System.out.println(longueurDuChemin);
			return "Le chemin le plus court est : " + chemin.reverse().toString();
		}
	}
}
