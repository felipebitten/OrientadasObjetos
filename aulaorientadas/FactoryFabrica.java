package aula.orientadas;
public class FactoryFabrica {
    
     public FabricaTenis getFabricaTenis(String marca, String modelo){
        if (marca.equals("ADIDAS"))
            return new TenisEnconta(modelo);
        if (marca.equals("MIZUNO"))
            return new TenisMaisCaro(modelo);
        
         return null;
    }
}
