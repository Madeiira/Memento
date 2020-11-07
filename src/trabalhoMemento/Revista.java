package trabalhoMemento;

public class Revista {
	private int id;
    private String title;
    private String content;
     
    public Revista(int id, String title) {
        super();
    	this.id = id;
        this.title = title;
    }
    
    public revistaMemento createMemento() 
    {
    	revistaMemento m = new revistaMemento(id, title, content);
        return m;
    }
     
    public void restore(revistaMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();
    }
 
    @Override
    public String toString() {
        return "Article [id=" + id + ", Titulo=" + title + ", Conteudo=" + content + "]";
    }

public void setContent(String content) {
		
		this.content = content;
	}
}
