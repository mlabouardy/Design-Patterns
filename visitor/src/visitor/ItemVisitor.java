package visitor;

import model.Computer;
import model.Item;

public interface ItemVisitor {
	
	public void visit(Item item);
	public void visit(Computer computer);

}
