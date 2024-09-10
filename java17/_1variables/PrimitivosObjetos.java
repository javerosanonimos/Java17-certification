package java17._1variables;

public class PrimitivosObjetos {
    public void metodo(){
        int a=1; //En un dato primitivo se guarda el VALOR (en este caso 1)
        int b=a;// Cuando se asigna otra variable se crea una copia del VALOR,
                //No hace refrencia a la variable asignada. (1 nuevamente)

        Object o= new Object();// Se crea un objeto y se asigna la referencia a este objeto
        Object o2= o;// En este caso, no se crea una objeto nuevo,
                // se asigna la misma referencia del objeto "o"



    }
}
