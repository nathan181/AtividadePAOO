
public class Empregado2 extends Empregado {
	public Empregado2 (double salario, int tipo) {
		super(salario, tipo);}
	
	protected double percenttualComissao;

	public double getPercenttualComissao() {
		return percenttualComissao;
	}

	public void setPercenttualComissao(double percenttualComissao) {
		this.percenttualComissao = percenttualComissao;
	}
	 public double getValoraReceber() {
		 return getSalario()+ getSalario()* getPercenttualComissao();	
	    }
}
