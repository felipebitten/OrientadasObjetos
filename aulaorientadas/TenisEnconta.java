package aula.orientadas;
public class TenisEnconta extends FabricaTenis{
    public TenisEnconta(String modelo){
        this.modelo = modelo;
        System.out.println("O Tenis do modelo mais em conta é:" + this.modelo);
        
    }
}
