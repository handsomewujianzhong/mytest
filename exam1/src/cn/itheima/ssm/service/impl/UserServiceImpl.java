/**   
* @Title: UserServiceImpl.java 
* @Package cn.itheima.ssm.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author swuj   
* @date 2017年8月10日 下午4:26:17 
* @version V1.0   
*/
package cn.itheima.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itheima.ssm.mapper.UserMapper;
import cn.itheima.ssm.pojo.EasyUIResult;
import cn.itheima.ssm.pojo.Page;
import cn.itheima.ssm.pojo.User;
import cn.itheima.ssm.service.UserService;

/** 
* @ClassName: UserServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author swuj
* @date 2017年8月10日 下午4:26:17 
*  
*/
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	/* (non-Javadoc)
	 * @see cn.itheima.ssm.service.UserService#fy(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public EasyUIResult fy(Page page) {
		EasyUIResult easyUIResult = new EasyUIResult();
		Integer page2 = page.getPage();
		if (page2>=1) {
			page.setPage((page2-1)*page.getRows());
			//page.setRows(page.getPage()+page.getRows());
		}
		easyUIResult.setRows(userMapper.queryUserFy(page)); 
		easyUIResult.setTotal(userMapper.queryTotal().intValue());
		 return easyUIResult;
	}
	/* (non-Javadoc)
	 * @see cn.itheima.ssm.service.UserService#save(cn.itheima.ssm.pojo.User)
	 */
	@Override
	public void save(User user) {
		userMapper.save(user);
		
	}
	/* (non-Javadoc)
	 * @see cn.itheima.ssm.service.UserService#queryUserById(java.lang.Integer)
	 */
	@Override
	public User queryUserById(Integer ids) {
		// TODO Auto-generated method stub
		return userMapper.queryUserById(ids);
	}
	/* (non-Javadoc)
	 * @see cn.itheima.ssm.service.UserService#updateUser(cn.itheima.ssm.pojo.User)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUser(user);
	}
	/* (non-Javadoc)
	 * @see cn.itheima.ssm.service.UserService#deleteUserByIds(java.lang.String)
	 */
	@Override
	public void deleteUserByIds(String ids) {
		String[] id = ids.split(",");
		userMapper.deleteUserByIds(id);
	}

}
