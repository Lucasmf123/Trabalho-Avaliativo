import javax.swing.DefaultBoundedRangeModel;
import javax.swing.table.DefaultTableModel;


public class Acao {
	
	//Métodos para cadastro
			public void Cadastrar1(double codigoProduto, String nomeProduto, String descricao, double valorUnitario) {
				
				//Criar objeto
				Produtos pc = new Produtos();
				pc.setCodigoProduto(codigoProduto);
				pc.setNomeProduto(nomeProduto);
				pc.setDescricao(descricao);
				pc.setValorUnitario(valorUnitario);
				
				//Add ao ArrayList
				Produtos.dadosCadastro.add(pc);
				
			}
			
			//Método para retornar os dados do produto cadastrado
			public DefaultTableModel listarProdutoCadastrado() {
				
				//DefaultTableModel
				DefaultTableModel modelo = new DefaultTableModel();
				modelo.addColumn("Código");
				modelo.addColumn("Nome");
				modelo.addColumn("Descrição");
				modelo.addColumn("Valor Unidade");
				
				for(int indice = 0; indice < Produtos.dadosCadastro.size(); indice++) {
					
					modelo.addRow(new Object [] {
							Produtos.dadosCadastro.get(indice).getCodigoProduto(),
							Produtos.dadosCadastro.get(indice).getNomeProduto(),
							Produtos.dadosCadastro.get(indice).getDescricao(),
							"R$ "+Produtos.dadosCadastro.get(indice).getValorUnitario()
					});
					
				}
				
				//Retorno
				return modelo;
				
			}
			
			//Método para excluir produto
			public void excluir1(int linha) {
				
				Produtos.dadosCadastro.remove(linha);
				
			}


	// Método para cadastrar administrador
	public void cadastrarAdministrador(String loginAdministrador, String senhaAdministrador) {

		// Criar objeto
		Administrador a = new Administrador();
		a.setLoginAdministrador(loginAdministrador);
		a.setSenhaAdministrador(senhaAdministrador);

		// Add ao ArrayList
		Administrador.dadosAdministrador.add(a);

	}

	// Métodos para retornar os dados do administrador
	public DefaultTableModel listarAdministrador() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Adm");

		for (int indice = 0; indice < Administrador.dadosAdministrador.size(); indice++) {

			modelo.addRow(new Object[] { Administrador.dadosAdministrador.get(indice).getLoginAdministrador(),
					Administrador.dadosAdministrador.get(indice).getSenhaAdministrador()

			});
		}

		// Retorno
		return modelo;
	}

	// Método para excluir Administrador
	public void excluirAdministrador(int linha) {

		Administrador.dadosAdministrador.remove(linha);

	}

	// Método para cadastrar Representante
	public void cadastrarRepresentante(String loginRepresentante, String senhaRepresentante) {

		// Criar objeto
		Representante a = new Representante();
		a.setLoginRepresentante(loginRepresentante);
		a.setSenhaRepresentante(senhaRepresentante);

		// Add ao ArrayList
		Representante.dadosRepresentante.add(a);

	}

	// Métodos para retornar os dados do Representante
	public DefaultTableModel listarRepresentante() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Rep");

		for (int indice = 0; indice < Representante.dadosRepresentante.size(); indice++) {

			modelo.addRow(new Object[] { Representante.dadosRepresentante.get(indice).getLoginRepresentante(),
					Representante.dadosRepresentante.get(indice).getSenhaRepresentante()

			});
		}

		// Retorno
		return modelo;
	}

	// Método para excluir Representante
	public void excluirRepresentante(int linha) {

		Administrador.dadosAdministrador.remove(linha);

	}

	// Métodos para cadastro
	public void Cadastrar(String nomeCliente, String ruaCliente, int numeroCliente, int telefoneCliente,
			String nomedonoCliente) {

		// Criar objeto
		Clientes pc = new Clientes();
		pc.setNomeCliente(nomeCliente);
		pc.setRuaCliente(ruaCliente);
		pc.setNumeroCliente(numeroCliente);
		pc.setTelefoneCliente(telefoneCliente);
		pc.setNomedonoCliente(nomedonoCliente);

		// Add ao ArrayList
		Clientes.dadosClientes.add(pc);

	}

	// Método para retornar os dados do cliente cadastrado
	public DefaultTableModel listarClienteCadastrado() {

		// DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Empresa");
		modelo.addColumn("Endereço");
		modelo.addColumn("Complemento");
		modelo.addColumn("Telefone");
		modelo.addColumn("Nome");

		for (int indice = 0; indice < Clientes.dadosClientes.size(); indice++) {

			modelo.addRow(new Object[] { Clientes.dadosClientes.get(indice).getNomeCliente(),
					Clientes.dadosClientes.get(indice).getRuaCliente(),
					Clientes.dadosClientes.get(indice).getNumeroCliente(),
					Clientes.dadosClientes.get(indice).getTelefoneCliente(),
					Clientes.dadosClientes.get(indice).getNomedonoCliente() });

		}

		// Retorno
		return modelo;

	}

	// Método para excluir cliente
	public void excluir(int linha) {

		Clientes.dadosClientes.remove(linha);

	}

}
