/**   
* @Title: UserMapper.java 
* @Package cn.itheima.ssm.mapper 
* @Description: TODO(用一句话描述该文件做什么) 
* @author swuj   
* @date 2017年8月10日 下午3:38:04 
* @version V1.0   
*/
package cn.itheima.ssm.mapper;

import java.util.List;

import cn.itheima.ssm.pojo.Page;
import cn.itheima.ssm.pojo.User;

/** 
* @ClassName: UserMapper 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author swuj
* @date 2017年8月10日 下午3:38:05 
*  
*/
public interface UserMapper {

	/** 
	* @Title: queryUserFy 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param page
	* @param rows
	* @return    设定文件 
	* @return EasyUIResult    返回类型 
	* @throws 
	*/
	List<User> queryUserFy(Page page);

	/** 
	* @Title: queryTotal 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @return    设定文件 
	* @return Integer    返回类型 
	* @throws 
	*/
	Long queryTotal();

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
	* @param id    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	void deleteUserByIds(String[] id);

}
