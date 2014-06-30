package emv.jnlp.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * 
 * @author MIKO
 *
 */
public class Window extends JFrame {

	private static final long serialVersionUID = 373230609396784388L;

	private static int WINDOW_HEIGHT = 100;
	private static int WINDOW_WIDTH = 300;

	private JLabel spartaLbl;
	private JButton spartaBtn;

	public Window(String title) {
		setTitle(title);
		initDefaults();
		initComponents();
		centerWindow();
	}

	private void initDefaults() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	private void initComponents() {

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());

		spartaBtn = new JButton("Click Here");
		spartaBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This is SPARTA!");
			}
		});

		spartaLbl = new JLabel("Some Text is going here");

		contentPane.add(spartaLbl);
		contentPane.add(spartaBtn);
	}

	private void centerWindow() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		this.setBounds((int) (screenSize.width / 2 - WINDOW_WIDTH / 2),
				(int) (screenSize.height / 2 - WINDOW_HEIGHT / 2),
				WINDOW_WIDTH, WINDOW_HEIGHT);
	}

}
