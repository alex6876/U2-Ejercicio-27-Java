public class ServicioProfesional extends ItemFacturable{

    public ServicioProfesional(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        return precioBase * 0.10;
    }
}
