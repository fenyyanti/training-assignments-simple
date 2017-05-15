package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } else {
            return treeByValue(node, nodeValue);
        }
    }
    // end::calculateDepth[]
    
    public static int treeByValue(BinaryTreeNode<Integer> t, int v) {
    	BinaryTreeNode<Integer> binary = getChildNode(t, v);
    	if(binary == null) {
    		 throw new TreeException("Value not found in tree!");
    	} else {
    		return 1 + calculateDepth(binary, v);
    	}
    }
    
    public static BinaryTreeNode<Integer> getChildNode(BinaryTreeNode<Integer> n, int v) {
    	if (v < n.getValue()) {
    		return n.getLeft();
    	} else {
    		return n.getRight();
    	}
    	
    }
    
}