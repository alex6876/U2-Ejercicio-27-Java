public abstract class ItemFacturable {
    String nombre;
    double precioBase;

    public ItemFacturable(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularImpuesto();

    public double precioFinal(){
        return precioBase + calcularImpuesto();
    }
}
