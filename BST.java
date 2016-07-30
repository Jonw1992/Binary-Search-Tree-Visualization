import java.awt.*;
import java.util.*;
import javax.swing.JPanel;

public class BST
{
	private TreeNode root;

	public BST(int value)
	{
		root = new TreeNode(null,null,null,value);
	}

	public BST(int value, Graphics g)
	{
		root = new TreeNode(null,null,null,value,g);
	}
	public void insert(int value)
	{
		root.insert(value);
	}
	public void insert(int value, Graphics g, int x, int y)
	{
		root.insert(value , g,x,y);
	}

	public void printTree()
	{
		TreeNode node = root.getSmallestNodeInBranch();
		while(node != null)
		{
			System.out.println(node.getvalue());
			node = node.getNextBiggestNode(node);
		}
	}


}