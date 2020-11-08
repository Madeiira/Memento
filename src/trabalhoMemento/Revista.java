package trabalhoMemento;

public class Revista {
	private int id;
    private String title;
    private String content;
     
    public Revista(int id, String title) {
       
    	this.id = id ;
       
    	this.title = title;
    
    }
    
    public revistaMemento createMemento() 
    {
    	
    	revistaMemento mementoss = new revistaMemento(id, title, content);
        
    	return mementoss;
    }
     
    public void restore(revistaMemento mementos) {
        
    	this.id = mementos.getId();
        
    	this.content = mementos.getContent();
        
    	this.title = mementos.getTitle();
       
    }
 
    @Override
    public String toString() {
        
    	return "Revista [id=" + id + ", Titulo=" + title + ", Conteudo=" + content + "]";
    
    }
    
	public void setContent(String content) {
			
			this.content = content;
	
	}

}
