interface EnvioBuilder {

    public Envio build();

    public EnvioBuilder setID(final String ID);

    public EnvioBuilder setDireccionEntrega(final String direccionEntrega);

    public EnvioBuilder setCpEntrega(final int CpEntrega);

    public EnvioBuilder setDireccionRemitente(final String direccionRemitente);

    public EnvioBuilder setCpRemitente(final int CpRemitente);

    public EnvioBuilder setPeso(final float peso);

    public EnvioBuilder setTipo(final String tipo);

    public EnvioBuilder setDimensiones(final int dimensiones);

    public EnvioBuilder addEtiqueta(final String etiqueta);
}
