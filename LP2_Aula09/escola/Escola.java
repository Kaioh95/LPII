package escola;

import java.util.ArrayList;

public class Escola {
	
	private ArrayList<Professor> professores;
	
	public Escola() {
		this.professores = new ArrayList<Professor>();
	}
	
	// método add
	public void addProfessor(Professor p) {
		professores.add(p);
		System.out.println("Professor inserido!!!");
	}
	
	// método remove
	public void removeProfessor(Professor p) {
		professores.remove(p);
		System.out.println("Professor removido!!!");
	}
	
	// método para retornar a quantidade
	public int quantidadeDeProfessores() {
		return professores.size();
	}
	
	// método para retornar o maior salário
	public Professor maiorSalario() {
		Professor p = null;
		if (professores.size() > 0) {
			double maior = 0;
			for(int i = 0; i < professores.size(); i++) {
				if(professores.get(i).getSalario() >= maior) {
					p = professores.get(i);
					maior = p.getSalario();
				}
			}
		}
		return p;
	}
	
	// método para retornar a menor idade
	public Professor maisNovo(){
		Professor p = null;
		if (professores.size() > 0) {
			int menor = 100;
			for(int i = 0; i < professores.size(); i++) {
				if(professores.get(i).getIdade() < menor) {
					p = professores.get(i);
					menor = p.getIdade();
				}
			}
		}
		return p;
	}
	
	public static void main(String[] args) {
		Escola escola = new Escola();
		
		ProfessorHorista prof1 = new ProfessorHorista();
		prof1.setIdade(35);
		prof1.setMatricula("20150234");
		prof1.setNome("Joao da Hora");
		prof1.setHorasTrabalhadas(200);
		prof1.setSalario(prof1.getHorasTrabalhadas());
		
		ProfessorIntegral prof2 = new ProfessorIntegral();
		prof2.setIdade(42);
		prof2.setMatricula("20110001");
		prof2.setNome("Francisco Lopes");
		prof2.setDepartamento("DIMAP");
		prof2.setSalario(4800);
		
		ProfessorHorista prof3 = new ProfessorHorista();
		prof3.setIdade(35);
		prof3.setMatricula("20161254");
		prof3.setNome("Maria das Virtudes");
		prof3.setHorasTrabalhadas(150);
		prof3.setSalario(prof3.getHorasTrabalhadas());
		
		ProfessorIntegral prof4 = new ProfessorIntegral();
		prof4.setIdade(25);
		prof4.setMatricula("20180102");
		prof4.setNome("Ana Maria dos Santos");
		prof4.setDepartamento("DIMAP");
		prof4.setSalario(4800);
		
		escola.addProfessor(prof1);
		escola.addProfessor(prof2);
		escola.addProfessor(prof3);
		escola.addProfessor(prof4);
		
		System.out.println("Professores na escola: " + escola.quantidadeDeProfessores());
		System.out.println();
		Professor p = escola.maiorSalario();
		System.out.println("Professor com maior salário: " + p.getNome());
		System.out.println("salário dele: " + p.getSalario());
		System.out.println();
		p = escola.maisNovo();
		System.out.println("Professor mais Novo: " + p.getNome());
		System.out.println();
		
		ProfessorIntegral prof5 = new ProfessorIntegral();
		prof5.setIdade(75);
		prof5.setMatricula("19800001");
		prof5.setNome("Zé Lezin");
		prof5.setDepartamento("IMD");
		prof5.setSalario(11500);
		
		escola.addProfessor(prof5);
		System.out.println("Professores na escola: " + escola.quantidadeDeProfessores());
		System.out.println();
		p = escola.maiorSalario();
		System.out.println("Professor com maior salário: " + p.getNome());
		System.out.println("salário dele: " + p.getSalario());
		System.out.println();
		
		escola.removeProfessor(prof3);
		System.out.println("Professores na escola: " + escola.quantidadeDeProfessores());
	}
}
