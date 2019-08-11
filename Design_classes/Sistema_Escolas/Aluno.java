public class Aluno{
	private Prova prova1;
	private Prova prova2;

	public Aluno(){
		prova1 = new Prova();
		prova2 = new Prova();
	}

	public void set_prova1(double n1, double n2){
		prova1.set_notaParte1(n1);
		prova1.set_notaParte2(n2);
	}

	public void set_prova2(double n1, double n2){
		prova2.set_notaParte1(n1);
		prova2.set_notaParte2(n2);
	}

	public double calcularMedia(){
		double nota1 = prova1.calcularNotaTotal();
		double nota2 = prova2.calcularNotaTotal();

		return (nota1 + nota2) / 2;
	}
}