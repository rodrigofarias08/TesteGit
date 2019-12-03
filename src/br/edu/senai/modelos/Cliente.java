package br.edu.senai.modelos;

public class Cliente extends Pessoa {
	
	private int id;
	private String categoria;
	private int nCompras;
	private boolean ativo;
	private Funcionario funcFav; // Funcionário favorito
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, int idade, String cpf, int id, String categoria, int nCompras, boolean ativo,
			Funcionario funcFav) {
		super(nome, idade, cpf);
		this.id = id;
		this.categoria = categoria;
		this.nCompras = nCompras;
		this.ativo = ativo;
		this.funcFav = funcFav;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getnCompras() {
		return nCompras;
	}

	public void setnCompras(int nCompras) {
		this.nCompras = nCompras;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Funcionario getFuncFav() {
		return funcFav;
	}

	public void setFuncFav(Funcionario funcFav) {
		this.funcFav = funcFav;
	}
	
	
	
	
	

}
