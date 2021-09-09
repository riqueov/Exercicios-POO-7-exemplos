package exercicios.poo.correcao.funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario p1 = new Funcionario();
		
		p1.setNome("Henrique de O. Vitorino");
		p1.setCargo("Analista Junior");
		p1.setSalario(3.500);
		p1.setTempoDeServico("3 meses");
		
		System.out.println("Nome: " + p1.getNome() + "	\nCargo : " + 
		p1.getCargo() + " com salário de " + p1.getSalario() + "\nTempo de serviço: " 
		+ p1.getTempoDeServico());

	}

}
