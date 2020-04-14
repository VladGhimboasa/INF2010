
public class Edge {

	private Node source;
	private Node destination;
	private int distance;

	public Edge () {
		this.source = null;
		this.destination = null;
		this.distance = Integer.MAX_VALUE;
	}


	public Edge(Node s, Node d, int dist) {
		this.source = s;
		this.destination = d;
		this.distance = dist ;
	}
     
      	
	public Node getSource() {
		return source;
	}
	public void setSource(Node source) {
		this.source = source;
	}
	public Node getDestination() {
		return destination;
	}
	public void setDestination(Node destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	
	
}
