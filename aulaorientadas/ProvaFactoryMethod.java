package aula.orientadas;
public class ProvaFactoryMethod {

    public static void main(String[] args) {
        
      FactoryFabrica factory = new FactoryFabrica();
      String modelo = "YEEZY BOOST";
      String marca = "ADIDAS";
      factory.getFabricaTenis(marca, modelo);
      
      
      FactoryFabrica factory1 = new FactoryFabrica();
      String modelo1 = "WAVE PROPHECY 7";
      String marca1 = "MIZUNO";
      factory1.getFabricaTenis(marca1, modelo1);
    }
    }
    

