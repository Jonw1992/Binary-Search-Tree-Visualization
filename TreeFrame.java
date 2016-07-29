import javax.swing.JFrame;
import javax.swing.JPanel;

public class TreeFrame extends JFrame
{

	public TreeFrame()
	{
		setTitle("Binary Tree Generator");
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TreePanel tree = new TreePanel();
		setResizable(false);
		this.add(tree);
		setVisible(true);	
	}

}