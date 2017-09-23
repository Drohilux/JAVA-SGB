package negocio;

import java.util.ArrayList;

public class Autor {
    private String nome;
    private String sobrenome;
    private ArrayList<Livro> livros;
    
    public Autor(String nome, String sobrenome) {
    	//Construtor com dois parametros//
        this.nome = nome;
        this.sobrenome = sobrenome;
        livros= new ArrayList<>();
    }
    
    public Autor(ArrayList<Livro> livros) {
    	//Construtor com um parametro//
		super();
		this.livros = livros;
	}
    
    public String getNomeCompleto(){
        //Funcao que retorna nome completo//
        return nome + " " + sobrenome;
    }
    
    public String getCitacaoBibliografica(Autor autor){
        //Retorna a citacao bibliografica do autor//
        //nome e sobrenome (Ex. SOBRENOME, N.)//
    	return getSobrenome().toUpperCase() + ", " + getNome().substring(0, 1) + ".";
	}
    
    /*Getters and Setters*/    
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}