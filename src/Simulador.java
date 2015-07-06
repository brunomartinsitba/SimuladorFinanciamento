
public class Simulador {

	double valorVeiculo;
	double taxaJuros;
	int prestacoes;
	double valorEntrada;
	
		
	public double calculaPrestacao(double valorVeiculo, double taxaJuros, int prestacoes, double valorEntrada){
		
			//Valor a ser financiado
			double valorFinanciado = (valorVeiculo - valorEntrada);
			
			//Calculo do valor da prestação
			double valorPrestacao = (valorFinanciado*taxaJuros)/(1-(1/(Math.pow((1+taxaJuros), prestacoes))));
		
			return valorPrestacao;

		}
	
		//Verifica se a prestação se enquadra na renda
		//false = financiamento negado
		//true = renda compatível
		public boolean verificaRenda(double renda, double prestacao){
	
			if(prestacao>(renda*0.4)){
				return false;
			}	
			else{
				return true;}
		}		


}
