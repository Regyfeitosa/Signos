package desafiosetembro1;

import java.util.Collection;
import java.util.List;

public class Usuario {

	final String nome;

	final int idade;

	public Usuario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	String getNome() {
		return nome;
	}

	int getIdade() {
		return idade;
	}

}
