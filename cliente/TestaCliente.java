package exercicios.poo.correcao.cliente;

public class TestaCliente {
	
	public static void main(String[] args) {
			
	Cliente cli1 = new Cliente();
	
	cli1.setNome("Vagner");
	cli1.setCpf("555.444.232-54");
	cli1.setEmail("email@gmail.com");
	cli1.setEndereco("Rua abapuru, 32 - Cidade Jardins");
	cli1.setIdade(25);
	
	System.out.println("Nome: " + cli1.getNome() + "\nCpf: " + cli1.getCpf() + "\nIdade: " + 
	cli1.getIdade() + "\nE-mail para contato: " + cli1.getEmail() + "\nEndereço: " + cli1.getEndereco());
	
	
	}
}
