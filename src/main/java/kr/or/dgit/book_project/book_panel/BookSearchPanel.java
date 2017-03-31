package kr.or.dgit.book_project.book_panel;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import kr.or.dgit.book_project.basic_panel.OptionSearchCmb;
import kr.or.dgit.book_project.basic_panel.OptionSearchTF;

import java.awt.GridLayout;

public class BookSearchPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BookSearchPanel() {
		setLayout(new GridLayout(0, 1, 0, 10));
		
		OptionSearchTF pBCode = new OptionSearchTF();
		pBCode.setTitle("도서코드");
		add(pBCode);
		
		OptionSearchTF pBName = new OptionSearchTF();
		pBName.setTitle("도  서  명");
		add(pBName);
		
		OptionSearchCmb pCoden = new OptionSearchCmb();
		pCoden.setTitle("분       류");
		add(pCoden);
		
		OptionSearchTF pPublisher = new OptionSearchTF();
		pPublisher.setTitle("출  판  사");
		add(pPublisher);

	}

}
