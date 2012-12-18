package main.newstrategy.simple.ag.util.estrategias;

import java.util.ArrayList;

import logic.signedFormulas.PBCandidateList;
import logic.signedFormulas.SignedFormula;
import main.newstrategy.ISimpleStrategy;

/**
 * Interface das estrat�gias de AG desenvolvidas
 * @author Emerson Shigueo Sugimoto
 * */
public interface IEstrategiaAG {
	
	public PBCandidateList getPblist();
	public void setPblist(PBCandidateList pblist);
	public ISimpleStrategy getStrategy();
	public void setStrategy(ISimpleStrategy strategy);
	public ArrayList<SignedFormula> getListaFormulasJaSelecionadas();
	public void setListaFormulasJaSelecionadas(ArrayList<SignedFormula> listaFormulasJaSelecionadas);
	
	/**
	 * M�todo principal<br />
	 * Escolhe a f�rmula da listas de regras PB (PBCandidateList)<br />
	 * Atualiza a lista de f�rmulas PB selecionadas
	 * @see setListaFormulasJaSelecionadas(ArrayList&lt;SignedFormula&gt; listaFormulasJaSelecionadas);
	 * @author Emerson Shigueo Sugimoto
	 * */
	public SignedFormula getSignedFormula();
}