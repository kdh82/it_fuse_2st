package kr.or.dgit.book_project.basic_panel;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class PasswordPanel extends CompPanel {
	protected JPasswordField pwField;

	public PasswordPanel() {

		pwField = new JPasswordField();
		pContent.add(pwField);

	}

	public JPasswordField getPwField() {
		return pwField;
	}

	public void setPwField(JPasswordField pwField) {
		this.pwField = pwField;
	}

}
