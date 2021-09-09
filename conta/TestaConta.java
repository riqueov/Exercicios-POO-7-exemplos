package exercicios.poo.correcao.conta;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cliente1 = new Conta();
		
		cliente1.setNome("Lucas da Silva");
		cliente1.setCidade("São Paulo");
		cliente1.setCpf("321.049.213-90");
		cliente1.setSaldo(500.23);
		
		System.out.println("Nome: " + cliente1.getNome() + "	\nCpf: " + 
		cliente1.getCpf() + "\nCidade: " + cliente1.getCidade() + "\nSaldo: " + cliente1.getSaldo());
	}

}
