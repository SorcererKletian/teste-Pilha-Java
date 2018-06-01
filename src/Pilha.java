import java.util.ArrayList;

public class Pilha {
	
	public int dado;
	public ArrayList<Integer> list = new ArrayList<Integer>();
	
	public Pilha()
	{
		
	}
	
	public void Push(int dado)
	{
		this.list.add(dado);
		System.out.println("Colocado na pilha: " + dado);
	}
	
	public void Pop()
	{
		if (this.Vazia())
		{
			System.out.println("Pilha ja esta vazia.");
		}
		else
		{
			int i = this.list.get(this.list.size()-1);
			this.list.remove(this.list.size()-1);
			System.out.println("Removido: " + i);
		}
		
	}
	
	public boolean Vazia()
	{
		if (this.list.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}