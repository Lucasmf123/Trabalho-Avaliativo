import java.util.ArrayList;

public class Administrador {

	// Atributos
	private String loginAdministrador;
	private String senhaAdministrador;

	// ArrayList
	public static ArrayList<Administrador> dadosAdministrador = new ArrayList<>();

	// M�todos magicos

	public String getLoginAdministrador() {
		return loginAdministrador;

	}

	public void setLoginAdministrador(String loginAdministrador) {
		this.loginAdministrador = loginAdministrador;

	}

	public String getSenhaAdministrador() {
		return senhaAdministrador;

	}

	public void setSenhaAdministrador(String senhaAdministrador) {

		this.senhaAdministrador = senhaAdministrador;

	}

}
