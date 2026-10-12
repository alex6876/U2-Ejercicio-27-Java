public class AlimentoBasico extends ItemFacturable {

    public AlimentoBasico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        return precioBase * 0.05;
    }
}
