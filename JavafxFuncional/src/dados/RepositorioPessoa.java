package dados;

import java.util.ArrayList;
import java.util.Scanner;

import beans.Pessoa;

public class RepositorioPessoa {
	
	private ArrayList<Pessoa> grupo;
	
	
	public RepositorioPessoa() {
		grupo = new ArrayList<Pessoa>();
	}
	
//	public void add() {
//		grupo.add(new Pessoa(ler.next(), ler.nextInt() ));
//	}
	
	
	public void add(Pessoa p) {
		grupo.add(p);
	}
	
	public void remover(Pessoa p) {
		grupo.remove(p);
	}
	
	public String listar() {
		return grupo.toString();
	}
}
