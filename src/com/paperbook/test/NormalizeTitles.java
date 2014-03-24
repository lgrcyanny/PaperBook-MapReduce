package com.paperbook.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import com.paperbook.batchimport2.Word;

public class NormalizeTitles {
	
	public static void main(String[] args) {
		String res = "";
		try {
			BufferedReader buffer = new BufferedReader(new FileReader("resources/titles.txt"));
			String line = null;
			while ((line = buffer.readLine()) != null) {
				res = res + "'" + line + "'" + ", ";
			}
			buffer.close();
			res = res.substring(0, res.length() - 2);
			PrintWriter out = new PrintWriter("resources/test-title.txt");
			out.println(res);
			out.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
