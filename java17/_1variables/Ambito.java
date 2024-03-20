package java17._1variables;
/**
 *
 * @author JaverosAnonimos
 */
public class Ambito {
    int num;//Variable de clase
    
    public void metodo(){
    int num;//Variable local 
    num=5;//Se asigna la variable local.
    this.num=1; //Se asgina la varibale de clase.
    }
}