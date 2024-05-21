package entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Pedro Alex
 */
@Entity
public class PessoaFisica extends Pessoa{

	@Column(length = 100)
    private String nome;
	
	@Column(length = 20)
    private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}