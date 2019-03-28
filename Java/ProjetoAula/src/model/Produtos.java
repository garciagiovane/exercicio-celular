package model;

/**
 * @author Giovane Garcia
 * @version 1.0 - 27/03/2019
 * @since 27/03/2019
 * @see Classe receber� os atributos de produtos, m�todos acessores (gets e sets)
 * 
 */
public class Produtos {
	private String modelo, dataFabricacao, tipo, origem;
	public String marca;
	protected float valor;
	private int qtdTotal, qtdDisponivel, qtdDevolucao;
	
	/**
	 * 
	 * @see Loja s� trabalha com produtos XIAOMI, ent�o a marca � sempre essa mesma
	 * @param marca 
	 * @param origem 
	 */
	
	public Produtos() {
		
	}
	
	public Produtos(String marca, String origem) {
		this.marca = marca;
		setOrigem(origem);
	}
	
	
	/**
	 * 
	 * @param marca
	 * @param origem
	 * @param modelo
	 * @param tipo
	 */
	public Produtos(String marca, String origem, String modelo, String tipo) {
		this.marca = marca;
		setOrigem(origem);
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public int getQtdTotal() {
		return qtdTotal;
	}
	
	public void setQtdTotal(int qtdTotal) {
		this.qtdTotal = qtdTotal;
	}
	
	public int getQtdDisponivel() {
		return qtdDisponivel;
	}
	
	public void setQtdDisponivel(int qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}
	
	public int getQtdDevolucao() {
		return qtdDevolucao;
	}
	
	public void setQtdDevolucao(int qtdDevolucao) {
		this.qtdDevolucao = qtdDevolucao;
	}
	
	
}//fecha Produtos
