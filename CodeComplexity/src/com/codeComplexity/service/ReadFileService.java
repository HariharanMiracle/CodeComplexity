package com.codeComplexity.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.codeComplexity.model.FileToAnalyze;
import com.codeComplexity.model.SingleLineStatement;

public class ReadFileService {

	public List<SingleLineStatement> readFile(FileToAnalyze file) {
		
		//to hold the current line number that reads
		int Lineindex = 0;

		ArrayList<SingleLineStatement> list = new ArrayList<SingleLineStatement>();
		
//		File readFile = new File(getClass().getClassLoader().getResource("tempFile.txt").getFile());
//		File readFile = new File("F:/abc.txt");
		File readFile = new File("F:/abc.txt");
		
		try {
	
			OutputStream os = new FileOutputStream(readFile);

			os.write(file.getFile());

			BufferedReader reader = new BufferedReader(new FileReader(readFile));

			String line = reader.readLine();

			while (line != null) {
				Lineindex++;
				
				SingleLineStatement obj = new SingleLineStatement();

				line = reader.readLine();
				obj.setStatement(line+" ");
				obj.setLineNumber(Lineindex);
				list.add(obj);
				System.out.println("statement => " + obj.getStatement());
				System.out.println("line => " + obj.getLineNumber());
			}

			
			reader.close();
			os.close();

		} catch (Exception e) {
			System.out.println("Error in reading the file :" + e.getMessage());
			e.printStackTrace();
		}
		
		return list;
	}
	
}
