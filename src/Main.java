import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.border.LineBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	private JScrollBar scroll1;
	private JPanel res;
	private JScrollBar scroll2;
	private JScrollBar scroll3;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scroll1 = new JScrollBar();
		scroll1.setVisibleAmount(0);
		scroll1.setBackground(Color.RED);
		scroll1.setBlockIncrement(0);
		scroll1.setMaximum(255);
		scroll1.setOrientation(JScrollBar.HORIZONTAL);
		scroll1.setBounds(10, 11, 473, 25);
		contentPane.add(scroll1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(493, 11, 81, 25);
		contentPane.add(panel);
		
		scroll2 = new JScrollBar();
		scroll2.setVisibleAmount(0);
		scroll2.setOrientation(JScrollBar.HORIZONTAL);
		scroll2.setMaximum(255);
		scroll2.setBlockIncrement(0);
		scroll2.setBackground(Color.GREEN);
		scroll2.setBounds(10, 47, 473, 25);
		contentPane.add(scroll2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(493, 47, 81, 25);
		contentPane.add(panel_1);
		
		scroll3 = new JScrollBar();
		scroll3.setVisibleAmount(0);
		scroll3.setOrientation(JScrollBar.HORIZONTAL);
		scroll3.setMaximum(255);
		scroll3.setBlockIncrement(0);
		scroll3.setBackground(Color.BLUE);
		scroll3.setBounds(10, 83, 473, 25);
		contentPane.add(scroll3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLUE);
		panel_1_1.setBounds(493, 83, 81, 25);
		contentPane.add(panel_1_1);
		
		res = new JPanel();
		res.setBorder(new LineBorder(new Color(0, 0, 0)));
		res.setBounds(10, 119, 564, 101);
		contentPane.add(res);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		res.add(lblNewLabel);
		
		AdjustmentListener e = (event) -> {
			int rouge = scroll1.getValue();
			int vert = scroll2.getValue();
			int bleu = scroll3.getValue();
			
			res.setBackground(new Color(rouge, vert, bleu));
			lblNewLabel.setText(String.format("(%d;%d;%d)", rouge,vert,bleu));
		};
		scroll1.addAdjustmentListener(e);
		scroll2.addAdjustmentListener(e);
		scroll3.addAdjustmentListener(e);
		res.setBackground(new Color(0, 0, 0));
		lblNewLabel.setText(String.format("(%d;%d;%d)", 0,0,0));
	}
}
