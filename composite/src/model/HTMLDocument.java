package model;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument implements Tag{
	private String name;
	private List<Tag> tags;
	
    public HTMLDocument(String name) {
		tags=new ArrayList<>();
		this.name=name;
	}
    
    public void addElement(Tag tag){
    	tags.add(tag);
    }
    
    public void removeElement(Tag tag){
    	tags.remove(tag);
    }
    
    public List<Tag> children(){
    	return tags;
    }

	@Override
	public void setFirstTag(String name) {
		for(Tag tag:tags)
			tag.setFirstTag(name);
	}

	@Override
	public void setEndTag(String name) {
		for(Tag tag:tags)
			tag.setEndTag(name);
	}

	@Override
	public void setValue(String name) {
		for(Tag tag:tags)
			tag.setValue(name);
	}

	@Override
	public void print() {
		System.out.println("<"+name+">");
		for(Tag tag:tags)
			tag.print();
		System.out.println("</"+name+">");
	}

}
