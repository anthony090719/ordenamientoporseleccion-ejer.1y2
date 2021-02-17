package ordenamientoPorSeleccion;

public class MetodosDeOrdenamiento {
	
	public void ordenamientoPorSeleccion(int a[]) {
		
		for (int i = 0; i < a.length-1; i++) {
			int minimo = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[minimo]) {
					minimo = j;
				}

			}
			
			int aux = a[i];
			a[i] = a[minimo];
			a[minimo] = aux;
		}
	}
	
	public void imprimir(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " DPI");
			
		}
	}

	

}
