package app;


import model.Element;
import model.HTMLDocument;
import model.Tag;

public class Main {

	public static void main(String[] args) {
		Element p=new Element();
		p.setFirstTag("p");
		p.setEndTag("p");
		p.setValue("Hello world");
		
		HTMLDocument html=new HTMLDocument("html");
		HTMLDocument head=new HTMLDocument("head");
		HTMLDocument body=new HTMLDocument("body");
		body.addElement(p);
		html.addElement(head);
		html.addElement(body);
		html.print();
		
	}

}
