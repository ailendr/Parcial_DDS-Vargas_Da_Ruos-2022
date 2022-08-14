package validacionMail;

import validacionMail.entities.Mail;
import validacionMail.entities.Data;

import java.io.IOException;
import java.util.Scanner;

public class pruebaDeApi {
    public static void main(String[] args) throws IOException {
        ServicioApi servicioApi = ServicioApi.instancia();
        System.out.println("Ingrese mail para registrarse");
        Scanner entradaEscaner = new Scanner(System.in);
        String direccionMail = entradaEscaner.nextLine();
        Mail mail = servicioApi.consultarMail(direccionMail);
        System.out.println("la direccion de mail ingresada es:" + mail.getData().getEmail_address());
        System.out.println("spam:" + mail.getData().getSpam());
    }
}
