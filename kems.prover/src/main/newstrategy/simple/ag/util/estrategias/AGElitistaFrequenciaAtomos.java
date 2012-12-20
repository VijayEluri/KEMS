package main.newstrategy.simple.ag.util.estrategias;

import logic.signedFormulas.SignedFormula;
import main.newstrategy.simple.ag.util.AnaliseNumeroAtomos;

/**
 * Seleciona com base na frequ�ncia de �tomos das regras PB e das f�rmulas da �rvore
 * @author Emerson Shigueo Sugimoto
 * */
public class AGElitistaFrequenciaAtomos extends AGEstrategia {

	@Override
	public SignedFormula getSignedFormula() {
		AnaliseNumeroAtomos ana = new AnaliseNumeroAtomos();
		SignedFormula rt = ana.getSFAnaliseAtomos(getListaFormulasJaSelecionadas(), getPblist().getListSignedFormula(),getStrategy(),true,true);
		//if (rt == null){rt = ana.getSFAnaliseAtomos(getListaFormulasJaSelecionadas(), getPblist().getListSignedFormula(),getStrategy(),false,false);}
		//evitar a re-sele��o
		while(getListaFormulasJaSelecionadas().contains(rt)) {
			rt = ana.getSFAnaliseAtomos(getListaFormulasJaSelecionadas(), getPblist().getListSignedFormula(),getStrategy(),true,false);
		}
		if (rt!=null) getListaFormulasJaSelecionadas().add(rt);
		return rt;
	}

}