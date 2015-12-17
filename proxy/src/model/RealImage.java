package model;

public class RealImage implements Image{
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName=fileName;
		loading();
	}

	public void loading(){
		System.out.println("Loading: "+fileName);
	}
	
	@Override
	public void display() {
		System.out.println("Display: "+fileName);
	}

}
