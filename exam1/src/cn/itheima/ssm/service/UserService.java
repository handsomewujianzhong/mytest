/**   
* @Title: UserService.java 
* @Package cn.itheima.ssm.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author swuj   
* @date 2017年8月10日 下午4:25:50 
* @version V1.0   
*/
package cn.itheima.ssm.service;

import cn.itheima.ssm.pojo.EasyUIResult;
import cn.itheima.ssm.pojo.Page;
import cn.itheima.ssm.pojo.User;

/** 
* @ClassName: UserService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author swuj
* @date 2017年8月10日 下午4:25:50 
*  
*/
public interface UserService {

	/** 
	* @Title: fy 
	* @Description:分页
	* @param page
	* @param rows
	* @return    设定文件 
	* @return EasyUIResult    返回类型 
	* @throws 
	*/
	EasyUIResult fy(Page page);

	/** 
	* @Title: save 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param user    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	void save(User user);

	/** 
	* @Title: queryUserById 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param ids
	* @return    设定文件 
	* @return User    返回类型 
	* @throws 
	*/
	User queryUserById(Integer ids);

	/** 
	* @Title: updateUser 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param user    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	void updateUser(User user);

	/** 
	* @Title: deleteUserByIds 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param ids    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	void deleteUserByIds(String ids);

}
