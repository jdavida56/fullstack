

import java.io.*;


public class vocalxcaracter {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String auxfrase;
		int cntrol;
		int i;
		int j;
		String letra;
		double longitud{txto};
		double longitud{vcales};
		String txto;
		String vcales;
		// Definir variables
		vcales = "aeiou";
		// Ingresar texto y pasarla a min�scula
		System.out.print("Ingrese secuencia de caracteres: ");
		txto = bufEntrada.readLine();
		txto = txto.toLowerCase();
		// identificar vocales y sustituir
		for (i=1;i<=txto.length();i++) {
			cntrol = 0;
			letra = txto.substring(i,i+1);
			for (j=1;j<=vcales.length();j++) {
				if (letra.equals(vcales.substring(j,j+1))) {
					cntrol = 1;
					switch (vcales.substring(j,j+1)) {
					case "a":
						auxfrase = auxfrase.concat("@");
						break;
					case "e":
						auxfrase = auxfrase.concat("#");
						break;
					case "i":
						auxfrase = auxfrase.concat("$");
						break;
					case "o":
						auxfrase = auxfrase.concat("%");
						break;
					case "u":
						auxfrase = auxfrase.concat("*");
						break;
					}
				}
			}
			if (cntrol==0) {
				auxfrase = auxfrase.concat(letra);
			}
		}
		// Imprimir resultado
		System.out.println("palabra o frase codificada: "+auxfrase);
	}


}

