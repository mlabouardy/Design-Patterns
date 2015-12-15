package model;

public class ShoppingCart {
	
	private static ShoppingCart instance=null;
	
	private ShoppingCart(){
		
	}

	public static ShoppingCart getInstance(){
		if(instance==null){
			System.out.println("create");
			instance=new ShoppingCart();
		}
		System.out.println("inside");
		return instance;
	}

}
