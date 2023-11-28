package com.BikkadIT.Binding.conversion;

import java.io.File;
import java.io.IOException;

import com.BikkadIT.Binding.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaObj {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File f = new File("Student.Json");

		ObjectMapper objectMapper = new ObjectMapper();
		Student student = objectMapper.readValue(f, Student.class);
		System.out.println(student);
	}

}
