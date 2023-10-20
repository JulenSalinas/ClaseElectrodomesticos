
public class Electrodomesticos {
	
	//Atributos
	
	double precioSinIVA;
	String consumoEnergetico;
	int peso;
	String color;

	
//Métodos
	
	void mostrarInformacion() {
		System.out.println("El precio sin IVA es " + precioSinIVA);
		System.out.println("El consumo energético es " + consumoEnergetico);
		System.out.println("El peso del electrodoméstico es " + peso);
		System.out.println("El color del electrodoméstico es " + color);
	}
	
	double obtenerPrecio() {
		return precioSinIVA;
	}
	
	int obtenerPeso(){
		return peso;
	}
	String obtenerColor() {
		return color;
	}
	String obtenerConsumo() {
		if(consumoEnergetico.startsWith("A") || consumoEnergetico.startsWith("B") || consumoEnergetico.startsWith("C") || consumoEnergetico.startsWith("D")|| consumoEnergetico.startsWith("E") || consumoEnergetico.startsWith("F"))
			return consumoEnergetico;
		else
			return "No tenemos estas letras para indicar el consumo energético";
	    } 
	boolean esEficiente(boolean eficiencia){
		 if(consumoEnergetico.startsWith("A") || consumoEnergetico.startsWith("B")) {
			 eficiencia = true; 
		 return eficiencia;
		 }
		 else
			 eficiencia = false;
		     return eficiencia;
	 }
	double obtenerPrecioFinal() {
	precioSinIVA = precioSinIVA * 1.21;
		return precioSinIVA;
		
	
	}
	String cambiarColor(String nuevoColor){
		color = nuevoColor;
		return color;
	}
	void hacerOferta(double rebaja) { // el valor de la rebaja debe de ser mayor a 0 y menor a 1
		
		if(rebaja < 1) {
			
		precioSinIVA = precioSinIVA - (precioSinIVA * rebaja);
		}
		else
			System.out.println("La rebaja debe de ser un porcentaje, esto es, intorduce un valor mayor a 0 y menor a 1");

	}
	
//Método constructor
	
	Electrodomesticos(double pr,String cons,int p,String c){
		precioSinIVA = pr;
		consumoEnergetico = cons;
		peso = p;
		color = c;
		
	}
	
	Electrodomesticos(double pr,int pes){
		
		precioSinIVA = pr;
		consumoEnergetico = "A";
		peso = pes;	
		color = "blanco";
	}
	
	Electrodomesticos(){
		precioSinIVA = 400;
		consumoEnergetico = "A";
		peso = 30;	
		color = "blanco";
	}
		
	
	public static void main(String[] args) {
		
		Electrodomesticos frigo1,lavadora1;
		frigo1 = new Electrodomesticos(660,50);
		lavadora1 = new Electrodomesticos();
		
		System.out.println("El precio actual de frigo1 sin IVA es " + frigo1.obtenerPrecio());
		
		System.out.println("El precio actual de frigo1 con IVA es " + frigo1.obtenerPrecioFinal());
		
		System.out.println(frigo1.esEficiente(true) + " , el electrodoméstico es eficiente");
		
		System.out.println("El color ha cambiado a " + frigo1.cambiarColor("Negro"));
		
		frigo1.hacerOferta(0.12);
		
		System.out.println("El precio actual de frigo1 sin IVA es " + frigo1.obtenerPrecio());
		
		System.out.println("El precio actual de frigo1 con IVA es " + frigo1.obtenerPrecioFinal());
				
		System.out.println("\n");
		
		lavadora1.mostrarInformacion();
		
		System.out.println("El precio final de lavadora1 con IVA es " + lavadora1.obtenerPrecioFinal());
		
	
       
		int diferenciaPeso = frigo1.obtenerPeso() - lavadora1.obtenerPeso();
        System.out.println("Diferencia de peso entre Lavadora1 y Frigo1: " + diferenciaPeso);


		lavadora1.hacerOferta(0.5);
		
		System.out.println("\n");
		
		lavadora1.mostrarInformacion();
		
		System.out.println("El precio actual de lavadora1 con IVA es " +lavadora1.obtenerPrecioFinal());
		
				
	}

}
