package com.yarui.controller;


import org.springframework.web.multipart.MultipartFile;

import com.yarui.service.FileService;
import com.yarui.vo.ImageVO;



public class FileController {
	
	private FileService fileService;
	//实现文件上传
	public ImageVO uploadFile(MultipartFile uploadFile) {
		return fileService.updateFile(uploadFile);
	}
	
	
}
