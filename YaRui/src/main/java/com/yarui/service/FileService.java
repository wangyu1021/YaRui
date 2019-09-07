package com.yarui.service;

import org.springframework.web.multipart.MultipartFile;

import com.yarui.vo.ImageVO;



public interface FileService {

	ImageVO updateFile(MultipartFile uploadFile);

}
