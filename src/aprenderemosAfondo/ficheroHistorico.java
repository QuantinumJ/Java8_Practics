package aprenderemosAfondo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

public class ficheroHistorico {

	public static void main(String[] args) {
		try {
			leerFichero("informe.txt");
		}catch(NoFuncionaException e) {
			FileWriter log;
			BufferedWriter br;
			try {
				log = new FileWriter("historico.txt",true);
				br = new BufferedWriter(log);
				br.write("------>"+new GregorianCalendar().getTime()+"<--------\r\n");
				br.write("error:"+ e.getMessage()+"\r\n");
				for(int i=0; i<e.getStackTrace().length;i++) {
					br.write("el fichero "+e.getStackTrace()[i].getFileName());
					br.write("a la linea "+ e.getStackTrace()[i].getLineNumber());
					br.write("en el metodo "+ e.getStackTrace()[i].getMethodName());
					br.write("de la clase "+ e.getStackTrace()[i].getClassName()+ "\r\n");
					
				}
				br.close();
				log.close();
			}catch (IOException ex) {
				System.out.println("error en la aplicacion");
			}
		}

	}
	
	@SuppressWarnings("resource")
	public static void leerFichero(String nombre) throws NoFuncionaException{
		FileInputStream fichero = null;
		BufferedReader br = null;
		String linea = null;
		try {
			fichero = new FileInputStream(nombre);
			br = new BufferedReader(new InputStreamReader(fichero));
			linea = br.readLine();
			while(linea !=null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		}catch (FileNotFoundException e) {
			throw new NoFuncionaException("el fichero no existe",e);
		}catch (IOException e) {
			throw new NoFuncionaException("erro de lectura del fichero", e);
		}
	}

}
