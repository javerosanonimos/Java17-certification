package java17._2Objetos;

public class Referencia {

    public void metodo(){
        Objeto obj1= new Objeto();//Supongamos que la referencia es obj123
        Objeto obj2= new Objeto();//Supongamos que la referencia es obj234

        obj1=obj2;//En este momento la referencia de obj2 (obj234) se asigna a obj1
        //lo que provoca que la instancia obj123 quede sin referencia
        // (anteriormente era referenciado por obj1) entonces se hace candidato
        // a ser recolectado por el Garbage Collector.

        obj2=null;//En este caso, aunque podría parecer que la instancia obj234
        // es candidato a ser recolectado por el Garbage collector no es así
        // porque aún obj1 tiene una referencia a el (obj234)
    }
}
