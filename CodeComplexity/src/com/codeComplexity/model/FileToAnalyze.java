package com.codeComplexity.model;

import java.util.Arrays;

public class FileToAnalyze {
	private byte[] file;
	private String fileName;
	
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "FileToAnalyze [file=" + Arrays.toString(file) + ", fileName=" + fileName + "]";
	}
}
