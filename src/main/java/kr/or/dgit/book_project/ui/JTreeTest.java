package kr.or.dgit.book_project.ui;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;


public class JTreeTest extends JFrame implements TreeSelectionListener {
	private JTree menu;
	private DefaultMutableTreeNode root;
	private DefaultMutableTreeNode child;
	private DefaultMutableTreeNode node;
	public JTreeTest()
	{
		root = new DefaultMutableTreeNode("Sensor List");
		
		child  = new DefaultMutableTreeNode("SEN1");
		node   = new DefaultMutableTreeNode("RTQC Analysis");
		child.add(node);
		root.add(child);
		
		
		child  = new DefaultMutableTreeNode("SEN2");
		node   = new DefaultMutableTreeNode("RTQC Analysis");
		child.add(node);
		root.add(child);
		
		menu = new JTree(root);
		
		getContentPane().add(new JScrollPane(menu));
		
		menu.addTreeSelectionListener(this);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		JTreeTest test = new JTreeTest();
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		if (menu.getSelectionPath().getParentPath() != null) {
			int index = menu.getSelectionPath().getPathCount();
			String parent = menu.getSelectionPath().getParentPath().getLastPathComponent().toString();
			String test = menu.getLastSelectedPathComponent().toString();
			System.out.println("index : " + index + ", " + parent + " : " + test);
		}
	}
}
