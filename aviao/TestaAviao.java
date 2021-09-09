package exercicios.poo.correcao.aviao;

public class TestaAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao a1 = new Aviao();
		
		a1.setNome("Boing");
		a1.setPais("Brasil");
		a1.setCapacidade(700);
		a1.setPeso(5);
		
		System.out.println("nome: " + a1.getNome() + "	\nPais de origem: " + a1.getPais() +
		"\nCom capacidade para " + a1.getCapacidade() + "kg, pesando " + a1.getPeso() + "tonelada(s).");

	}

}
