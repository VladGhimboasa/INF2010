import java.util.ArrayList;
import java.util.List;



public class Graph {

	private List<Node> nodes; // Noeuds
	private List<Edge> edges; // Les arcs
	
	public Graph(ArrayList<Node> nodes, ArrayList<Edge> edges) {
		// A compléter
		this.nodes = nodes;
		this.edges = edges;
	}
	
	public List<Edge> getEdgesGoingFrom(Node source) {
		ArrayList<Edge> edgesFrom = new ArrayList<>();
		for(int i = 0; i < edges.size(); i++){
			if(edges.get(i).getSource() == source){
				edgesFrom.add(edges.get(i));
			}
		}
		return edgesFrom;
	}
	public List<Edge> getEdgesGoingTo(Node dest) {
		ArrayList<Edge> edgesGoingTo = new ArrayList<>();
		for(int i = 0; i < edges.size(); i++){
			if(edges.get(i).getDestination() == dest){
				edgesGoingTo.add(edges.get(i));
			}
		}
		return edgesGoingTo;
	}
	
	// Accesseurs 
	public List<Node> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
}
