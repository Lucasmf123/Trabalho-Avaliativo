import java.util.ArrayList;

public class Produtos {
	
	//Atributos
	private double codigoProduto;
	private String nomeProduto;
	private String descricao;
	private double valor;
	private double valorUnitario;
	
	//ArrayList
	public static ArrayList<Produtos> dadosCadastro = new ArrayList<>();
	
	//Métodos magicos
	public double getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(double codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}	
	

}