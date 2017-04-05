package com.newer.practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 * 画棋子
 * @author lxl
 *
 */
public class Piece {
	
	BufferedImage imag;
	
	//设置棋子的直径
	private int size = 20;
	
	
	private int x;
	private int y;
	
	private boolean isWhite = true;

	public Piece(int x, int y, boolean isWhite) {
		super();
		this.x = x-size/2;
		this.y = y-size/2;
		this.isWhite = isWhite;
	}

	public Piece() {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isWhite() {
		return isWhite;
	}

	/**
	 * 绘制棋子
	 * @param g
	 */
	public void draw(Graphics g) {
		
		g.setColor(isWhite?Color.WHITE:Color.BLACK);
		g.fillOval(x, y, size, size);
		
		
	}
	
	
	

}
