package em.java_.callback_gr;

import java.util.Timer;
import java.util.TimerTask;

public class CustomTime {
	private Timer timer;
	private int timerInSec;
	
	public CustomTime() {
		this.timer=new Timer();
		this.timerInSec = 5;
	}
	
	public void start(TimerListener listener) {
		listener.onStart();
		
		timer.schedule(new TimerTask() {	
			@Override
			public void run() {
				
				System.out.println( timerInSec + " s");
				listener.onRun(); 		// onRun
				
				if (timerInSec == 0) {
					System.out.println("stop !!");
					listener.onFinish(); 		// onFinish
					cancel();
				}
				timerInSec--;
				
			}
		}, 1000, 1000);
	}
	

}
