/**
 * 
 */
package com.albert.ext;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.albert.domain.table.Contents;
import com.blade.kit.StringKit;

import jetbrick.template.JetAnnotations.Functions;
import jetbrick.template.runtime.InterpretContext;

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
	
	public static String site_option(){
		return site_option("");
	}
	
	public static String site_option(String option){
		return "albert"+option;
	}
	/**
     * 返回文章链接地址
     *
     * @return
     */
    public static String permalink() {
        Contents contents = current_article();
        return null != contents ? permalink(contents) : "";
    }
    /**
     * 返回文章链接地址
     *
     * @param contents
     * @return
     */
    public static String permalink(Contents contents) {
        return permalink(contents.getCid(), contents.getSlug());
    }
    /**
     * 返回文章链接地址
     *
     * @param cid
     * @param slug
     * @return
     */
    public static String permalink(Integer cid, String slug) {
        return site_url("/article/" + (StringKit.isNotBlank(slug) ? slug : cid.toString()));
    }
	/**
     * 获取当前上下文的文章对象
     *
     * @return
     */
    private static Contents current_article() {
        InterpretContext ctx = InterpretContext.current();
        Object value = ctx.getValueStack().getValue("article");
        if (null != value) {
            return (Contents) value;
        }
        return null;
    }
    /**
     * 获取文章摘要
     * @param len
     * @return
     */
    public static String intro(int len) {
        Contents contents = current_article();
        if (null != contents) {
            return intro(contents.getContent(), len);
        }
        return "";
    }
}
