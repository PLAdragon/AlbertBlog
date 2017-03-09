/**
 * 
 */
package com.albert.ext;

import java.text.SimpleDateFormat;
import java.util.Date;

import jetbrick.template.JetAnnotations.Functions;

/** 
* @ClassName: JetFunction 
* @Description: 
* @author albert
* @date 2017年3月9日 下午11:11:27 
*  
*/
@Functions
public class JetFunction {
	public static String today(String format){
		return new SimpleDateFormat(format).format(new Date());
	}
	public static String site_title(){
		String title = "Albert的博客";
		return title;
	}
	public static String head_title(){
		return site_title();
	}
	public static String site_url(){
		return "http://localhost:8080/AlbertBlog/themes/default";
	}
	public static String theme_url(String path){
		return site_url()+path;
	}
	public static String site_url(String path){
		return site_url()+path;
	}
	
	public static String meta_keywords(){
		return "个人博客，blog";
	}
	public static String meta_description(){
		return "albert的个人博客";
	}
	public static String staticToDay(){
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}
}
