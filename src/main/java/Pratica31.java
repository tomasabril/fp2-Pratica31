import static java.lang.Character.*;
import java.util.*;
import java.util.Calendar;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * modificado por Tomás Abril
 */
public class Pratica31
{
    public static void main(String[] args)
    {
    String nome = "João da Silva Bogado Júnior";
    String nomeM = nome.toUpperCase();
    String nomea = "";
    String nomep = "";
    int i;
    Date agora = new Date();
    Calendar calendar = new GregorianCalendar(1993, 02, 02);
    long dif;
    //dif = calendar.getTimeInMillis() - agora.getTimeInMillis();
   
    System.out.println(nomeM);
       
    for(i=nome.length()-1; i>=0; i--)
    {
        if(isWhitespace(nome.charAt(i)))
        { 
		nomep = new StringBuilder(nomea).reverse().toString();
		nomep += ", ";
		break;
	}
        else
        {
            nomea = nomea + nome.charAt(i);
        }
    }
    nomep += nome.charAt(0) + ". ";
    for(int j=0; j<i; j++)
    {
	if(isWhitespace(nome.charAt(j)))
	{
		nomep += nome.charAt(j+1) + ". ";	
	}
    }
    String abreviado = nomep.trim();
    
    System.out.println(abreviado);
    }
}