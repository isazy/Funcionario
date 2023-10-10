package Funcionario;

public class Medico extends Funcionario{
	private int crm;

	public Medico(String nome, String matricula, double salario, String telefone, String endereco,
			String dataDeNascimento, int crm) {
		super(nome, matricula, salario, telefone, endereco, dataDeNascimento);
		this.crm = crm;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
}