package cliente;

import compGrasnar.GrasnoComportamento;
import compVoar.VooComportamento;

public class PatoSelvagem extends Pato {

	@Override
	public void exibir() {
		super.exibir();
		System.out.println("\nPato Selvagem: - askdjaskdagddfhsjehskdjsa!");
	}

	public void realizarVoo(VooComportamento vooComp) {
		vooComp.voar();
	}

	public void realizarGrasno(GrasnoComportamento grasnoComp) {
		grasnoComp.grasnar();
	}

}
