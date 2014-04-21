package org.cen.cup.cup2008.gameboard.elements;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import org.cen.ui.gameboard.AbstractGameBoardElement;

public class Ball extends AbstractGameBoardElement {
	public static enum BallColor {
		BLUE, RED, WHITE;
	}

	private final BallColor color;

	public Ball(String name, BallColor color, Point2D position) {
		super(name, position);
		order = 10;
		this.color = color;
	}

	@Override
	public void paint(Graphics2D g) {
		Color c;
		switch (color) {
		case BLUE:
			c = Color.BLUE;
			break;
		case RED:
			c = Color.RED;
			break;
		case WHITE:
			c = Color.WHITE;
			break;
		default:
			return;
		}
		g.setColor(c);
		g.fillOval(-36, -36, 72, 72);
	}
}
