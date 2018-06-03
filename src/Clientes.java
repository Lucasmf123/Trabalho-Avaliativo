import java.util.ArrayList;

public class Clientes {

	// Atributos
	private String nomeCliente;
	private String ruaCliente;
	private int numeroCliente;
	private int telefoneCliente;
	private String nomedonoCliente;
	private String data;

	// ArrayList
	public static ArrayList<Clientes> dadosClientes = new ArrayList<>();

	// Métodos magicos

	public String getNomeCliente() {
		return nomeCliente;

	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;

	}

	public String getRuaCliente() {
		return ruaCliente;

	}

	public void setRuaCliente(String ruaCliente) {

		this.ruaCliente = ruaCliente;

	}

	public int getNumeroCliente() {
		return numeroCliente;

	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;

	}

	public int getTelefoneCliente() {
		return telefoneCliente;

	}

	public void setTelefoneCliente(int telefoneCliente) {

		this.telefoneCliente = telefoneCliente;

	}

	public String getNomedonoCliente() {
		return nomedonoCliente;

	}

	public void setNomedonoCliente(String nomedonoCliente) {

		this.nomedonoCliente = nomedonoCliente;

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}