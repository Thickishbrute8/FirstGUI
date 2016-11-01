package graphic.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import graphic.controller.FirstGUIController;
import java.awt.Color;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel {

	private FirstGUIController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;

	public FirstPanel(FirstGUIController baseController) {
		super();
		this.baseController = baseController;

		colorButton = new JButton("coloUr");
		randomButton = new JButton("im so random");
		baseLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel() {
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(colorButton);
		this.add(randomButton);
	}

	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, 0,
				SpringLayout.EAST, randomButton);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 0,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, -140,
				SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 190,
				SpringLayout.NORTH, this);
	}

	private void changeBackground() {
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}

	private void setupListeners() {
		colorButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				setBackground(Color.BLACK);
			}
		});

		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackground();
			}
		});
	}
}
