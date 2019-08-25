package locavel;

import java.util.ArrayList;

public class Loja {
	
	private ArrayList<Veiculo> veiculos;

	public Loja() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	// método add
	public void addVeiculo(Veiculo v) {
		veiculos.add(v);
	}
	
	// método remove
	public void removeVeiculo(Veiculo v){
		veiculos.remove(v);
	}

	// método para listar todos os veículos
	public void printVeiculos() {
		System.out.println("Lista de Veiculos:");
		for(Veiculo v: veiculos){
			System.out.println("Veiculo: " + v.getPlaca());
		}
	}
	
	// método para listar todos os veículos alugados
	public void printAlugados() {
		System.out.println("==============Alugados==============");
		for (Veiculo veiculo : veiculos) {
			if (veiculo.isAlugado()) {
				if (veiculo instanceof Moto) {
					System.out.println("Moto: " + veiculo.getModelo() + " Placa: " 
							+ veiculo.getPlaca() + " Marca: "
							+ veiculo.getMarca() + " Partida: " 
							+ ((Moto) veiculo).getPartida() + " Cilindradas : "
							+ ((Moto) veiculo).getCilindradas());
				} else {
					System.out.println("Carro: " + veiculo.getModelo() + " Placa: " 
							+ veiculo.getPlaca() + " Marca: "
							+ veiculo.getMarca() + " Motor : " 
							+ ((Carro) veiculo).getPotencia() + " Portas: "
							+ ((Carro) veiculo).getPortas());
				}
			}
		}
		System.out.println("==============  Fim  ==============");
	}

	// método para listar todos os veículos livres
	public void printLivres() {

		System.out.println("==============Livres==============");

		for (Veiculo veiculo : veiculos) {
			if (!veiculo.isAlugado()) {
				if (veiculo instanceof Moto) {
					System.out.println("Moto: " + veiculo.getModelo() + " Placa: " 
							+ veiculo.getPlaca() + " Marca: "
							+ veiculo.getMarca() + " Partida: " 
							+ ((Moto) veiculo).getPartida() + " Cilindradas : "
							+ ((Moto) veiculo).getCilindradas());
				} else {
					System.out.println("Carro: " + veiculo.getModelo() + " Placa: " 
							+ veiculo.getPlaca() + " Marca: "
							+ veiculo.getMarca() + " Motor : " 
							+ ((Carro) veiculo).getPotencia() + " Portas: "
							+ ((Carro) veiculo).getPortas());
				}
			}
		}
		System.out.println("==============  Fim  ==============");
	}
	
	public static void main(String[] args) {
		Loja lc = new Loja();
		
		Carro c = new Carro();
		c.setAlugado(true);
		c.setMarca("Pontiac");
		c.setModelo("GT3");
		c.setPlaca("AAA-8888");
		c.setPortas(4);
		c.setPotencia(1600);
		
		Moto m = new Moto();
		m.setAlugado(false);
		m.setMarca("Honda");
		m.setModelo("Fan");
		m.setPlaca("BBB-2019");
		m.setCilindradas(850);
		m.setPartida("Elétrica");
				
		lc.addVeiculo(c);
		lc.addVeiculo(m);
		
		lc.printVeiculos();
		System.out.println();
		
		lc.printLivres();
		System.out.println();
		
		lc.printAlugados();
		System.out.println();
	}
}
