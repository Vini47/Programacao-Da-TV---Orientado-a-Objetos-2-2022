package primeiroTeste;

public class Testes {
	static Usuario u0;
	static Canal c0;
	static Usuario u1;
	static Canal c1;
	
	
	public static void main(String[] args) {
		
		u0 = new Usuario("Blue pen");
		c0 = new Canal(1, "Globe");
		
		u1 = new Usuario("Pele");
		c1 = new Canal(10, "RECORD");
		
		System.out.println(u0.toString());
		System.out.println(c0.toString());
		System.out.println(u1.toString());
		System.out.println(c1.toString());
	}

}
