import com.ed.lista.entidade.Aluno;
import com.ed.lista.estruturas.Vetor;


public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
	    Aluno a2 = new Aluno();

	    a1.setNome("João");
	    a2.setNome("José");

	    Vetor<Aluno> lista = new Vetor<>();

	    lista.adiciona(a1);
	    lista.adiciona(a2);

	    System.out.println(lista);

	}

}
