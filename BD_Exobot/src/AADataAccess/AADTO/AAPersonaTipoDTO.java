package AADataAccess.AADTO;

public class AAPersonaTipoDTO {

    private Integer AAidCatalogo;
    private Integer AAidCatalogoTipo;
    private String AAnombre;
    private String AAdescripcion;
    private String AAestado;
    private String AAfechaCrea;
    private String AAfechaModifica;

    public AAPersonaTipoDTO(){}

    public AAPersonaTipoDTO(Integer AAidCatalogo, Integer AAidCatalogoTipo, String AAnombre, String AAdescripcion, String AAestado,
            String AAfechaCrea, String AAfechaModifica) {
        this.AAidCatalogo = AAidCatalogo;
        this.AAidCatalogoTipo = AAidCatalogoTipo;
        this.AAnombre = AAnombre;
        this.AAdescripcion = AAdescripcion;
        this.AAestado = AAestado;
        this.AAfechaCrea = AAfechaCrea;
        this.AAfechaModifica = AAfechaModifica;
    }



    public Integer getAAidCatalogo() {
        return AAidCatalogo;
    }

    public void setAAidCatalogo(Integer AAidCatalogo) {
        this.AAidCatalogo = AAidCatalogo;
    }

    public Integer getAAidCatalogoTipo() {
        return AAidCatalogoTipo;
    }

    public void setAAidCatalogoTipo(Integer AAidCatalogoTipo) {
        this.AAidCatalogoTipo = AAidCatalogoTipo;
    }

    public String getAAnombre() {
        return AAnombre;
    }

    public void setAAnombre(String AAnombre) {
        this.AAnombre = AAnombre;
    }

    public String getAAdescripcion() {
        return AAdescripcion;
    }

    public void setAAdescripcion(String AAdescripcion) {
        this.AAdescripcion = AAdescripcion;
    }

    public String getAAestado() {
        return AAestado;
    }

    public void setAAestado(String AAestado) {
        this.AAestado = AAestado;
    }

    public String getAAfechaCreacion() {
        return AAfechaCrea;
    }

    public void setAAfechaCreacion(String AAfechaCrea) {
        this.AAfechaCrea = AAfechaCrea;
    }

    public String getAAfechaModifica() {
        return AAfechaModifica;
    }

    public void setAAfechaModifica(String AAfechaModifica) {
        this.AAfechaModifica = AAfechaModifica;
    }

    @Override
    public String toString(){
        return "\n" + getClass().getName()
            + "\n idCatalogo =     "+ getAAidCatalogo()
            + "\n idCatalogoTipo = "+ getAAidCatalogoTipo()
            + "\n nombre =         "+ getAAnombre()
            + "\n descripcion =    "+ getAAdescripcion()
            + "\n estado =         "+ getAAestado()
            + "\n fechaCrea =      "+ getAAfechaCreacion()
            + "\n fechaModifica =  "+ getAAfechaModifica();
    }

}
