package kr.or.dgit.book_project.ui.view;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.book_project.dto.BookInfo;
import kr.or.dgit.book_project.ui.component.BookInfoP;

public class BookSearchViewFrame extends JFrame {

	private JPanel contentPane;
	private BookInfoP bookInfoP;
	private BookSearchView bookSearchView;

	public BookSearchViewFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		bookSearchView = new BookSearchView();
		contentPane.add(bookSearchView);
	}

	
	public void setMyMouseListener(BookInfoP bookInfoP) {
		this.bookInfoP = bookInfoP;
		bookSearchView.getpTable().getTable().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					BookInfo bookInfo = bookSearchView.getpTable().getSelectedObject();
					bookInfo.setbSubCode((Integer.parseInt(bookInfo.getbSubCode())+1)+"");
					bookInfoP.setObject(bookInfo);
					setVisible(false);
				}
			}

		});
	}
	
	public void addBtn(String string) {
		JButton btnAddBtn = new JButton(string);
		bookSearchView.getpContent().getpBtnSub().add(btnAddBtn);
		btnAddBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				CodenView cv = new CodenView();
				cv.addMyMouseListner(bookInfoP);
				cv.setVisible(true);
				setVisible(false);

			}
		});

	}

	

}
