import java.util.ArrayList;

public class Representante {

	// Atributos
	private String loginRepresentante;
	private String senhaRepresentante;

	// ArrayList
	public static ArrayList<Representante> dadosRepresentante = new ArrayList<>();

	// Métodos magicos

	public String getLoginRepresentante() {
		return loginRepresentante;

	}

	public void setLoginRepresentante(String loginRepresentante) {
		this.loginRepresentante = loginRepresentante;

	}

	public String getSenhaRepresentante() {
		return senhaRepresentante;

	}

	public void setSenhaRepresentante(String senhaRepresentante) {

		this.senhaRepresentante = senhaRepresentante;

	}

}