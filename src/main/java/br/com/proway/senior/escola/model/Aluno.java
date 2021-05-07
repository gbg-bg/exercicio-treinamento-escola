package br.com.proway.senior.escola.model;

import utils.Validators;

/**
 * Pessoa que estuda na escola.
 * 
 * Um aluno � uma pessoa que estuda na escola. O aluno frequenta uma Turma
 * {@link Turma} tem Nota {@link Nota} e Boletim {@link Boletim}.
 * 
 * @author Ricardo Gon�alves <ricardo@brgweb.com.br>
 * @see Nota
 * @see Boletim
 * @see Turma
 *
 */
public class Aluno {

	private String nome;

	private String sobrenome;

	private Integer idade;

	/**
	 * Primeiro nome do aluno.
	 */

	public String getNome() {
		return nome;
	}

	/**
	 * Define primeiro nome do aluno.
	 * 
	 * Utilizar apenas caracteres alfab�ticos.
	 * 
	 * @throws Exception N�o utilize n�meros no nome do aluno
	 */

	public void setNome(String nomeEntrada) throws Exception {
		if (!Validators.onlyValidChars(nomeEntrada)) {
			throw new Exception("Utilizar apenas caracteres alfab�ticos.");
		}
		this.nome = nomeEntrada;

	}

	/**
	 * �ltimo sobrenome do aluno.
	 * 
	 * @return String sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Define o �ltimo sobrenome do aluno.
	 * 
	 * Utilizar apenas caracteres alfab�ticos.
	 * 
	 * @throws Exception Utilizar apenas caracteres alfab�ticos.
	 */

	public void setSobrenome(String sobrenomeEntrada) throws Exception {
		if (!Validators.onlyValidChars(sobrenomeEntrada)) {
			throw new Exception("Utilizar apenas caracteres alfab�ticos.");
		}
		this.sobrenome = sobrenomeEntrada;
	}

	/**
	 * Idade em anos.
	 * 
	 * @return Integer idade
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * Define a idade do aluno.
	 * 
	 * Idade em anos. Deve ser um n�mero inteiro e positivo menor que 130.
	 * 
	 * @return Integer idade
	 */

	public void setIdade(Integer idadeEntrada) throws Exception {
		if (idadeEntrada < 0 || idadeEntrada > 130) {
			throw new Exception("Idade precisa estar entre 0 e 130 (inclusive)");
		}
		this.idade = idadeEntrada;
	}

}