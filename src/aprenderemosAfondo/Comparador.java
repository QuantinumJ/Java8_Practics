package aprenderemosAfondo;

import java.util.Arrays;

public interface Comparador {
	int compare (Object o1, Object o2);
	
	public static final int INFERIOR=-1;
	public static final int IGUAL = 0;
	public static final int SUPERIOR = 1;
	public static final int ERROR = -99;
	
	public static Object[] clasificacion(Object[] array, Comparador clasificador) {
		int i,j;
		Object c;
		Object[] arrayClasificacion;
		arrayClasificacion = Arrays.copyOf(array, array.length);
		for(i=0; i<arrayClasificacion.length; i++) {
			for(j=i+1;j<arrayClasificacion.length; j++) {
				if(clasificador.compare(arrayClasificacion[j],arrayClasificacion[i] )==Comparador.INFERIOR) {
					c = arrayClasificacion[j];
					arrayClasificacion[j]=arrayClasificacion[i];
					arrayClasificacion[i] = c;
					
				}else if(clasificador.compare(arrayClasificacion[j],arrayClasificacion[i] )==Comparador.ERROR) {
					return null;
				}
			}
		}
		return arrayClasificacion;
	}
}
