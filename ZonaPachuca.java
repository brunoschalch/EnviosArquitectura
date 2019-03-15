class ZonaPachuca extends Zona {
    public ZonaPachuca(final CostosAPI costosAPI) {
        super(costosAPI);
    }

    public float calcularCostoEnvio(Envio envio) {
        return costosAPI.calcularCostoDeEnvio(envio);
    }

    public void setProveedor(CostosAPI proveedor) {
        this.costosAPI = proveedor;
    }
}
