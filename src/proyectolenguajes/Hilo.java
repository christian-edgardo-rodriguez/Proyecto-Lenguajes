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
                    }   
                } else if (command.equalsIgnoreCase("change")) {
                    if (principal.isVisible()) {
                        principal.contraTextField();
                    }  
                } else if (command.equalsIgnoreCase("five")||command.equalsIgnoreCase("seven")) {
                    if (principal.isVisible()) {
                        principal.nombreTextField(command);
                    }                   
                } else if (command.equalsIgnoreCase("ashley")||command.equalsIgnoreCase("billy")
                        ||command.equalsIgnoreCase("hart")||command.equalsIgnoreCase("jason")
                        ||command.equalsIgnoreCase("kimberly")||command.equalsIgnoreCase("mark")
                        ||command.equalsIgnoreCase("oliver")||command.equalsIgnoreCase("park")
                        ||command.equalsIgnoreCase("scott")||command.equalsIgnoreCase("taylor")
                        ||command.equalsIgnoreCase("tommy")||command.equalsIgnoreCase("lee")
                        ||command.equalsIgnoreCase("john")||command.equalsIgnoreCase("johnson")) {
                    if (principal.buscarVisibleONo() == true) {
                        principal.buscarTextField(command.toLowerCase());
                    }                  
                } else if (command.equalsIgnoreCase("first")) {
                    if (principal.buscarVisibleONo() == true) {
                        principal.nombreBuscarTextField();
                    }                  
                } else if (command.equalsIgnoreCase("search")) {
                    if (principal.buscarVisibleONo() == true) {
                        principal.apellidoBuscarTextField();
                    }                  
                } else if (command.equalsIgnoreCase("new")) {
                    if (principal.principalVisibleONo() == true) {
                        principal.enseñarCrear();
                    }                   
                } else if (command.equalsIgnoreCase("table")) {
                    if (principal.principalVisibleONo() == true) {
                        principal.enseñarBitacora();
                    }                   
                } else if (command.equalsIgnoreCase("send")) {
                    if (principal.mensajeVisibleONo() == true) {
                        principal.mandarMensaje();
                        principal.cerrarMensaje();
                    }                
                } else if (command.equalsIgnoreCase("name")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarNombre();
                    }                   
                } else if (command.equalsIgnoreCase("phone")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarNumero();
                    }   
                } else if (command.equalsIgnoreCase("surname")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarApellido();
                    }                 
                } else if (command.equalsIgnoreCase("email")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarMail();
                    }     
                } else if (command.equalsIgnoreCase("gender")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarGenero();
                    }                  
                } else if (command.equalsIgnoreCase("photo")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.cambiarFoto();
                    }   
                } else if (command.equalsIgnoreCase("erase")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.borrarContacto();
                    }                 
                } else if (command.equalsIgnoreCase("call")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.seguroLlamada();
                    }  
                } else if (command.equalsIgnoreCase("videocall")) {
                    if (principal.opcionesVisibleONo() == true) {
                        principal.seguroVideoLlamada();
                    } 
                } else if (command.equalsIgnoreCase("hang")) {
                    if (principal.videoLlamadaVisibleONo() == true) {
                        principal.cerrarVideollamada();
                    }else if (principal.llamadaVisibleONo() == true) {
                        principal.cerrarLlamada();
                    }
                } else if (command.equalsIgnoreCase("out")) {
                    System.exit(0);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
}
