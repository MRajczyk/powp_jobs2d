package edu.kis.powp.jobs2d.drivers.adapters;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * driver adapter to drawer with default line parameters
 */
public class DriverToDrawerNormalLineAdapter implements Job2dDriver {
	private int startX = 0, startY = 0;
	private DrawPanelController drawPanelController;

	public DriverToDrawerNormalLineAdapter(DrawPanelController drawPanelController) {
		super();
		this.drawPanelController = drawPanelController;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		this.drawPanelController.drawLine(line);
		setPosition(x, y);
	}

	@Override
	public String toString() {
		return "Normal line";
	}
}