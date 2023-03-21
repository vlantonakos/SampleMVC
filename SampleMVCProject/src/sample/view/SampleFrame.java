package sample.view;

import javax.swing.*;

import sample.controller.SampleAppController;

public class SampleFrame extends JFrame {
	//Reference to the application SamplePanel.
	private SamplePanel basePanel;
	
	//Create a SampleFrame object passing a reference to the AppController for use by the SampleFrame object.
	public SampleFrame(SampleAppController baseController) {
		basePanel = new SamplePanel(baseController);
		setupFrame();
	}
	
	//Sets the content pane, size and makes the frame visible.
	private void setupFrame() {
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
