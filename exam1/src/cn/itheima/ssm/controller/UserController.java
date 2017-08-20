/**   
* @Title: UserController.java 
* @Package cn.itheima.ssm.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author swuj   
* @date 2017年8月10日 下午2:52:57 
* @version V1.0   
*/
package cn.itheima.ssm.controller;


import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.itheima.ssm.pojo.EasyUIResult;
import cn.itheima.ssm.pojo.Page;
import cn.itheima.ssm.pojo.User;
import cn.itheima.ssm.service.UserService;

/** 
* @ClassName: UserController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author swuj
* @date 2017年8月10日 下午2:52:57 
*  
*/
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("user")
	public String user(){
		return "users";
	}
	//异步请求
	@RequestMapping("list")
	@ResponseBody
	public EasyUIResult list(Page page){
		EasyUIResult easyUIResult = userService.fy(page);
		
		return easyUIResult;
	}
	//新增页面
	@RequestMapping("user_add")
	public String user_add(){
		return "user-add";
	}
	//新增
	@RequestMapping("save")
	@ResponseBody
	public String save(User user){
		userService.save(user);
		return new String("成功");
	}
	//跳转到更新页面queryUserById?ids='+ids
	@RequestMapping("queryUserById")
	public String queryUserById(Model model,Integer ids) {
		User user = userService.queryUserById(ids);
		model.addAttribute("user", user);
		return "user-edit";
	}
	//更新
	@RequestMapping("updateUser")
	@ResponseBody
	public String updateUser(User user){
		userService.updateUser(user);
		return new String("");
	}
	//删除
	@RequestMapping("deleteUserByIds")
	@ResponseBody
	public String deleteUserByIds(String ids) {
		userService.deleteUserByIds(ids);
		return "";
	}
}

