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

}
