import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class TreeNode
{
	private TreeNode parent;
	private TreeNode right;
	private TreeNode left;
	private int value;

	public TreeNode getLeft(){return this.left;}
	public TreeNode getRight(){return this.right;}
	public TreeNode getParent(){return this.parent;}
	public int getvalue(){return this.value;}

	public TreeNode(TreeNode parent,TreeNode right,TreeNode left, int value)
	{
		this.parent = parent;
		this.right = right;
		this.left = left;
		this.value = value;
	}

	public TreeNode(TreeNode parent,TreeNode right,TreeNode left, int value, Graphics g)
	{
		this.parent = parent;
		this.right = right;
		this.left = left;
		this.value = value;
		g.setColor(Color.black);
		g.drawRect(550,25,50,25);
		g.setColor(Color.blue);
		g.drawString(Integer.toString(value),560, 40);
	}

	public void insert(int num)
	{
		if(num >= this.value)
		{	
			if(this.right == null)
			{
				this.right = new TreeNode(this,null,null,num);
			}
			else
			{
				this.right.insert(num);
			}
		}
		else if(num < this.value)
		{
			if(this.left == null)
			{
				this.left = new TreeNode(this,null,null,num);
			}
			else
			{
				this.left.insert(num);
			}
		}
		else{}
	}

	public void insert(int num, Graphics g, int x, int y)
	{
		if(num >= this.value)
		{	
			if(this.right == null)
			{
				this.right = new TreeNode(this,null,null,num);
				g.setColor(Color.black);
				g.drawRect(x+100,y+50,50,25);
				g.drawLine(x+55,y+30,x+95, y+45);
				g.setColor(Color.blue);
				g.drawString(Integer.toString(num), x+110, y+50 +15);

			}
			else
			{
				this.right.insert(num,g,x + 100,y + 50);
			}
		}
		else if(num < this.value)
		{
			if(this.left == null)
			{
				this.left = new TreeNode(this,null,null,num);
				g.setColor(Color.black);
				g.drawRect(x-100,y+50,50,25);
				g.drawLine(x-5,y+30,x-55, y+45);
				g.setColor(Color.blue);
				g.drawString(Integer.toString(num), x-90, y+50 + 15);
			}
			else
			{
				this.left.insert(num,g,x - 100 ,y + 50);
			}
		}
		else{}
	}

	public TreeNode getSmallestNodeInBranch()
	{
		if(this.left != null)
		{
			return left.getSmallestNodeInBranch();
		}
		else
		{
			return this;
		}
	}

	public TreeNode getNextBiggestNode(TreeNode lastnode)
	{
		if(this.right != null && this.right != lastnode)
		{
			if(this.right.getLeft() != null)
			{
				return this.right.getSmallestNodeInBranch();
			}
			else 
			{
				return this.right;
			}
		}
		if(this.parent != null)
		{
			if(this.parent.getvalue() > this.value)
			{
				return this.parent;
			}
			else if(this.parent.getvalue() <= this.value)
			{
				return this.parent.getNextBiggestNode(this);
			}
		}
		
		return null;
	}



}
