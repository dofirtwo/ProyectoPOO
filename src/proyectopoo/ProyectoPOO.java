package proyectopoo;

/**
 *
 * @author SENA
 */
public class ProyectoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro miCarro = new Carro();
        miCarro.setPlaca("xxx111");
        
        System.out.println("placa: "+miCarro.getPlaca());
        Carro otroCarro =new Carro("YYY2S","Toyota","Rojo",1999);
        System.out.println("placa: "+otroCarro.getPlaca());
        
    }
    
}
