package app;

import model.Addition;
import model.Context;

public class Main {

	public static void main(String[] args) {
		Context context=new Context(new Addition());
		System.out.println(context.execute(5, 2));
	}

}
