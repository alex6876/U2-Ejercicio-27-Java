public class ProductoImportado extends ItemFacturable{


    public ProductoImportado(String nombre, double precioBase){
        super(nombre, precioBase);
    }

    @Override
     public double calcularImpuesto(){
         return precioBase * 0.21;
     }
}
