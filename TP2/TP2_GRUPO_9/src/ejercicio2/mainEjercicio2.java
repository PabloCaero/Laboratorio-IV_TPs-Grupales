package ejercicio2;

public class mainEjercicio2 {
	public static void main(String[] args) {
		ProductoFresco obj1 = new ProductoFresco("02/06/2022", 35, "01/01/2022", "Argentina");
		ProductoCongelado obj2 = new ProductoCongelado("03/09/2022", 22, 3);
		ProductoRefrigerado obj3 = new ProductoRefrigerado("15/11/2022", 17, 4);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	}
}
