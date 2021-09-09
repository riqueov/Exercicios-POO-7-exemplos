package exercicios.poo.correcao.eletronicos;

public class TestaEletronicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eletronicos aparelho = new Eletronicos();
		
		aparelho.setTipo("Smartphone");
		aparelho.setModelo("A10");
		aparelho.setGb(64);
		aparelho.setCor("Preto");
		
		System.out.println("Tipo: " + aparelho.getTipo() + "	\nModelo : " + aparelho.getModelo() 
		+ ", na cor " + aparelho.getCor() + "\nCapacidade Gb: " + aparelho.getGb());

	}

}
