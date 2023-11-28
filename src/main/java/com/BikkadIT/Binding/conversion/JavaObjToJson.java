package com.BikkadIT.Binding.conversion;

import com.BikkadIT.Binding.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjToJson {

	public static void main(String[] args) throws JsonProcessingException {

		Student stu = new Student();
		stu.setSid(111);
		stu.setSname("Rohini");
		stu.setSrank(2);
		stu.setSage(31);
		System.out.println(stu);
		
		ObjectMapper objectMapper=new ObjectMapper();
		String json = objectMapper.writeValueAsString(stu);
		System.out.println(json);
		
	}
}
