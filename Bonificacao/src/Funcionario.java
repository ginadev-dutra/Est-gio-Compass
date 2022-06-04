public class Funcionario {
	private String nome;
	private Double salarioBruto;
	private Double salarioLiquido;
	private Double desconto;
	private Double bonificacao;
	
	//get and set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Double getSalarioBruto() {
		return salarioBruto;
	}


	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}


	public Double getSalarioLiquido() {
		return salarioLiquido;
	}


	public void setSalarioLiquido(Double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}


	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	public Double getBonificacao() {
		return bonificacao;
	}


	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	
// construtor
	
	public Funcionario(String nome, Double salarioBruto) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}


	
	
	
}
