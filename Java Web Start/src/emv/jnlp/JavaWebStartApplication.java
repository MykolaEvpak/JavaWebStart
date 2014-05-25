package emv.jnlp;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import emv.jnlp.ui.Window;

public class JavaWebStartApplication {

	private static void createGUI() {
		Window application = new Window("Java Web Start Test");
		application.setVisible(true);
	}

	public static void main(String[] args) {

		setLookAndFeel();

		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				createGUI();
			}
		});

	}

	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

}
