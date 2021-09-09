package exercicios.poo.correcao.patinete;

public class TestaPatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patinete pat1 = new Patinete();
		
		pat1.setModelo("Traxart 4 rodas Retro");
		pat1.setAno("2018");
		pat1.setCor("Branco");
		pat1.setPreco(300.20);
		
		System.out.println("Modelo: " + pat1.getModelo() + "	\nAno de lançamento : " + 
		pat1.getAno() + "\nCor " + pat1.getCor() + "\nPreço: " + pat1.getPreco());

	}

}
