package studentProject;

import java.util.ArrayList;

public class StandardMethods implements IStandardMethods<Object>{

	private static LinkedList list = new LinkedList();

	public void createStructure() {
		list = list.createList();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList getNodeList() {
		return list.getNodes(list);
	}
	
	public Object findNode(String findTag) {
		return list.getNode(list, findTag);
	}

	public ArrayList<Edge<Object>> getEdgesList() {
		return null;
	}

	public ArrayList<Edge<Object>> getNeighbors(String idVertex) {
		return list.getNeighbors(list, idVertex);
	}

	public ArrayList<Edge<Object>> getPath(String startNode, String endNode) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public ArrayList startingNodeSet() {
		return list.getStartingNodeSet(list);
	}

	@Override
	public Boolean isLineal() {
		return true;
	}

	@Override
	public Edge<Object> findEdge(String startNode, String endNode) {
		return list.findEdge(list, startNode, endNode);
	}
	
	public static void Main (String[] args) {
		StandardMethods sm = new StandardMethods();
	}

}
