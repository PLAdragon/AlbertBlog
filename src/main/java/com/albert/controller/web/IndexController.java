/**
 * 
 */
package com.albert.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.albert.controller.BaseController;

/** 
* @ClassName: IndexController 
* @Description: 
* @author albert
* @date 2017年3月7日 下午10:45:56 
*  
*/
@Controller
public class IndexController extends BaseController {
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("name", "张亚强");
		return "themes/default/header";
	}
	
}
