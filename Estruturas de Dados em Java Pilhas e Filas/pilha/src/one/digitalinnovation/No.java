package one.digitalinnovation;

public class No {

	private int dado;
	private No no = null;
	
	public No(int dado) {
		super();
		this.dado = dado;
	}
	
	public No() {}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getNo() {
		return no;
	}

	public void setNo(No no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}
	
}
