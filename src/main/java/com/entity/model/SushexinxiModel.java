package com.entity.model;

import com.entity.SushexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宿舍信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-30 17:38:15
 */
public class SushexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所在楼
	 */
	
	private String suozailou;
		
	/**
	 * 床位数量
	 */
	
	private String chuangweishuliang;
		
	/**
	 * 值班人
	 */
	
	private String zhibanren;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：所在楼
	 */
	 
	public void setSuozailou(String suozailou) {
		this.suozailou = suozailou;
	}
	
	/**
	 * 获取：所在楼
	 */
	public String getSuozailou() {
		return suozailou;
	}
				
	
	/**
	 * 设置：床位数量
	 */
	 
	public void setChuangweishuliang(String chuangweishuliang) {
		this.chuangweishuliang = chuangweishuliang;
	}
	
	/**
	 * 获取：床位数量
	 */
	public String getChuangweishuliang() {
		return chuangweishuliang;
	}
				
	
	/**
	 * 设置：值班人
	 */
	 
	public void setZhibanren(String zhibanren) {
		this.zhibanren = zhibanren;
	}
	
	/**
	 * 获取：值班人
	 */
	public String getZhibanren() {
		return zhibanren;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
