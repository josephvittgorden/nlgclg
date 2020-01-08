package com.igeek;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class Demo19 {

	public static void main(String[] args) {
		Collection<File> files = FileUtils.listFiles(new File("D:\\nlgclg-workspace\\day06"), EmptyFileFilter.NOT_EMPTY,
				null);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}

		System.out.println("*********************************");
		files = FileUtils.listFiles(new File("D:\\nlgclg-workspace\\day06"), 
				EmptyFileFilter.NOT_EMPTY,
				DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}

		System.out.println("*********************************");
		// 后缀Suffix
		files = FileUtils.listFiles(new File("D:\\nlgclg-workspace\\day06"), 
				new SuffixFileFilter("java"),DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("*********************************");
		files = FileUtils.listFiles(new File("D:\\nlgclg-workspace\\day06"),
				FileFilterUtils.or(new SuffixFileFilter("java"),new SuffixFileFilter("txt")),
				DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("*********************************");
		files = FileUtils.listFiles(new File("D:\\nlgclg-workspace\\day06"),
				FileFilterUtils.and(new SuffixFileFilter("java"),EmptyFileFilter.NOT_EMPTY),
				DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
	}

}
