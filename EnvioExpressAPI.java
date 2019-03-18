class EnvioExpressAPI implements CostosAPI {
    private final int DOCUMENTOS = 39;
    private final int CAJA = 25;
    private final int EXCESO = 500;
    private final int DIM_PERMITIDAS = 90;

    @Override
    public float calcularCostoDeEnvio(final Envio envio) {
        float peso = envio.getPeso();
        String tipo = envio.getTipo();
        float dimensiones = envio.getDimensiones();

        float costo = 0;

        switch(tipo){
            case "documentos":
                costo = peso * DOCUMENTOS;
                break;
            case "caja":
                costo = peso * CAJA;
                break;
        }

        if (dimensiones > DIM_PERMITIDAS){
            costo = costo + EXCESO * (dimensiones - DIM_PERMITIDAS);
        }

        return costo;
    }
}
