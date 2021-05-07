package br.com.proway.senior.escola.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import utils.Validators;

/**
 * Reúne as {@link Prova}s de um {@link Aluno}.
 * 
 * O boletim possui uma lista de {@link Prova}s e é referente a um periodo de um
 * {@link Aluno}. Para cada período é calculada a média das provas que resulta
 * na nota do Boletim.
 * 
 * @author ricardo.goncalves
 *
 */
public class Boletim {

	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;

	/**
	 * Cria um novo Boletim
	 * 
	 * O Boletim é criado a partir de um aluno e um período. Conforme as provas são
	 * adicionadas, realiza-se o cálculo atualizado da média.
	 * 
	 * @param aluno
	 * @param periodo
	 * @param media
	 */
	public Boletim(Aluno aluno, Integer periodo) {
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = 0.0;
		this.provas = new ArrayList<Prova>();
	}

	/**
	 * Aluno do boletim
	 * 
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * Período no formato YYYYMM
	 * 
	 * @return
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * Retorna a média das provas atualizada.
	 * 
	 * @return
	 */
	public Double getMedia() {
		calcularMedia();
		return media;
	}

	/**
	 * Retorna todas as provas.
	 * 
	 * @return ArrayList<Prova>
	 */
	public ArrayList<Prova> getProvas() {
		return this.provas;
	}

	/**
	 * Adiciona uma avaliação ao boletim.
	 * 
	 * Ao adicionar a Prova, a média é recalculada.
	 * 
	 * @param prova
	 */
	public void addProva(Prova prova) {
		this.provas.add(prova);
		}
		
			

	/**
	 * Remove uma avaliação do boletim.
	 * 
	 * Ao remover a Prova, a média é recalculada.
	 * 
	 * @param prova
	 * @throws Exception 
	 */
	
	public void removeProva(int index) throws Exception {
		if (index < 0) {
			throw new Exception("Somente...");
		}
		this.provas.remove(index);
		
	}

	/**
	 * Calcula a média ponderada das provas.
	 * 
	 * Realiza o cálculo da média das notas das provas e atualiza o valor da media.
	 */
	
	private void calcularMedia() {
		Double somaDasProvas = 0d;
		for (int i = 0; i < provas.size(); i++) {
			somaDasProvas += provas.get(i).getNota();
			this.media = somaDasProvas / provas.size();
			
		}
			
	}

	/**
	 * Remove todas as provas.
	 * 
	 */
	
	public void removeTodasProvas() {
		this.provas.removeAll(provas);
		
	}

}