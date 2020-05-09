package br.com.codenation.calculadora;


public class CalculadoraSalario {

	Descontos desconto = new Descontos();

	public long calcularSalarioLiquido(double salarioBase) {
		if((Double)salarioBase==null){throw new NullPointerException();}
		else if (salarioBase<0){ return 0;}
		else if(salarioBase<1039.00){ return 0;}
		Double novoSalario = desconto.calcularInss(salarioBase);
		return Math.round(desconto.calcularIrrf(novoSalario));}}



/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar!
*/