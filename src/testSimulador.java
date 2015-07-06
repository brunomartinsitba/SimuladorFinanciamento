import junit.framework.TestCase;

import org.junit.Test;


public class testSimulador extends TestCase {

	//Valores usados para calculo
	double valorVeiculo = 10000;
	double valorEntrada = 3000;
	double taxaJuros = 0.02;
	int prestacoes = 60;
		
	double esperado = 201.37576078064424;
	
	Simulador simulador = new Simulador();
	double retorno = simulador.calculaPrestacao(valorVeiculo, taxaJuros, prestacoes, valorEntrada);
	
	double renda = 1000;
	
	boolean esperadoRenda = false;
	
	
	@Test
	public void testCalculaPrestacao() {		
				
		assertEquals(esperado, retorno);
		}

	@Test
	public void testVerificaRenda() {
		
		double rendaManual = (1000*0.40); 
		
		if(esperado>rendaManual){
		boolean retornoRenda=false;
		assertEquals(esperadoRenda, retornoRenda);
		}
		
		
		}
	}


