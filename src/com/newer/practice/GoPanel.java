package com.newer.practice;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GoPanel extends JPanel {

	private BufferedImage imag;
	
	/**
	 * 存放棋子
	 */
	private List<Piece> pieceList = new ArrayList<Piece>();

	/**
	 * 构造方法
	 */
	public GoPanel() {
		try {
			imag = ImageIO.read(new File("souce/go.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/**
		 * 增加一个监听器
		 */
		addMouseListener(new PanelListener());
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		// 画张图片、背景
		g.drawImage(imag, 0, 0, getWidth(), getHeight(), null);
		
		//画棋子
		for (Piece piece : pieceList) {
			piece.draw(g);
		}
	}

	/**
	 * 面板中鼠标事件的监听（适配器模式）
	 * 
	 * @author lxl
	 *
	 */
	class PanelListener extends MouseAdapter {
		boolean isWhite = true;
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			System.out.printf("(x=%d,y=%d)\n",e.getX(),e.getY());
			
			//创建棋子，把旗子放到列表中去
			Piece piece = new Piece(e.getX(), e.getY(), isWhite);
			pieceList.add(piece);
			isWhite = !isWhite;
			
			//重绘制
			repaint();
//			repaint(20);
		}

	}

}
