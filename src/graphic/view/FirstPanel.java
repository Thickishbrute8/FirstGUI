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

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 0, SpringLayout.NORTH, randomButton);
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, -203, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, 0, SpringLayout.SOUTH, randomButton);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 170, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, -101, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, -83, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 81, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, -249, SpringLayout.EAST, this);
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
