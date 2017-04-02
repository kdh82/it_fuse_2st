package kr.or.dgit.book_project.frame;

import javax.swing.JPanel;
import javax.swing.JTree;
import java.awt.GridLayout;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.DropMode;

public class TreeMenu extends JPanel {

	public TreeMenu() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JTree tree = new JTree();
		tree.setDropMode(DropMode.ON_OR_INSERT_ROWS);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("도서관리프로그램") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("기초자료관리");
						node_1.add(new DefaultMutableTreeNode("도서등록"));
						node_1.add(new DefaultMutableTreeNode("도서관리"));
						node_1.add(new DefaultMutableTreeNode("분류관리"));
						node_1.add(new DefaultMutableTreeNode("출판사관리"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("인적자원관리");
						node_1.add(new DefaultMutableTreeNode("회원등록"));
						node_1.add(new DefaultMutableTreeNode("회원관리"));
						node_1.add(new DefaultMutableTreeNode("직원등록"));
						node_1.add(new DefaultMutableTreeNode("직원관리"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("도서출납관리");
						node_1.add(new DefaultMutableTreeNode("대여관리"));
						node_1.add(new DefaultMutableTreeNode("반납관리"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("도서출납통계");
						node_1.add(new DefaultMutableTreeNode("누적 베스트지수"));
						node_1.add(new DefaultMutableTreeNode("분야별 베스트지수"));
						node_1.add(new DefaultMutableTreeNode("월별 베스트지수"));
						node_1.add(new DefaultMutableTreeNode("분야별 월별 베스트 지수"));
						node_1.add(new DefaultMutableTreeNode("분야별 권수 비율"));
						node_1.add(new DefaultMutableTreeNode("분야별 대여 비율"));
					add(node_1);
				}
			}
		));
		add(tree);
	}

}
