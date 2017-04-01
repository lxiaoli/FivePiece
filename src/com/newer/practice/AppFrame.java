package com.newer.practice;

import javax.swing.JFrame;

/**
 * 面板
 * @author lxl
 *
 */
public class AppFrame extends JFrame{
	
	/**
	 * 棋盘
	 */
	private GoPanel goPanel;
	
	/**
	 * 构造方法
	 */
	public AppFrame(){
		initui();
		setVisible(true);
	}

	/**
	 * 初始化用户接口
	 */
	private void initui() {
		setTitle("五子棋");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		goPanel = new GoPanel();
		add(goPanel);
	}

}
