import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ItemFacturable> items = new ArrayList<>();

        items.add(new ProductoImportado("Notebook", 150000));
        items.add(new ServicioProfesional("Consulta", 20000));
        items.add(new AlimentoBasico("Harina", 2000));


        for (int i = 0; i < items.size(); i++) {
            System.out.println("Nombre: " + items.get(i).nombre);
            System.out.println("Precio Base: $" + items.get(i).precioBase);
            System.out.println("Impuesto: $"+ items.get(i).calcularImpuesto());
            System.out.println("Precio Final: $"+ items.get(i).precioFinal());
            System.out.println("-------------------------------");
        }
    }
}