package com.wsy.util;

import java.net.URL;

import javax.swing.ImageIcon;

import com.wsy.Library;

public class CreatecdIcon {
	public static ImageIcon add(String ImageName){
		URL IconUrl = Library.class.getResource("/res/"+ImageName);
		//String pathString = System.getProperty("user.dir")+"\\res\\"+ImageName;
		//URL IconUrl = Library.class.getResource(pathString);
		ImageIcon icon=new ImageIcon(IconUrl);
		return icon;
	}
}
