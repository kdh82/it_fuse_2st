package kr.or.dgit.book_project.ui.table;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public abstract class AbsTable<T> extends JPanel {
	protected JTable table;
	private JPopupMenu popupMenu;

	public AbsTable() {
		setLayout(new BorderLayout(0, 0));
//		setLayout(new BorderLayout(0, 0));

		table = new JTable();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		
		add(scrollPane);
	}

	

	public void loadData() {
		table.setModel(new DefaultTableModel(getRowData(), getColumn()) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// Cell 항목 더블클릭해도 수정되지 않게함
				return false;
			}
		});
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// cell 두개이상 선택 불가. 한개만 선택가능
		CellAlign();
		cellWith();
	}

	protected void tableSetWidth(int... width) {
		TableColumnModel tcm = table.getColumnModel();
		for (int i = 0; i < width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
	}

	protected void tableCellAlignment(int align, int... idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);

		TableColumnModel tcm = table.getColumnModel();
		for (int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}

	public JTable getTable() {
		return table;
	}
	
	protected abstract void createPopupMenu();
	

	protected abstract void updateData(T t);

	protected abstract void deleteItem(T t);

	protected abstract void cellWith();

	protected abstract void CellAlign();

	protected abstract Object[][] getRowData();

	protected abstract Object[] getColumn();

	public abstract T getSelectedObject();

}
