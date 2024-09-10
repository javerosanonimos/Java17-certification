package java17._1variables;
/**
 *
 * @author JaverosAnonimos
 */
public class Ambito {
    int num;//Variable de clase
    
    public void metodo(){
        int num;//Variable local, es diferente a a variable de clase.
        num=5;//Se asigna la variable local.
        this.num=1; //Se asgina la varibale de clase,
        // se neceista usar this. para acceder a la variable de clase.
    }
}