package trabalhoMemento;

public class main {
	public static void main(String[] args) 
    {
        Revista resvista = new Revista(1, "Minha revista");
        resvista.setContent("Homem Aranha Primeira Edi��o (Revolution)");      //Conteudo Original
        System.out.println(resvista);
         
        revistaMemento memento = resvista.createMemento();   //memento
         
        resvista.setContent("Homem Aranha Primeira Edi��o");      //alterando o conteudo 
        System.out.println(resvista);
         
        resvista.restore(memento);       //Restaurar Conteudo
        System.out.println(resvista);    //Conteudo Original
    }
}
