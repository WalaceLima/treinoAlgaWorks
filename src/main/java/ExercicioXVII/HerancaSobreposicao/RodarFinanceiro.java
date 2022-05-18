package ExercicioXVII.HerancaSobreposicao;

public class RodarFinanceiro {

	public static void main(String[] args) {
		
			// instanciando fornecedores
			Fornecedor imobiliaria = new Fornecedor();
			imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
			Fornecedor mercado = new Fornecedor();
			mercado.setNome("Mercado do João");
			
			// instanciando clientes
			Cliente atacadista = new Cliente();
			atacadista.setNome("Triângulo Quadrado Atacadista");
			Cliente telecom = new Cliente();
			telecom.setNome("FoneNet Telecomunicações");
			
			// instanciando contas a pagar
			ContaPagar contaPagar1 = new ContaPagar("Aluguel", 1230.14, "10/05/2012", imobiliaria);
			contaPagar1.setDescricao("Aluguel da matriz");
			contaPagar1.setValor(1230.14);
			contaPagar1.setDataVencimento("10/05/2012");
			contaPagar1.setFornecedor(imobiliaria);
			
			ContaPagar contaPagar2 = new ContaPagar("Compras do mês", 390.14, "19/05/2012",mercado);
			
			// instanciando contas a receber
			ContaReceber contaReceber1 = new ContaReceber();
			contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
			contaReceber1.setValor(89500.14);
			contaReceber1.setDataVencimento("23/05/2012");
			contaReceber1.setCliente(atacadista);
			
			ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 
				53200.14, "13/05/2012");
			
			// pagamento e cancelamento de contas a pagar
			contaPagar1.pagar();
			contaPagar2.cancelar();

			// recebimento e cancelamento de contas a receber
			contaReceber1.receber();
			contaReceber2.cancelar();
		}

	}


