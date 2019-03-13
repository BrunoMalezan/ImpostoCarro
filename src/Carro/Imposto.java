package Carro;

public class Imposto {
	
	private static double percentagemdistribuidor = 0.28;
	private static double percentagemimpostos = 0.45;
	private double custodefabrica;
	
	public Imposto(double custodefabrica) {
		this.custodefabrica = custodefabrica;
	}
	
	public double getCustodefabrica() {
		double custodefabrica_distribuidor = (custodefabrica*percentagemdistribuidor)+custodefabrica;
		double custoconsumidor_impostos = (custodefabrica_distribuidor*percentagemimpostos)+custodefabrica_distribuidor;
		return custoconsumidor_impostos;
	}
	public void setCustodefabrica(double custodefabrica) {
		this.custodefabrica = custodefabrica;
	}

}
