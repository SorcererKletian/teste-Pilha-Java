/*
 * Implementação simples de um algoritmo de estrutura de pilha em java, sem fazer uso da classe Stack da biblioteca do Java
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilha p = new Pilha();
		
		p.Push(3);
		p.Push(25);
		p.Push(9);
		p.Push(7);
		p.Push(23);
		p.Push(16);
		
		p.Pop();
		p.Pop();
		p.Pop();
		p.Pop();
		p.Pop();
		p.Pop();
		p.Pop();

	}

}