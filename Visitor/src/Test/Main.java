package Test;

import Visitor.ArvoreBinaria;
import Visitor.ExibirInOrderVisitor;
import Visitor.ExibirIndentadoVisitor;
import Visitor.ExibirPostOrderVisitor;
import Visitor.ExibirPreOrdemVisitor;

public class Main {

	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria(7);

		arvore.inserir(15);
		arvore.inserir(10);
		arvore.inserir(5);
		arvore.inserir(2);
		arvore.inserir(1);
		arvore.inserir(20);

		System.out.println("### Exibindo em ordem ###");
		arvore.aceitarVisitante(new ExibirInOrderVisitor());
		System.out.println("### Exibindo pre ordem ###");
		arvore.aceitarVisitante(new ExibirPreOrdemVisitor());
		System.out.println("### Exibindo pós ordem ###");
		arvore.aceitarVisitante(new ExibirPostOrderVisitor());
		System.out.println("### Exibindo identado ###");
		arvore.aceitarVisitante(new ExibirIndentadoVisitor());
	}
	
}
