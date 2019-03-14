/** "Abstraction" */
abstract class Zona {
    protected CostosAPI costosAPI;

    protected Zona(final CostosAPI costosAPI){
        this.costosAPI = costosAPI;
    }

    public abstract float calcularCostoEnvio(Envio envio);                                 // low-level
}