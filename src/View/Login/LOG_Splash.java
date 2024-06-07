package src.View.Login;

import java.awt.Color;
import java.net.URL;

import com.thehowtotutorial.splashscreen.JSplash;

public class LOG_Splash {

	public static void main(String[] args) throws InterruptedException {

		URL imgURL = LOG_Splash.class.getResource("/resource/Frame 1 (1).png");
		if (imgURL == null) {
			System.err.println("Gambar tidak ditemukan!");
			System.exit(1);
		}

		JSplash splash = new JSplash(imgURL, true, true, true, "Kelompok BlueScreen", null, Color.white,
				new Color(6, 6, 40));
		splash.splashOn();

		for (int i = 0; i < 100; i++) {
			splash.setProgress(i, "");
			Thread.sleep(50);
		}

		splash.splashOff();
		Login_Jfrm log = new Login_Jfrm();
		log.main(null);
	}
}
