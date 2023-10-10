package Funcionario;

public class Principal {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario ("isa", "2016", 1.500, "15 9999988","rua bobos","23/01/2007");
		System.out.println("Funcionario:");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: "+ funcionario.getMatricula());
		System.out.println("salario: "+ funcionario.getSalario());
		System.out.println("telefone: "+ funcionario.getTelefone());
		System.out.println("endereco: "+ funcionario.getEndereco());
		System.out.println("data de nascimento: "+ funcionario.getDataDeNascimento());

		Administrador administrador = new Administrador("isa", "2016", 1.500, "15 9999988","rua bobos","23/01/2007",89);
		System.out.println("ADM: ");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Matricula: "+ administrador.getMatricula());
		System.out.println("salario: "+ administrador.getSalario());
		System.out.println("telefone: "+ administrador.getTelefone());
		System.out.println("endereco: "+ administrador.getEndereco());
		System.out.println("data de nascimento: "+ administrador.getDataDeNascimento());
		System.out.println("cra: "+ administrador.getCra());

		Engenheiro engenheiro = new Engenheiro("isa", "2016", 1.500, "15 9999988","rua bobos","23/01/2007",198);
		System.out.println("ADM: ");
		System.out.println("Nome: " + engenheiro.getNome());
		System.out.println("Matricula: "+ engenheiro.getMatricula());
		System.out.println("salario: "+ engenheiro.getSalario());
		System.out.println("telefone: "+ engenheiro.getTelefone());
		System.out.println("endereco: "+ engenheiro.getEndereco());
		System.out.println("data de nascimento: "+ engenheiro.getDataDeNascimento());
		System.out.println("numCrea: "+ engenheiro.getNumCrea());
		
		Medico medico = new Medico("isa", "2016", 1.500, "15 9999988","rua bobos","23/01/2007",76);
		System.out.println("ADM: ");
		System.out.println("Nome: " +  medico.getNome());
		System.out.println("Matricula: "+  medico.getMatricula());
		System.out.println("salario: "+  medico.getSalario());
		System.out.println("telefone: "+  medico.getTelefone());
		System.out.println("endereco: "+  medico.getEndereco());
		System.out.println("data de nascimento: "+  medico.getDataDeNascimento());
		System.out.println("crm: "+  medico.getCrm());
	}
}

