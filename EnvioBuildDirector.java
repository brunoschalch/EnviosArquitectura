import java.util.Iterator;

public class EnvioBuildDirector {
    private EnvioBuilder builder;

    public EnvioBuildDirector(final EnvioBuilder builder) {
        this.builder = builder;
    }

    public Envio construct() {
        return builder.setID("ASD123")
                      .setDireccionEntrega("Oregon 714")
                      .setCpEntrega(03100)
                      .setDireccionRemitente("Uvas 412")
                      .setCpRemitente(03000)
                      .setPeso(45.2f)
                      .addEtiqueta("Etiqueta1")
                      .addEtiqueta("Etiqueta2")
                      .setTipo("caja")
                      .setDimensiones(200)
                      .build();
    }

    public static void main(final String[] arguments) {
        final EnvioBuilder builder = new EnvioBuilderImpl();
        final EnvioBuildDirector carBuildDirector = new EnvioBuildDirector(builder);
        Envio envio = carBuildDirector.construct();
        //System.out.println(envio);
        Iterator<String> iterator = envio.etiquetasIterator();

   		  while (iterator.hasNext()) {
            String etiqueta = iterator.next();
            System.out.println(etiqueta);
            iterator.remove();
        }

        Zona pachuca = new ZonaPachuca(new PastesGoAPI());
        System.out.println(pachuca.calcularCostoEnvio(envio));
    }
}
