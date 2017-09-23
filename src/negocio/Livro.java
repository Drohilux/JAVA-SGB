package negocio;

import java.util.ArrayList;
import java.util.Iterator;

public class Livro {
    private String titulo;
    private String editora;
    private int ano;
    private ArrayList<Autor> autores; 
    
    public Livro(String titulo){
    	//Construtor com um parametro//
	    this.titulo = titulo;
	    autores = new ArrayList<>();
    }
    
    public Livro(String titulo, String editora, int ano){
    	//Construtor  com dois parametros//
	    this.titulo = titulo;
	    this.editora = editora;
	    this.ano = ano;
	    autores = new ArrayList<>();
	}
    
    public Livro(ArrayList<Autor> autores) {
    	//Construtor  com um parametro//
		super();
		this.autores = autores;
	}
    
    public void adicionaAutor(Autor autor){
    	//Funcao que adiciona autor na lista de autores//
        autores.add(autor);
    }
    
    public void imprimirFichaCatalografica(){
    	//Funcao que Imprime em tela a ficha catalográfica do livro.//
    	//Ex.: SOBRENOME, N. (ANO) Titulo. Editora, ANO.//
    	for(Autor a: autores){
    		System.out.println(a.getCitacaoBibliografica(a) + "(" + getAno()+ ")" + " " + getTitulo()+ 
    				". " + getEditora()+ ", " + getAno()+ ".");
        }	
    }    
    
    public void listarAutores(){
    	//Funcao que imprime os autores na lista de autores//
    	Iterator<Autor> lista = autores.iterator();
    	while(lista.hasNext()){
    		Autor nomesAutor = lista.next();
    		System.out.println(nomesAutor.getNomeCompleto());
    	}
    }
    
    public void buscarAutor(String nomeCompleto){
    	//Funcao que verifica se o autor encontra-se na lista de autores//
    	Iterator<Autor> lista = autores.iterator();
    	String autor = "";
    	while(lista.hasNext()){
    		Autor nomesAutor = lista.next();
    		if(nomesAutor.getNomeCompleto().equals(nomeCompleto)){
    			autor = nomeCompleto;
    		}
		}
    	if(autor != ""){
			System.out.println(autor);
    	} else {
    		System.out.println("O Autor não foi encontrado");
    	}
    }
       
    public void removerAutor(String nomeCompleto){
    	//Funcao que remove autor da lista de autores//
    	Iterator<Autor> lista = autores.iterator();
    	String autor = "";
    	while(lista.hasNext()){
    		Autor nomesAutor = lista.next();
    		if(nomesAutor.getNomeCompleto().equals(nomeCompleto)){
    			autor = nomeCompleto;
    			lista.remove();
    			
    		}
    		if(autor != ""){
    			System.out.println("Autor removido com sucesso");
    		}else{
    			System.out.println("O Autor não foi encontrado");
    		}
    	}
    }

    ///*Getters and Setters*/
	public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }    
}