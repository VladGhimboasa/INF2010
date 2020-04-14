

public class Node {

	private int id;
	private String name;
	private int pathDistance;
	private boolean visited;
	private Edge bestEdge;
	private Node prevousNode;

		public Node(){
			this.pathDistance = Integer.MAX_VALUE;
			this.visited = false;
			this.bestEdge = new Edge();
			this.prevousNode = null;
		}
		
        public Node(int id, String n) {
		this.id = id;
		this.name = n;
		this.pathDistance = Integer.MAX_VALUE;
		this.visited = false;
		this.bestEdge = new Edge();
		this.prevousNode = null;
	}
		
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	@Override
	public int hashCode() {
		return id;
	}

	public int getPathDistance(){
        	return pathDistance;
	}

	public void setPathDistance(int pathDistance) {
		this.pathDistance = pathDistance;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Edge getBestEdge() {
		return bestEdge;
	}

	public void setBestEdge(Edge bestEdge) {
		this.bestEdge = bestEdge;
	}

	public Node getPrevousNode() {
		return prevousNode;
	}

	public void setPrevousNode(Node prevousNode) {
		this.prevousNode = prevousNode;
	}
}
