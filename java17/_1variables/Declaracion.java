package java17._1variables;
/**
 *
 * @author JaverosAnónimos
 */
public class Declaracion { 
    //Declaración Múltiple
    int a=5,b,c; // Se pueden declarar varias variables en una misma línea e incluso inicializarlas.

    //Caracteres permitidos: Letras, números, "$" y "_" las siguientes variables son correctas.
    String str$;
    String $str;
    String str_;
    String _str;
    String str17;

    //Exepciones: No pueden comenzar por número o usar alguna palabra reservada, incluyendo goto
    String 4str; //Error, comienza con número
    int break; //Error, palabra reservada break
    char hello.i;//Error, caracter . no permido
    int goto;// //Error, palabra reservada goto
}
