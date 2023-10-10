package Funcionario;

public class Engenheiro extends Funcionario {
	private int numCrea;

	public Engenheiro(String nome, String matricula, double salario, String telefone, String endereco,
			String dataDeNascimento, int numCrea) {
		super(nome, matricula, salario, telefone, endereco, dataDeNascimento);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(int numCrea) {
		this.numCrea = numCrea;
	}
	

}
