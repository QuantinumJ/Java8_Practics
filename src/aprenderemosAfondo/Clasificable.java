package aprenderemosAfondo;
// Se debera implementar esta interface con las clases
// para las cuales se considera una clasificacion de la instancias

public interface Clasificable {
	
	// este metodo se podra llamar para comparar la instancia actual
	// con la recibida como parametro
	// el metodo devuelve un entero cuyo valor depende de las reglas siguientes 
	// 1 si la instancia actual es superior a recibida
	// como parametro
	// 0 si las dos instancias son iguales
	// -1 si la instancia actual es inferior a la recibida como parametro
	// -99 si la comparacion es imposible
	
int compare (Object o);
default boolean isInferior(Object o) {
	return false;
}
default boolean isSuperior(Object o){
	return false;
}

public static final int INFERIOR=-1;
public static final int IGUAL = 0;
public static final int SUPERIOR = 1;
public static final int ERROR = 99;
}
