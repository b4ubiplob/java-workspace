package org.tan90.training.datastructures.graph;

import java.util.Objects;

public class GridNode {
	
	private int row;
	private int column;
	
	public GridNode(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public int hashCode() {
		return Objects.hash(column, row);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GridNode other = (GridNode) obj;
		return column == other.column && row == other.row;
	}
	
	public String toString() {
		return row + "-" + column;
	}

	
}
