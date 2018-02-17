package br.com.inmetrics.calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculosTeste {
	
	Operacoes operacoes = new Operacoes();
	
	@Before
	public void header(){
		System.out.println("Calculadora Inmetrics");
	}
	
	@Test
	public void calcular() throws InterruptedException{
		double a = 3.0;
		double b = 4.0;
		boolean hasValue = false;
		String valor = "Sakurai";
		
		double resultado = operacoes.multiplicar(a, b);
		
		System.out.println("Operação: "+ a + " X "+ b + " = " + resultado);
		
		Assert.assertNotNull(valor);
	}
	
	@After
	public void finalize(){
		System.out.println("Essa calculadora foi criada por especialistas");
	}
	
}
    