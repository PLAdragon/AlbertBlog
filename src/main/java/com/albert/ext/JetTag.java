/**
 * 
 */
package com.albert.ext;

import java.io.IOException;

import com.blade.kit.StringKit;

import jetbrick.template.JetAnnotations.Tags;
import jetbrick.template.runtime.JetTagContext;

/** 
* @ClassName: JetTag 
* @Description: 
* @author albert
* @date 2017年3月10日 下午12:49:56 
*  
*/
@Tags
public class JetTag {
	 public static void social(JetTagContext ctx, String name) throws IOException {
	        String value = "social_" + name;
	        if (StringKit.isNotBlank(value)) {
	            value = ctx.getBodyContent();
	        }
	        ctx.getWriter().print(value.toString());
	    }
}
