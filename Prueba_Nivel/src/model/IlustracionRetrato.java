package model;

public class IlustracionRetrato extends Ilustracion {

    private String expresionFacial;

    public IlustracionRetrato(String titulo, String tecnica, String tamaño, String fechaCreacion, String expresionFacial) {
        super(titulo, tecnica, tamaño, fechaCreacion);
        this.expresionFacial = expresionFacial;
    }

    public String getExpresionFacial() {
        return expresionFacial;
    }

    @Override
    public String mostrarIlustracionPorTecnica() {
        return "Esta ilustración retrato está realizada con una expresión facial: " + expresionFacial + ".";
    }

    @Override
    public String toString() {
        return "IlustracionRetrato{" +
                "expresionFacial='" + expresionFacial + '\'' +
                "} " + super.toString();
    }
}
