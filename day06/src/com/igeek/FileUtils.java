package com.igeek;

import java.io.File;

/**
 * @author zx
 * @version1.0
 * @description:
 */
public class FileUtils {
	
	private long len;
	private String path;
	private File file;
	private int fileCount;
	private int dirCount;
	
	public FileUtils(String path) {
		super();
		this.path = path;
		this.file = new File(path);
		count(file);
	}

	public long getLen() {
		return len;
	}

	public void setLen(long len) {
		this.len = len;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public int getFileCount() {
		return fileCount;
	}


	public void setFileCount(int fileCount) {
		this.fileCount = fileCount;
	}

	public int getDirCount() {
		return dirCount;
	}

	public void setDirCount(int dirCount) {
		this.dirCount = dirCount;
	}

	//统计大小;统计文件数;目录数
	public void count(File src) {
		if((src.exists()) || (src != null)) {
			if(src.isFile()) {
				len += src.length();
				fileCount++;
			}else {
				dirCount++;
				File[] files = src.listFiles();
				for (File file : files) {
					count(file);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FileUtils dFileUtils = new FileUtils("D:\\nlgclg-workspace\\day06");
		System.out.println(dFileUtils.getLen());
		System.out.println("文件数:"+dFileUtils.getFileCount());
		System.out.println("目录数:"+dFileUtils.getDirCount());
	}

}
