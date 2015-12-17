package model;

public class Element implements Tag{
	
	private String beginTag;
	private String endTag;
	private String value;

	@Override
	public void setFirstTag(String name) {
		this.beginTag="<"+name+">";
	}

	@Override
	public void setEndTag(String name) {
		this.endTag="</"+name+">";
	}

	@Override
	public void setValue(String name) {
		this.value=name;
	}

	@Override
	public void print() {
		System.out.println(beginTag+value+endTag);
	}

}
