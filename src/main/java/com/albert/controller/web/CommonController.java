/**
 * 
 */
package com.albert.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.albert.controller.BaseController;

/** 
* @ClassName: CommonController 
* @Description: 
* @author albert
* @date 2017年3月7日 下午11:06:21 
*  
*/
@Controller
public class CommonController extends BaseController {
	@RequestMapping("/404")
	public String error_404(HttpServletRequest request){
		return "comm/error_404";
	}
	@RequestMapping("/500")
	public String error_500(HttpServletRequest request){
		return "comm/error_500";
	}
}
