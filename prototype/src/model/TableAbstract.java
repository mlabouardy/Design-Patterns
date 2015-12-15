package model;

public abstract class TableAbstract implements Table{
	private int height;
	private int width;
	
	public TableAbstract(int height, int width){
		this.height=height;
		this.width=width;
	}
	
	public int getWidth(){
		return height;
	}
	
	public int getHeight(){
		return width;
	}
	
	public Table clone(){
		Table table=null;
		try {
			table=(Table)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return table;
	}

}
