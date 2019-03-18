class BombaEnviosAPI implements CostosAPI {
    private final int DOCUMENTOS = 42;
    private final int CAJA = 20;

    @Override
    public float calcularCostoDeEnvio(final Envio envio) {
        float peso = envio.getPeso();
        String tipo = envio.getTipo();

        float costo = 0;

        switch(tipo){
            case "documentos":
                costo = peso * DOCUMENTOS;
                break;
            case "caja":
                costo = peso * CAJA;
                break;
        }

        return costo;
    }
}
