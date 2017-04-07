package kr.or.dgit.book_project.ui.common;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class ComboBoxPanel<T> extends CompPanel {

	private JComboBox<T> comboBox;

	public ComboBoxPanel() {
		pContent.setLayout(new GridLayout(1, 0, 0, 0));

		comboBox = new JComboBox();
		pContent.add(comboBox);

	}

	public void setComboDate(List<T> items) {
		for (T t : items) {
			comboBox.addItem(t);
		}
	}
	
	public JComboBox<T> getComboBox() {
		return comboBox;
	}

	public T getCombItem() {
		return (T) comboBox.getSelectedItem();
	}

	public void setComboBox(T item) {
		comboBox.addItem(item);
		comboBox.setSelectedIndex(0);
	}

	public void setSelected(int i) {
		comboBox.setSelectedIndex(i);
	}

	public void setSelectedTT(T item) {
		comboBox.setSelectedItem(item);
	}

}
