package com.igeek;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * @author zx
 * @version1.0
 * @description:模拟小球运动
 */
public class Demo13 extends JFrame /* implements KeyListener*/{
	//坐标轴
	int x = 50;
	int y = 50;
	int speed = 10;
	//构造器
	public Demo13() throws HeadlessException {
		super();
		//设置参数
		this.setTitle("模拟小球运动");
		this.setSize(500, 500);
		this.setLocation(150, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//注册监听
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					y -= speed;
					System.out.println("up");
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					y += speed;
					System.out.println("down");
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					x -= speed;
					System.out.println("left");
				}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					x += speed;
					System.out.println("right");
				}
				//重新绘制
				repaint();
			}
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {
		Demo13 demo13 = new Demo13();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
//		g.drawOval(50, 50, 100, 100);
		g.setColor(Color.RED);
		g.fillOval(x, y, 100, 100);
	}

/*	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			y -= speed;
			System.out.println("up");
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += speed;
			System.out.println("down");
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= speed;
			System.out.println("left");
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += speed;
			System.out.println("right");
		}
		//重新绘制
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}*/

}
