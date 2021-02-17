package ordenamientoPorSeleccion;

public class Metodos {

	public static void main(String[] args) {
		
		MetodosDeOrdenamiento ordena = new MetodosDeOrdenamiento ();
		int [] arreglo = {445453,5845758,8477547,4847757,49585858,49584738,9847,3948};
		ordena.ordenamientoPorSeleccion(arreglo);
		ordena.imprimir(arreglo);
	}

}
