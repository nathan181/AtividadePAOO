
public class Empregado4 extends Empregado {
	public Empregado4 (double bonus, int tipo) {
		super(bonus, tipo);}
	
	protected double bonus;
	protected double ValorAReceber;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	 public double getValoraReceber() {
		 return getBonus();
	    }
}
