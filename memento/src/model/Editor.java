package model;

public class Editor {
	private String content;
	
	public Editor(String content){
		this.content=content;
	}
	
	public EditorMemento setMemento(){
		return new EditorMemento(content);
	}
	
	public void createMemento(EditorMemento editor){
		content=editor.getState();
	}
	
	public void setContent(String content){
		this.content=content;
	}
	
	public void content(){
		System.out.println(content);
	}

}
