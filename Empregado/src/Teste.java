
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {
	public static void main(String[] args) {
		Random gerador = new Random ();
		List <Empregado> empregados = new ArrayList <> (); //<> operador diamante
		for( int i = 1; i<=10; i++) {
			int tipo = gerador.nextInt(4) + 1;
			int salario = 24;
			Empregado1 aux = new Empregado1  (salario, tipo);
			Empregado2 aux2 = new Empregado2(salario, tipo);
			Empregado3 aux3 = new Empregado3(salario, tipo);
			Empregado4 aux4 = new Empregado4(salario, tipo);
			if(tipo == 1) {
				aux.setSalario(2500 + gerador.nextDouble() * 700);
			}
			else if (tipo == 2) {
			aux2.setSalario(1500 + gerador.nextDouble() * 500);
			aux2.setPercenttualComissao(gerador.nextDouble());
			}
			else if (tipo == 3) {
				aux3.setSalario(1200 + gerador.nextDouble() * 500);
				aux3.setPercenttualComissao(gerador.nextDouble());
				aux3.setBonus(500 + gerador.nextDouble() * 500);
			}
			else {
				aux4.setBonus(2000 + gerador.nextDouble() * 2000);
			}
			empregados.add(aux);
			empregados.add(aux2);
			empregados.add(aux3);
			empregados.add(aux4);
		}	




	//aqui começa o problema
	// for each ou enchanted for

		for (Empregado e : empregados)
		{
			System.out.println("Valor a receber: " + e.getValoraReceber());
		}
		}

	}

