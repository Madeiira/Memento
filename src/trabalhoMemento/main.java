package trabalhoMemento;

public class main {
	public static void main(String[] args) 
    {
		
        Revista resvista = new Revista(0, "Revista em Quadrinhos");
        
        resvista.setContent("Homem Aranha Primeira Edi��o ");      //Conteudo Original
        System.out.println(resvista);
         
        revistaMemento memento = resvista.createMemento();   //memento
         
        resvista.setContent("Homem Aranha Primeira Edi��o (Revolution)");      //alterando o conteudo 
        System.out.println(resvista + "\n");
         
       // resvista.restore(memento);       //Restaurar Conteudo
       // System.out.println(resvista);    //Conteudo Original
        
        resvista.setContent("Homem Aranha Primeira Edi��o (Far Away)");
        System.out.println(resvista);
        
        resvista.restore(memento);       //Restaurar Conteudo
        System.out.println(resvista);    //Conteudo Original
    }
}
