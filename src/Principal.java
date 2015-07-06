
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancia a classe simulador
		Simulador simulador = new Simulador();
		
		double prestacao = simulador.calculaPrestacao(10000, 0.02, 60, 3000);
		
		//Se a prestação atingir 40% da renda		
		if(simulador.verificaRenda(1000, prestacao)==false){
			System.out.println("Você não tem renda suficiente para o financiamento. O valor " +prestacao + " ultrapassa 40% de sua renda.");
		}
		
		//Se a prestação for compatível a renda
		else{
			System.out.println("Você esta apto a financiar o veículo");
			System.out.println("Valor da prestacao:" +prestacao);
		}

		
		
	}

}
