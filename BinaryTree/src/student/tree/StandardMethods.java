package student.tree;

import java.util.ArrayList;

public class StandardMethods implements IStandardMethods<Object> {
	
	static BinarySearchTree binarySearchTree = new BinarySearchTree();

	@Override
	public void createStructure() {
		binarySearchTree.fillTree(100);		
	}

	@Override
	public ArrayList<Object> getNodeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Edge<Object>> getEdgesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findNode(String findTag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Edge<Object> findEdge(String startNode, String endNode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Edge<Object>> getNeighbors(String idVertex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Edge<Object>> getPath(String startNode, String endNode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> startingNodeSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isLineal() {
		// TODO Auto-generated method stub
		return null;
	}

}
