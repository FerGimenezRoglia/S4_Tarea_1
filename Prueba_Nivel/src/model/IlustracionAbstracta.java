package model;

    public class IlustracionAbstracta extends Ilustracion {
        private String coloresPredominantes;
        private String formasUtilizadas;

        public IlustracionAbstracta(String titulo, String tecnica, String tamaño, String fechaCreacion, String coloresPredominantes, String formasUtilizadas) {
            super(titulo, tecnica, tamaño, fechaCreacion);
            this.coloresPredominantes = coloresPredominantes;
            this.formasUtilizadas = formasUtilizadas;
        }

        public String getColoresPredominantes() {
            return coloresPredominantes;
        }

        public String getFormasUtilizadas() {
            return formasUtilizadas;
        }

        @Override
        public String mostrarIlustracionPorTecnica() {
            return "Esta ilustración abstracta está realizada con: " + coloresPredominantes + "y " + formasUtilizadas + ".";
        }

        @Override
        public String toString() {
            return "IlustracionAbstracta{" +
                    "coloresPredominantes='" + coloresPredominantes + '\'' +
                    ", formasUtilizadas='" + formasUtilizadas + '\'' +
                    "} " + super.toString();
        }
    }
