
interface EnvioBuilder {

    Envio build();

    EnvioBuilder setID(final String ID);

    EnvioBuilder setDireccionEntrega(final String direccionEntrega);

    EnvioBuilder setCpEntrega(final int CpEntrega);

    EnvioBuilder setDireccionRemitente(final String direccionRemitente);

    EnvioBuilder setCpRemitente(final int CpRemitente);

    EnvioBuilder setPeso(final float peso);

    EnvioBuilder setTipo(final String tipo);

    EnvioBuilder setDimensiones(final int dimensiones);

    EnvioBuilder addEtiqueta(final String etiqueta);
}
