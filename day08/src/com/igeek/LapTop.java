package com.igeek;

public class LapTop {
	
	public void start() {
		System.out.println("开启");
	}
	
	public void run() {
		System.out.println("运行");
	}
	
	public void useUSB(USB usb) {
		if(usb != null) {
			usb.open();
			//判断
			if(usb instanceof Mouse) {
				Mouse mouse = (Mouse)usb;
				mouse.click();
			}else if (usb instanceof KeyBorder) {
				KeyBorder kb = (KeyBorder)usb;
				kb.type();
			}
			usb.close();
		}
		
	}
	
	public void shutDown() {
		System.out.println("关闭笔记本");
	}

}
