
class EnvioBuilderImpl implements EnvioBuilder {

    private Envio envioTmp;

    public EnvioBuilderImpl() {
        envioTmp = new Envio();
    }

    @Override
    public Envio build() {
        Envio envio = new Envio();
        envio.setID(envioTmp.getID());
        envio.setDireccionEntrega(envioTmp.getDireccionEntrega());
        envio.setCpEntrega(envioTmp.getCpEntrega());
        envio.setDireccionRemitente(envioTmp.getDireccionRemitente());
        envio.setCpRemitente(envioTmp.getCpRemitente());
        envio.setPeso(envioTmp.getPeso());
        envio.setTipo(envioTmp.getTipo());
        envio.setDimensiones(envioTmp.getDimensiones());
        envio.setEtiquetas(envioTmp.getEtiquetas());
        return envio;
    }

    @Override
	  public EnvioBuilder addEtiqueta(final String etiqueta) {
	       envioTmp.addEtiqueta(etiqueta);
	       return this;
    }

    @Override
    public EnvioBuilder setID(final String ID) {
        envioTmp.setID(ID);
        return this;
    }

    @Override
    public EnvioBuilder setDireccionEntrega(final String direccionEntrega) {
        envioTmp.setDireccionEntrega(direccionEntrega);
        return this;
    }

    @Override
    public EnvioBuilder setCpEntrega(final int CpEntrega) {
        envioTmp.setCpEntrega(CpEntrega);
        return this;
    }

    @Override
    public EnvioBuilder setDireccionRemitente(final String direccionRemitente) {
        envioTmp.setDireccionRemitente(direccionRemitente);
        return this;
    }

    @Override
    public EnvioBuilder setCpRemitente(final int CpRemitente) {
        envioTmp.setCpRemitente(CpRemitente);
        return this;
    }

    @Override
    public EnvioBuilder setPeso(final float peso) {
        envioTmp.setPeso(peso);
        return this;
    }

    @Override
    public EnvioBuilder setTipo(final String tipo) {
        envioTmp.setTipo(tipo);
        return this;
    }

    @Override
    public EnvioBuilder setDimensiones(final int dimensiones) {
        envioTmp.setDimensiones(dimensiones);
        return this;
    }
}
