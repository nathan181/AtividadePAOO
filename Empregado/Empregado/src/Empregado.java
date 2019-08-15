

public class Empregado{

	protected int tipo;
	protected double salario;
	//protected double percenttualComissao;
	//protected double bonus;

	
	// constutor padrao
	public Empregado (double salario, int tipo) {}

	public Empregado(int tipo) {
		this.tipo = tipo;
	}
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
		}
	
	
	public double getValoraReceber() {
		 return getSalario();
	    }
}



	
	



	

