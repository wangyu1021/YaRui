package com.yarui.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yarui.pojo.JsonResult;
import com.yarui.pojo.Product;
import com.yarui.pojo.ProductCenter;
import com.yarui.service.FileService;
import com.yarui.service.ProductCenterService;
import com.yarui.service.ProductService;
import com.yarui.util.ReplaceNullUtil;
import com.yarui.vo.Page;
import com.yarui.vo.ProductImage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@RequestMapping("/product")
@Api(value="/product",tags = "商品接口")
public class ProductController {
	@Autowired
	private ProductCenterService productCenterService;
	@Autowired
	private ProductService productService;
	@Autowired
	private FileService fileService;


	//实现文件上传
	@Transactional
	@RequestMapping("/addProductImage.do")
	@ResponseBody
	@ApiOperation(value = "增加商品图片接口", notes = "增加商品图片接口", httpMethod = "POST", response = JsonResult.class)
	public JsonResult uploadFile(@RequestParam(value="images",required=false)MultipartFile[] images,
			@RequestParam(value="introductionImages",required = false)MultipartFile[] introductionImages) {
		JsonResult json=new JsonResult();
		try {
			String[] imageUrls= new String[images.length];
			String[] introductionImageUrls=new String[introductionImages.length];
			ProductImage productImage =new ProductImage();
			if(images!=null) {
				for(int i=0;i<images.length;i++) {
					if(images[i]!=null) {
						String url=fileService.updateFile(images[i]).getUrl();
						imageUrls[i]=url;
					}
				}
				imageUrls=ReplaceNullUtil.replaceNull(imageUrls);
				String imageURL=String.join(",", imageUrls);
				productImage.setImageURL(imageURL);
			}
			if(introductionImages!=null) {
				for(int i=0;i<introductionImages.length;i++) {	
					if(introductionImages[i]!=null) {
						String introductionImage=fileService.updateFile(introductionImages[i]).getUrl();
						introductionImageUrls[i]=introductionImage;
					}
				}
				introductionImageUrls=ReplaceNullUtil.replaceNull(introductionImageUrls);
				String introductionImageURL=String.join(",", introductionImageUrls);
				productImage.setIntroductionImageURL(introductionImageURL);
			}
			json.setState(1);
			json.setMessage("上传成功");
			json.setData(productImage);
		} catch (Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage("上传失败");
		}
		return json;
	}

	@Transactional
	@RequestMapping("/addProduct")
	@ResponseBody
	@ApiOperation(value = "增加商品接口", notes = "增加商品接口", httpMethod = "POST", response = JsonResult.class)
	public JsonResult addProduct(@RequestBody(required = false) Product product) {
		JsonResult json=new JsonResult();
		try {
			productService.addProduct(product);
			json.setState(1);
			json.setMessage("添加成功");
		}catch(Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage("添加失败");

		}
		return json;
	}



	@RequestMapping("/findProductCenter.do")
	@ResponseBody
	@ApiOperation(value = "获取商品分类信息", notes = "获取商品分类信息", httpMethod = "GET", response = Map.class)
	public Map<String,Object> findProductCenter(){
		List<ProductCenter> list = productCenterService.findProductCenter();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("productCenterList", list);
		return map;
	}
	@RequestMapping("/addProductCenter.do")
	@ResponseBody
	@ApiOperation(value = "增加商品分类", notes = "增加商品分类", httpMethod = "GET", response = Map.class)
	public JsonResult addProductCenter(String classification) {
		JsonResult json=new JsonResult();
		try {
			System.out.println(classification);
			productCenterService.addProdcutCenter(classification);
			json.setState(1);
			json.setMessage("添加成功");
		} catch (Exception e) {
			json.setState(0);
			json.setMessage("添加失败");
		}
		return json;
	}

	@RequestMapping("/findProductByProductCenterId.do")
	@ResponseBody
	@ApiOperation(value = "根据分类id获取商品", notes = "根据分类id获取商品", httpMethod = "GET", response = JsonResult.class)
	public JsonResult doFindEnterpriseInformationPage(Integer pageCurrent,Integer id) {
		JsonResult json = new JsonResult();
		try {
			Page<Product> page = productService.findPageObjects(pageCurrent, id);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}//将对象转换为json串时，都是访问get方法


}
