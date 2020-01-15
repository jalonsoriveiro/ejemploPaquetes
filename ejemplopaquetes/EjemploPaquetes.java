package ejemplopaquetes;

import triangulo.AreaTriangulo;
import triangulo.PerimetroTriangulo;
import rectangulo.*;
import circulo.*; //importar todas las clases del paquete

/**
 *
 * @author jalonsoriveiro
 */
public class EjemploPaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            AreaTriangulo  tri = new AreaTriangulo();
            tri.areaTriangulo(6f, 2f);
            PerimetroTriangulo per = new PerimetroTriangulo();
            per.periTrianguloIsosceles(6f, 2f);
            
            AreaCirculo cir = new AreaCirculo();
            cir.areaCirculo(8);
            Lonxitude cir2 = new Lonxitude();
            cir2.lonxitude(8);
            
            MeusMetodos aux = new MeusMetodos();
            float base = aux.validaFloatPositivo();
            float altura = aux.validaFloatPositivo();
            Area rec = new Area();
            rec.areaRectangulo(base, altura);
            //Utilizando Metodos de clase static
            float b = MeusMetodos.darValor();
            float alt = MeusMetodos.darValor();
            rec.areaRectangulo(b, alt);
            //Simplificando
           rec.areaRectangulo(MeusMetodos.darValor(), MeusMetodos.darValor());
    }    
    
}
