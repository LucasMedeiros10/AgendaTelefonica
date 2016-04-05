package br.univel.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 * Classe modelo Pessoa
 * @author LucasM
 *
 */

public class Pessoa {

    private IntegerProperty id;
    private StringProperty nome;
    private StringProperty telefone;
    
	public IntegerProperty getId() {
		return id;
	}
	public void setId(IntegerProperty id) {
		this.id = id;
	}
	public StringProperty getNome() {
		return nome;
	}
	public void setNome(StringProperty nome) {
		this.nome = nome;
	}
	public StringProperty getTelefone() {
		return telefone;
	}
	public void setTelefone(StringProperty telefone) {
		this.telefone = telefone;
	}
   
	public Pessoa(){
		
	}
    
}
