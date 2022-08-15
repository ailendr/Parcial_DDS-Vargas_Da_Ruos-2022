package seguridad;

public class Administrador extends Usuario {
    private String codigoDeAdmin;


    @Override
    public void validarDatos(){
        super.validarDatos();
        validarLongitudCodigo(codigoDeAdmin);
        validarPrimeraLetra(codigoDeAdmin);
    }

    public void validarPrimeraLetra(String codigoDeAdmin) {
        if(codigoDeAdmin.charAt(0) != 'f'){
            throw new RuntimeException("Compruebe si codigo es valido");
        }
    }

    public void validarLongitudCodigo(String codigoDeAdmin)  {
        if( codigoDeAdmin.length() != 8){
            throw new RuntimeException("La longitud del codigo debe ser de 8 caracteres");
        }
    }

    @Override
    public boolean esCliente(){ return false;}
}

