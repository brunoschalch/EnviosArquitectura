
interface EnvioBuilder {

    Envio build();

    EnvioBuilder setID(final String ID);

    EnvioBuilder setDireccionEntrega(final String direccionEntrega);

    EnvioBuilder setCpEntrega(final int CpEntrega);

    EnvioBuilder setDireccionRemitente(final String direccionRemitente);

    EnvioBuilder setCpRemitente(final int CpRemitente);

    EnvioBuilder setPeso(final float peso);

    EnvioBuilder addEtiqueta(final String etiqueta);
}
