package main;

import cliente.PatoMandarim;
import cliente.PatoSelvagem;
import compGrasnar.Grasno;
import compGrasnar.GrasnoComportamento;
import compGrasnar.GrasnoNao;
import compGrasnar.Rangido;
import compVoar.VooComAsas;
import compVoar.VooComportamento;
import compVoar.VooNao;

public class TestaPato {
	public static void main(String[] args) {

		// comportamentos
		GrasnoComportamento rangComp = new Rangido();
		GrasnoComportamento grasnoComp = new Grasno();
		GrasnoComportamento naoGrasno = new GrasnoNao();// não usado
		VooComportamento vooAsasComp = new VooComAsas();
		VooComportamento naoVoo = new VooNao();

		// patos
		PatoMandarim patoMandarim = new PatoMandarim();
		patoMandarim.exibir();
		patoMandarim.setGrasnoComp(grasnoComp);
		patoMandarim.setVooComp(naoVoo);
		patoMandarim.realizarGrasno();
		patoMandarim.realizarVoo();

		PatoSelvagem patoSelvagem = new PatoSelvagem();
		patoSelvagem.exibir();
		patoSelvagem.realizarGrasno(rangComp);
		patoSelvagem.realizarVoo(vooAsasComp);

	}

}
