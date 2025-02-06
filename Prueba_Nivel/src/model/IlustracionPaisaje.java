package model;

public class IlustracionPaisaje extends Ilustracion {
    private String elementos;

    public IlustracionPaisaje(String titulo, String tecnica, String tamaño, String fechaCreacion, String elementos) {
        super(titulo, tecnica, tamaño, fechaCreacion);
        this.elementos = elementos;
    }

    public String getElementos() {
        return elementos;
    }

    @Override
    public String mostrarIlustracionPorTecnica()  {
        return "Esta ilustración de paisaje está realizada con elementos presentes: " + elementos + ".";
    }

    @Override
    public String toString() {
        return "IlustracionPaisaje{" +
                "elementos='" + elementos + '\'' +
                "} " + super.toString();
    }
}
