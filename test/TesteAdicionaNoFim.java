import com.ed.entidade.Aluno;
import com.ed.estruturas.Vetor;


public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
	    Aluno a2 = new Aluno();

	    a1.setNome("Jo�o");
	    a2.setNome("Jos�");

	    Vetor lista = new Vetor();

	    lista.adiciona(a1);
	    lista.adiciona(a2);

	    System.out.println(lista);

	}

}
