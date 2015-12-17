package app;

import model.Editor;
import model.EditorMemento;

public class Main {

	public static void main(String[] args) {
		Editor editor=new Editor("hello");
		EditorMemento saved=editor.setMemento();
		editor.setContent("bye");
		editor.content();
		editor.createMemento(saved);
		editor.content();
	}

}
