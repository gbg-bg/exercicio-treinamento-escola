package br.com.proway.senior.escola.model;

/**
 * Avalia��o do desempenho do Aluno em uma Materia.
 * 
 * A prova registra uma avalia��o realizada pelo {@link Aluno} relativo ao
 * conhecimento de uma {@link Materia}. O {@link Aluno} podera realizar varias
 * avaliacoes da mesma {@link Materia}. A medida ponderada das notas das Provas
 * verifica se o aluno foi aprovado.
 * 
 * @author senior
 * @see Aluno
 * @see Boletim
 */

public class Prova {

	private Integer periodo;
	private Aluno aluno;
	private Materia materia;
	private Double nota;
	
	/**
	 * Avalia��o de desempenho do aluno
	 * 
	 * No construtor da prova n�o atribui-se valor para a nota para que seja
	 * poss�vel a cria��o de provas para depois serem atribu�das as notas
	 * 
	 * @param periodo Periodo no formato YYYYMM
	 * @param aluno Aluno que realizou a prova
	 * @param materia Materia da prova
	 */
	public Prova(Integer periodo, Aluno aluno, Materia materia) {
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
	}
	
	
	/**
	 * Valor da avalia��o do aluno.
	 */
	public Double getNota() {
		return nota;
	}
	
	/**
	 * Determina a avalia��o do aluno.
	 * 
	 * N�o pode ser menor que 0 nem maior do que o atributo Materia.notaMaxima.
	 * 
	 * @param nota
	 */
	public void setNota(Double nota) throws Exception {
		if(nota < 0 || nota > this.materia.notaMaxima) {
			throw new Exception("Valor da nota inv�lido.");
		}
		this.nota = nota;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Materia getMateria() {
		return materia;
	}
	
	
	
}
