/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolenguajes;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author Familia Rodriguez
 */
public class HiloTimer extends TimerTask{
    private JLabel label;
    private Timer timer = new Timer();
    private int seconds = -5;
    private int minutes = 0;

    public HiloTimer(JLabel label) {
        this.label = label;
    }

    public void run() {
        seconds++;
        if (seconds < 0) {
            this.label.setText("Marcando...");
        } else if (seconds < 10) {
            this.label.setText("0"+ minutes + ":0" + seconds);
        } else if (seconds < 60) {
            this.label.setText("0"+ minutes + ":" + seconds);
        } else if (seconds == 60) {
            minutes++;
            seconds = 0;
            this.label.setText("0"+ minutes + ":0" + seconds);
        } 
        
    }
    public void contadorRelojLlamada(JLabel label) {
        timer = new Timer();
        timer.schedule(new HiloTimer(label), 0, 1000);
        this.label = label;
    }
}
