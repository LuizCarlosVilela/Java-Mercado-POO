package Prova;

public class Produto implements Comparable <Produto> {
	private Integer id;
	private String nome;
	private String descicao;
	private float valor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescicao() {
		return descicao;
	}
	public void setDescicao(String descicao) {
		this.descicao = descicao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	@Override
	public int compareTo(Produto o) {
		if(this.id.equals(o.id)){
			return 0;
		}
		else {
			return 1;
		}
	}
	
	

}
