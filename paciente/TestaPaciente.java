package exercicios.poo.correcao.paciente;

public class TestaPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Lucas da Silva");
		paciente1.setIdade(25);
		paciente1.setCpf("321.049.213-90");
		paciente1.setAlaHospitalar("UTI");
		
		System.out.println("Nome: " + paciente1.getNome() + "	\nCpf : " + 
		paciente1.getCpf() + "\nIdade " + paciente1.getIdade() + "\nAla do paciente: " 
		+ paciente1.getAlaHospitalar());

	}

}
