import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JTextField;


public class TreePanel extends JPanel implements ActionListener
{
	private BufferedImage img;
	private BST tree;
	private JTextField txt;
	private Graphics g; 
	private boolean hasRoot = false;

	public TreePanel()
	{
			img = new BufferedImage(1200,800,BufferedImage.TYPE_INT_RGB);
			g = img.getGraphics();
			g.setColor(Color.white);
			g.fillRect(0,0,1200,800);
			g.setColor(Color.black);

			txt = new JTextField(5);
			setLayout(null);
			txt.setLayout(null);
			g.setColor(Color.black);
			g.drawString("Insert Number:", 55,695);
			txt.setBounds(50,700,100,20);
			add(txt);
			txt.addActionListener(this);

			setFocusable(true);
			setFocusTraversalKeysEnabled(false);
	}
		
	public void paintComponent(Graphics g)
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		g.drawImage(img, 0,0, this); 
	}

	public void actionPerformed(ActionEvent e) 
	{ 
		try{
			if(hasRoot)
			{
				tree.insert(Integer.parseInt(txt.getText()),g,550,25);
			}
			else
			{
				tree = new BST(Integer.parseInt(txt.getText()),g);
				hasRoot = true;
			}
		}
		catch(NumberFormatException z)
		{
			System.out.println("Nope");
		}

		tree.printTree();
		repaint();

	}
}