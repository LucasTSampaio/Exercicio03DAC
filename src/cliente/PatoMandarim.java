package cliente;

import compGrasnar.GrasnoComportamento;
import compVoar.VooComportamento;

public class PatoMandarim extends Pato {

	@Override
	public void exibir() {
		super.exibir();
		System.out.println("\nPato Mandarim: - China china, jackie chan, bruce lee!");
	}

	public void realizarVoo(VooComportamento vooComp) {
		vooComp.voar();
	}

	public void realizarGrasno(GrasnoComportamento grasnoComp) {
		grasnoComp.grasnar();
	}

}
