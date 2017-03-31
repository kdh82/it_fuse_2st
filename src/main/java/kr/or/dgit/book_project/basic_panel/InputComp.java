package kr.or.dgit.book_project.basic_panel;

import java.util.regex.Pattern;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InputComp extends CompPanel {
	private JTextField tF;
	
	public InputComp() {
		
		tF = new JTextField();
		tF.setColumns(10);
		pContent.add(tF);
		

	}

	public JTextField getTF() {
		return tF;
	}

	public void setTF(JTextField tF) {
		this.tF = tF;
	}

	public String getTFValue() {
		return tF.getText();
	}

	public void setTFValue(String str) {
		tF.setText(str);
	}

	public String getTitle() {
		return lblTitle.getText();
	}

	public boolean isEmpty() {
		if (getTFValue().equals("")) {
			return true;
		}
		return false;
	}

	public void isEmptyCheck() throws Exception {
		if (getTFValue().equals("")) {
			throw new Exception("공백 존재");
		}
	}

	public void isValidCheck(String pattern, String msg) throws Exception {
		if (!Pattern.matches(pattern, getTFValue())) {
			throw new Exception(msg);
		}
	}
}
