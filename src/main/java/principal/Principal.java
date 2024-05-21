package principal;

import dao.PessoaDAO;
import entities.Endereco;
import entities.PessoaFisica;
import entities.PessoaJuridica;

/**
 * @author Pedro Alex
 */
public class Principal {
	
	public static void main(String[] args) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Pedro");
		pessoaFisica.setCpf("123.456.789-00");

		Endereco endereco = new Endereco();
		endereco.setCep("64000-000");
		endereco.setRua("Av. 123");
		endereco.setBairro("Centro");
		endereco.setCidade("Teresina");
		
		pessoaFisica.setEndereco(endereco);
		
		pessoaDAO.salvar(pessoaFisica);

		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setRazaoSocial("Pereira da Silva S.A.");
		pessoaJuridica.setCnpj("01.234.567/0001-00");

		endereco = new Endereco();
		endereco.setCep("64000-000");
		endereco.setRua("Rua ABC");
		endereco.setBairro("Centro");
		endereco.setCidade("Teresina");
		
		pessoaJuridica.setEndereco(endereco);
		
		pessoaDAO.salvar(pessoaJuridica);
		
	}
}
