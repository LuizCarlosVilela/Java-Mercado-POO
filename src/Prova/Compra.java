package Prova;

import java.util.List;;

public class Compra {
	private String data;
	private String nome;
	private float valor;

	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	private List produtos;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List getProdutos() {
		return produtos;
	}
	public void setProdutos(List produtos) {
		this.produtos = produtos;
	}
	
	
	

}
