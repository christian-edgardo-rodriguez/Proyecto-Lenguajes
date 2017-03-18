/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolenguajes;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
/**
 *
 * @author Familia Rodriguez
 */
public class Hilo extends Thread {
    Principal principal;

    public Hilo(Principal principal) {
        this.principal = principal;
    }

    public void run() {
        try {
            Configuration configuration = new Configuration();
            configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
            configuration.setDictionaryPath("./5442.dic");
            configuration.setLanguageModelPath("./5442.lm");
            LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
            recognize.startRecognition(true);
            SpeechResult result;
            while ((result = recognize.getResult()) != null) {
                String command = result.getHypothesis();
                if (command.equalsIgnoreCase("user")) {
                    principal.usuarioTextField();
                    System.out.println("USUARIO");
                } else if (command.equalsIgnoreCase("pass")) {
                    principal.contraTextField();
                    System.out.println("PASSWORD");
                } else if (command.equalsIgnoreCase("mark")||command.equalsIgnoreCase("seven")) {
                    principal.nombreTextField(command);
                    System.out.println("MARK O SEVEN");
                } else if (command.equalsIgnoreCase("first")) {
                    principal.nombreBuscarTextField();
                    System.out.println("BUSCAR NOMBRE");
                } else if (command.equalsIgnoreCase("second")) {
                    principal.apellidoBuscarTextField();
                    System.out.println("BUSCAR APELLIDO");
                } else if (command.equalsIgnoreCase("new")) {
                    principal.enseñarCrear();
                    System.out.println("NUEVO");
                } else if (command.equalsIgnoreCase("log")) {
                    principal.enseñarBitacora();
                    System.out.println("BITACORA");
                } else if (command.equalsIgnoreCase("search")) {
                    principal.enseñarBuscar();
                    System.out.println("BUSCAR");
                } else if (command.equalsIgnoreCase("send")) {
                    principal.enseñarBuzon();
                    System.out.println("BUZON");
                } else if (command.equalsIgnoreCase("name")) {
                    principal.cambiarNombre();
                    System.out.println("CAMBIAR NOMBRE");
                } else if (command.equalsIgnoreCase("phone")) {
                    principal.cambiarNumero();
                    System.out.println("CAMBIAR Telefono");
                } else if (command.equalsIgnoreCase("surname")) {
                    principal.cambiarApellido();
                    System.out.println("CAMBIAR APELLIDO");
                } else if (command.equalsIgnoreCase("email")) {
                    principal.cambiarMail();
                    System.out.println("CAMBIAR EMAIL");
                } else if (command.equalsIgnoreCase("gender")) {
                    principal.cambiarGenero();
                    System.out.println("CAMBIAR GENERO");
                } else if (command.equalsIgnoreCase("erase")) {
                    principal.borrarContacto();
                    System.out.println("BORRAR");
                } else if (command.equalsIgnoreCase("call")) {
                    System.out.println("LLAMAR");
                } else if (command.equalsIgnoreCase("videocall")) {
                    principal.enseñarVideollamada();
                    System.out.println("VIDEOLLAMADA");
                } else if (command.equalsIgnoreCase("out")) {
                    System.out.println("SALIR");
                    System.exit(0);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
