package model;

public abstract class Ilustracion {
        private String titulo;
        private String tecnica;
        private String tamaño;
        private String fechaCreacion;

    public Ilustracion(String titulo, String tecnica, String tamaño, String fechaCreacion) {
        this.titulo = titulo;
        this.tecnica = tecnica;
        this.tamaño = tamaño;
        this.fechaCreacion = fechaCreacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public abstract String mostrarIlustracionPorTecnica();

}
