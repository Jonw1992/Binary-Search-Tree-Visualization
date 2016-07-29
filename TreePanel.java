import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;


public class TreePanel extends JPanel
{
	BufferedImage img;
	BST tree;

	public TreePanel()
	{
			img = new BufferedImage(1200,800,BufferedImage.TYPE_INT_RGB);
			Graphics g = img.getGraphics();
			g.setColor(Color.white);
			g.fillRect(0,0,1200,800);
			g.setColor(Color.black);
			tree = new BST(1000,g);
			tree.insert(0,g,550,25);
			tree.insert(5,g,550,25);
			tree.insert(10,g,550,25);
			tree.insert(-1,g,550,25);
			tree.insert(11,g,550,25);
			tree.insert(100,g,550,25);
			tree.insert(11,g,550,25);
			tree.insert(121,g,550,25);
			tree.insert(-500,g,550,25);
			tree.insert(-100,g,550,25);
			tree.insert(-200,g,550,25);
			tree.insert(-15,g,550,25);
			tree.insert(-800,g,550,25);
			tree.insert(-2000,g,550,25);
			tree.insert(-500,g,550,25);

			tree.insert(200,g,550,25);
			tree.insert(2000,g,550,25);
			tree.printTree();


			setFocusable(true);
			setFocusTraversalKeysEnabled(false);
	}
		
	public void paintComponent(Graphics g)
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		
		g.drawImage(img, 0,0, this); 
	}
}