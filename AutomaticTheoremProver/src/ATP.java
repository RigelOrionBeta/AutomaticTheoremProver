import java.awt.EventQueue;

public class ATP {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new GUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}