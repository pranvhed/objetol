package pack;

public class cadeira {

	public static void main(String[] args) {
		
		assento cadeira = new assento ();
		
		cadeira.setModelo("executivo");
		cadeira.setMaterial("couro");
		cadeira.setCor("preto");
		cadeira.settipo("com rodas");
		
		System.out.println("-----cliente-----");
		System.out.println(cadeira.getModelo());
		System.out.println(cadeira.getMaterial());
		System.out.println(cadeira.getCor());
		System.out.println(cadeira.gettipo());

	}

}
