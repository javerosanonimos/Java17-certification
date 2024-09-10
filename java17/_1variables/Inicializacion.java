package java17._1variables;

public class Inicializacion {
    int varClase;// Se inicializa por defecto si es variable de clase.
    public void metodo(){
        int varLocal;//Variable local sin inicialización, no se inicia por defecto
        varLocal=varLocal+1;//Error de compilación, la variable no está inicializada.

        this.varClase=this.varClase+4;//No daría error porque por defecto
            //las variables de clase se inicializan, para int en 0
    }
}
