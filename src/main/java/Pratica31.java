/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * autor Tomás Abril
 */

import static java.lang.Character.*;
import java.util.*;

public class Pratica31 {

    public static void main(String[] args) {
	Date agora = new Date();
	String nome = "Tomás João da Silva Bugado Júnior Abril";
	String nomeM = nome.toUpperCase();
	String nomea = "";
	String nomep = "";
	int i;
	
	// nome -------------
	System.out.println(nomeM);

	for (i = nome.length() - 1; i >= 0; i--) {
	    if (isWhitespace(nome.charAt(i))) {
		nomep = new StringBuilder(nomea).reverse().toString();
		nomep += ", ";
		break;
	    } else {
		nomea = nomea + nome.charAt(i);
	    }
	}
	nomep += nome.charAt(0) + ". ";
	for (int j = 0; j < i; j++) {
	    if (isWhitespace(nome.charAt(j))) {
		nomep += nome.charAt(j + 1) + ". ";
	    }
	}
	String abreviado = nomep.trim();
	System.out.println(abreviado);

    // data -------------
    GregorianCalendar nascimento = new GregorianCalendar(1993, 1, 2);
    long dias = ( agora.getTime() - nascimento.getTimeInMillis() )/(1000*60*60*24) ;
    System.out.println(dias + " dias desde o nascimento");
    
    Date fim = new Date();
    System.out.println( "tempo de processamento: " + (fim.getTime() - agora.getTime()) + "ms" );
    }
}
