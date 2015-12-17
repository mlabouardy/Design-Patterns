package visitor;

import model.Computer;
import model.Item;

public class DisplayItems implements ItemVisitor{

	@Override
	public void visit(Item item) {
		System.out.println(item.getName());
	}

	@Override
	public void visit(Computer computer) {
		for(Item item:computer.children())
			item.accept(this);
	}

}
