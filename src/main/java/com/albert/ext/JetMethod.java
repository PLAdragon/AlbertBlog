/**
 * 
 */
package com.albert.ext;

import java.io.IOException;

import jetbrick.template.JetAnnotations.Methods;


/** 
* @ClassName: JetTag 
* @Description: 扩展方法
* @author albert
* @date 2017年3月9日 下午10:32:14 
*  
*/
@Methods
public class JetMethod {
	public static String link(String text,String url) throws IOException {
		 return "<a href=\"" + url + "\">" + text + "</a>";
    }
}
