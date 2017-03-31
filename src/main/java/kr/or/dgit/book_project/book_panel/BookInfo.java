package kr.or.dgit.book_project.book_panel;

import javax.swing.JPanel;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

import kr.or.dgit.book_project.basic_panel.BookCodePanel;
import kr.or.dgit.book_project.basic_panel.ComboBoxPanel;
import kr.or.dgit.book_project.basic_panel.InputComp;
import kr.or.dgit.book_project.basic_panel.SpinnerPanel;

import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridBagLayout;

@SuppressWarnings("serial")
public class BookInfo extends JPanel {
	private JTextField textField_2;

	public BookInfo() {
		setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new GridLayout(5, 2, 0, 10));

		JPanel pBCode = new JPanel();
		panel.add(pBCode);
		pBCode.setLayout(new GridLayout(1, 1, 5, 0));
		
		BookCodePanel pCode = new BookCodePanel();
		GridBagLayout gridBagLayout = (GridBagLayout) pCode.getLayout();
		gridBagLayout.columnWidths = new int[] {120, 200, 0};
		pBCode.add(pCode);

		JPanel panel_6 = new JPanel();
		pBCode.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 5, 0));

		JButton btnNewAdd = new JButton("신규추가");
		panel_6.add(btnNewAdd);

		JButton btnHaveAdd = new JButton("기존추가");
		panel_6.add(btnHaveAdd);

		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));

		InputComp panel_8 = new InputComp();
		panel_8.setTitle("도  서  명");
		panel_3.add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));

		InputComp panel_10 = new InputComp();
		panel_10.setTitle("저       자");
		panel_4.add(panel_10);

		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);

		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));

		SpinnerPanel panel_14 = new SpinnerPanel();
		panel_14.setTitle("가       격");
		panel_5.add(panel_14);

		JPanel panel_15 = new JPanel();
		panel_5.add(panel_15);

		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 5, 0));

		ComboBoxPanel panel_12 = new ComboBoxPanel();
		panel_12.setTitle("출  판  사");
		panel_2.add(panel_12);

		JPanel panel_13 = new JPanel();
		panel_2.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 2, 5, 0));

		textField_2 = new JTextField();
		panel_13.add(textField_2);
		textField_2.setColumns(10);

		JButton btnAddPublisher = new JButton("추가");
		panel_13.add(btnAddPublisher);
		JLabel label = new JLabel("");

		JLabel label_1 = new JLabel("");

	}

}
