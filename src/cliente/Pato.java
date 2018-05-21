package cliente;

import compGrasnar.GrasnoComportamento;
import compVoar.VooComportamento;

public class Pato {
	
	private VooComportamento vooComp;
	private GrasnoComportamento grasnoComp;
	
	
	public void realizarVoo() {
		vooComp.voar();
	}
	
	public void realizarGrasno() {
		grasnoComp.grasnar();
	}

	
	public void nadar() {
		System.out.println("Pato nadando. xua");
	}
	
	public void exibir() {
		
	}

	public void setVooComp(VooComportamento vooComp) {
		this.vooComp = vooComp;
	}
	
	public void setGrasnoComp(GrasnoComportamento grasnoComp) {
		this.grasnoComp = grasnoComp;
	}
	
}
