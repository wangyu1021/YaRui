package com.yarui.service;


import com.yarui.vo.Page;



/**
 * 分页层
 * @author Riyas
 *
 * @param <T>
 */
public interface PageService<T> {
	 Page<T> findPageObjects(
			 Integer pageCurrent,
			 Integer id);
}
/*
 * public JsonResult doFindEnterpriseInformationPage(Integer pageCurrent,String name) {
		JsonResult json = new JsonResult();
		try {
			Page<EnterpriseInformation> page = enterpriseInformationService.findPageObjects(pageCurrent, name);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}//将对象转换为json串时，都是访问get方法
	public Page<EnterpriseDynamic> findPageObjects(Integer pageCurrent, String title) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=enterpriseDynamicDao.getRowCount(title);
		if(rowCount==0)
			throw new RuntimeException("没有记录");
		//3.查询当前页记录
		int pageSize=10;
		int startIndex=(pageCurrent-1)*pageSize;
		List<EnterpriseDynamic> records=
				enterpriseDynamicDao.findPageObjects(title, 
						startIndex, pageSize);
		//4.进行封装并返回
		Page<EnterpriseDynamic> po =
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;
	}
 * 
 */
