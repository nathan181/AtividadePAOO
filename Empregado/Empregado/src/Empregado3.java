
public class Empregado3 extends Empregado {
	public Empregado3 (double salario, int tipo) {
		super(salario, tipo);}
	
	protected double percenttualComissao;
	protected double bonus;
	
	
	public double getPercenttualComissao() {
		return percenttualComissao;
	}

	public void setPercenttualComissao(double percenttualComissao) {
		this.percenttualComissao = percenttualComissao;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
	 public double getValoraReceber() {
		 return getSalario()
					+ getSalario()
					* getPercenttualComissao()
					+ getBonus();
	    }
	
	
}
