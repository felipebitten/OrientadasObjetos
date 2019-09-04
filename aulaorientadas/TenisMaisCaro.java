package aula.orientadas;
public class TenisMaisCaro extends FabricaTenis{
    
     public TenisMaisCaro(String modelo){
        this.modelo = modelo;
        System.out.println("O modelo de tenis mais caro é:" + this.modelo);
        
     }
}