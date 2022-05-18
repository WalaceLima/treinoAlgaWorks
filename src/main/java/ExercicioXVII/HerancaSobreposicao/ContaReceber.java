package ExercicioXVII.HerancaSobreposicao;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public ContaReceber() {
	}

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	@Override
	public void cancelar() {

		super.cancelar();
		if (this.getValor() > 50000) {
			System.out.println("Não permitido cancelamento para contas acima de 50 Mil!");
		} else {
			super.cancelar();
		}
	}

	public void receber() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que já está paga: " 
				+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode receber uma conta que está cancelada: " 
				+ this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
				+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
				+ " do cliente " + this.getCliente().getNome() + ".");
				
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
		public void exibirDetalhes() {
			System.out.println("\nConta a Receber");
			System.out.println("===================================");
			System.out.println("Cliente: " + this.getCliente().getNome());
			System.out.println("Descrição: " + this.getDescricao());
			System.out.println("Valor: " + this.getValor());
			System.out.println("Data de vencimento: " + this.getDataVencimento());
			System.out.println("Situação: " + this.getSituacaoConta());
			System.out.println("===================================");
		}
		
	}

