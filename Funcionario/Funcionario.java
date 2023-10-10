package Funcionario;

public class Funcionario {
	private String nome;
	private String matricula;
	private double salario;
	private String telefone;
	private String endereco;
	private String DataDeNascimento;
	
	public Funcionario(String nome, String matricula, double salario, String telefone, String endereco,
			String dataDeNascimento) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
		DataDeNascimento = dataDeNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataDeNascimento() {
		return DataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}
	
	
}


