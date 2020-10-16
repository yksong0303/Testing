package com.sp.test.vo;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class TestVO {
	private String name;
	private String title;
	private MultipartFile file;
	
}
