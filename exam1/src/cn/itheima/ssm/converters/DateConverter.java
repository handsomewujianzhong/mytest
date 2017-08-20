/**   
* @Title: DateConverter.java 
* @Package cn.itheima.ssm.converters 
* @Description: TODO(用一句话描述该文件做什么) 
* @author swuj   
* @date 2017年8月10日 下午6:28:47 
* @version V1.0   
*/
package cn.itheima.ssm.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/** 
* @ClassName: DateConverter 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author swuj
* @date 2017年8月10日 下午6:28:47 
*  
*/
public class DateConverter implements Converter<String, Date>{

	/* (non-Javadoc)
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	@Override
	public Date convert(String arg0) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(arg0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
