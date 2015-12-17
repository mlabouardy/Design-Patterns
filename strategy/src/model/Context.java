package model;

public class Context {
	private Operation operation;
	
	public Context(Operation operation){
		this.operation=operation;
	}
	
	public int execute(int x, int y){
		return operation.op(x, y);
	}

}
