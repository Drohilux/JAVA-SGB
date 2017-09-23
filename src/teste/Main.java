package teste;

import java.util.ArrayList;
import negocio.Autor;
import negocio.Livro;

public class Main {
	
	public static void main(String[] args) {
		//Instaciando a lista de autores do tipo Autor//
		ArrayList<Autor> autores = new ArrayList<Autor>();
		
		//Instanciando os objetos do tipo Autor, setando seus atributos e adicionando a lista de autores//
		Autor autor1 = new Autor("Nome","Sobrenome");
		autor1.setNome("Miachel");
        autor1.setSobrenome("Morrison");
        autores.add(autor1);
        
        Autor autor2 = new Autor("Nome","Sobrenome");
        autor2.setNome("Ian");
        autor2.setSobrenome("Sommerville");
        autores.add(autor2);
        
        Autor autor3 = new Autor("Nome","Sobrenome");
        autor3.setNome("Alistair");
        autor3.setSobrenome("Cokburn");
        autores.add(autor3);
        
        //Instanciando a lista de livros do tipo Livro//
        ArrayList<Livro> livros = new ArrayList<Livro>();
        
        //Instanciando os objetos do tipo Livro, setando seus atributos e adicionando a lista de livros//
        Livro livro1 = new Livro("titulo", "editora", 0);
        livro1.adicionaAutor(autor1);
        livro1.setTitulo("Use a cabeça");
        livro1.setEditora("O'Reilly");
        livro1.setAno(2013);
        livros.add(livro1);
        
        Livro livro2 = new Livro("titulo", "editora", 0);
        livro2.adicionaAutor(autor2);
        livro2.setTitulo("Engenharia de Software");
        livro2.setEditora("Pearson");
        livro2.setAno(2011);
        livros.add(livro2);
        
        Livro livro3 = new Livro("titulo", "editora", 0);
        livro3.adicionaAutor(autor3);
        livro3.setTitulo("Escrevendo casos de uso eficazes");
        livro3.setEditora("Bookman");
        livro3.setAno(2008);
        livros.add(livro3);
        
        //Chamada das funcoes para testar suas funcionalidades//
        for(Livro l : livros){
        	l.imprimirFichaCatalografica();
        	l.listarAutores();
        	l.buscarAutor("Alistair Cokburn");
        	l.removerAutor("Ian Sommerville");
        }
	}	
}