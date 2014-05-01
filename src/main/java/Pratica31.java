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
    String nome = "Tomás Abril";
    String nomeM = nome.toUpperCase();
    String nomea = "";
    Date agora = new Date();
    Calendar calendar = new GregorianCalendar(1993, 02, 02);
    long dif;
    dif = calendar.getTimeInMillis - agora.getTimeInMillis;
   
        System.out.println(nomeM);
    for(int i=0; i<=nome.length(); i++)
    {
        if(isWhitespace(nome.charAt(i)))
        {
            nomea = nomea + ", " + nome.charAt(i+1) + ".";
            break;
        }
        else
        {
            nomea = nomea + nome.charAt(i);
        }
    }
    System.out.println(nomea);
    }
}