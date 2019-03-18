package exercicio04;

import java.util.Timer;
import java.util.TimerTask;

public class SimulaBombaDagua {

    Timer timer = new Timer();
    private boolean status;

    public void ligar(int s) {
        System.out.println("Bomba ligada!");
        this.status = true;
        timer.schedule(new RemindTask(s),0, 1000);
        try { Thread.sleep ((s + 1)*1000); } catch (InterruptedException ex) {}
    }

    class RemindTask extends TimerTask {
        private int time;
        private int seconds;
        public RemindTask(int time) {
            this.time = time;
        }
        public void run() {
            if (this.seconds < this.time) {
                System.out.println("Bomba desligando em " + (this.time - this.seconds) + " segundos!");
                this.seconds = this.seconds + 1;
            } else {
                desligar();
                timer.cancel();
            }
        }
    }

    public void desligar() {
        System.out.println("Bomba desligada!");
        this.status = false;
    }

}
