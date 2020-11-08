package trabalhoMemento;

public class Revista {
	private int edition;
    private String title;
    private String content;
     
    public Revista(int edition, String title) {
       
    	this.edition = edition ;
       
    	this.title = title;
    
    }
    
    public revistaMemento createMemento() 
    {
    	
    	revistaMemento mementoss = new revistaMemento(edition, title, content);
        
    	return mementoss;
    }
     
    public void restore(revistaMemento mementos) {
        
    	this.edition = mementos.getEdition();
        
    	this.content = mementos.getContent();
        
    	this.title = mementos.getTitle();
       
    }
 
    @Override
    public String toString() {
        
    	return "Revista [Edição=" + edition + ", Conteudo=" + title + ", Titulo=" + content + "]";
    
    }
    
	public void setContent(String content) {
			
			this.content = content;
	
	}

}
