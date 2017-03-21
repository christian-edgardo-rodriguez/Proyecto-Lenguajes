/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolenguajes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author Christian
 */
public class HiloHora extends TimerTask{
    private JLabel label;
    private Timer timer = new Timer();
    private int contador = -1;
    private int segundos = 0;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

    public HiloHora(JLabel label) {
        this.label = label;
    }

    public void run() {
        segundos++;
        contador++;
        if (segundos > contador) {
            this.label.setText(dtf.format(LocalDateTime.now()));
        }
    }
    public void contadorReloj(JLabel label) {
        timer = new Timer();
        timer.schedule(new HiloHora(label), 0, 1000);
        this.label = label;
    }
}
