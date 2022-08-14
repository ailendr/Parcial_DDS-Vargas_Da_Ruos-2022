package seguridad;

public class Vendedor extends  Usuario{
    private String legajo;

    @Override
    public void validarDatos(){
      if(! legajo.contains("b")){
       throw new RuntimeException("Su legajo es incorrecto");
      }
    }

    @Override
    public boolean esCliente(){ return false;}
}
