package trabalhoMemento;

public final class revistaMemento {
	private final int edition;
    private final String title;
    private final String content;
     
    public revistaMemento(int edition, String title, String content) {

        this.edition = edition;
   
        this.title = title;
        
        this.content = content;
    
    }
 
    public int getEdition() {
    
    	return edition;
    
    }
 
    public String getTitle() {
    
    	return title;
    
    }
 
    public String getContent() {
    
    	return content;
    
    }

}
