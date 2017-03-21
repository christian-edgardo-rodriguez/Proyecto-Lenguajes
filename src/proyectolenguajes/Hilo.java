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
            configuration.setDictionaryPath("./5213.dic");
            configuration.setLanguageModelPath("./5213.lm");
            LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
            recognize.startRecognition(true);
            SpeechResult result;
            while ((result = recognize.getResult()) != null) {
                String command = result.getHypothesis();
                if (command.equalsIgnoreCase("user")) {
                    if (principal.isVisible()) {
                        principal.usuarioTextField();
                        System.out.println("USUARIO");
                    }   
                } else if (command.equalsIgnoreCase("change")) {
                    if (principal.isVisible()) {
                        principal.contraTextField();
                        System.out.println("PASSWORD");
                    }  
                } else if (command.equalsIgnoreCase("five")||command.equalsIgnoreCase("seven")) {
                    if (principal.isVisible()) {
                        principal.nombreTextField(command);
                        System.out.println("FIVE O SEVEN");
                    }                   
                } else if (command.equalsIgnoreCase("ashley")||command.equalsIgnoreCase("billy")
                        ||command.equalsIgnoreCase("hart")||command.equalsIgnoreCase("jason")
                        ||command.equalsIgnoreCase("kimberly")||command.equalsIgnoreCase("mark")
                        ||command.equalsIgnoreCase("oliver")||command.equalsIgnoreCase("park")
                        ||command.equalsIgnoreCase("scott")||command.equalsIgnoreCase("taylor")
                        ||command.equalsIgnoreCase("tommy")) {
                    if (principal.buscarVisibleONo() == true) {
                        principal.buscarTextField(command.toLowerCase());
                        System.out.println("PONER NOMBRE O APELLIDO BUSCAR");
                    }                  
                } else if (command.equalsIgnoreCase("first")) {
                    if (principal.buscarVisibleONo() == true) {
                        principal.nombreBuscarTextField();
                        System.out.println("BUSCAR NOMBRE");
                    }                  
                } else if (command.equalsIgnoreCase("search")) {
                    if (principal.buscarVisibleONo() == true) {
                        principal.apellidoBuscarTextField();
                        System.out.println("BUSCAR APELLIDO");
                    }                  
                } else if (command.equalsIgnoreCase("new")) {
                    if (principal.principalVisibleONo() == true) {
                        principal.enseñarCrear();
                        System.out.println("NUEVO");
                    }                   
                } else if (command.equalsIgnoreCase("table")) {
                    if (principal.principalVisibleONo() == true) {
                        principal.enseñarBitacora();
                        System.out.println("BITACORA");
                    }                   
                } else if (command.equalsIgnoreCase("send")) {
                    if (principal.mensajeVisibleONo() == true) {
                        principal.mandarMensaje();
                        principal.cerrarMensaje();
                        System.out.println("MANDAR");
                    }                
                } else if (command.equalsIgnoreCase("name")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarNombre();
                        System.out.println("CAMBIAR NOMBRE");
                    }                   
                } else if (command.equalsIgnoreCase("phone")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarNumero();
                        System.out.println("CAMBIAR TELEFONO");
                    }   
                } else if (command.equalsIgnoreCase("surname")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarApellido();
                        System.out.println("CAMBIAR APELLIDO");
                    }                 
                } else if (command.equalsIgnoreCase("email")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarMail();
                        System.out.println("CAMBIAR EMAIL");
                    }     
                } else if (command.equalsIgnoreCase("gender")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarGenero();
                        System.out.println("CAMBIAR GENERO");
                    }                  
                } else if (command.equalsIgnoreCase("photo")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarFoto();
                        System.out.println("CAMBIAR FOTO");
                    }   
                } else if (command.equalsIgnoreCase("erase")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.borrarContacto();
                        System.out.println("BORRAR");
                    }                 
                } else if (command.equalsIgnoreCase("call")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.seguroLlamada();
                        System.out.println("LLAMAR");
                    }  
                } else if (command.equalsIgnoreCase("videocall")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.seguroVideoLlamada();
                        System.out.println("VIDEOLLAMADA");
                    } 
                } else if (command.equalsIgnoreCase("hang")) {
                    if (principal.videoLlamadaVisibleONo() == true) {
                        principal.cerrarVideollamada();
                        System.out.println("COLGAR VIDEOLLAMADA");
                    }else if (principal.llamadaVisibleONo() == true) {
                        principal.cerrarLlamada();
                        System.out.println("COLGAR LLAMADA");
                    }
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
