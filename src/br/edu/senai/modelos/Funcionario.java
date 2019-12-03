package br.edu.senai.modelos;

public class Funcionario extends Pessoa {
	
	private double salario;
	private String setor;
	private String matricula;
	
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, int idade, String cpf, double salario, String setor, String matricula) {
		super(nome, idade, cpf);
		this.salario = salario;
		this.setor = setor;
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	//Sobreposição do método envelhecer:
	
	@Override
	public void envelhecer() {
		this.idade++;
	}
	
	
	
	
	
	
	

}
