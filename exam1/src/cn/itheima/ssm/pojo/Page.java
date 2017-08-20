/**   
* @Title: Page.java 
* @Package cn.itheima.ssm.pojo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author swuj   
* @date 2017年8月10日 下午4:34:19 
* @version V1.0   
*/
package cn.itheima.ssm.pojo;

/** 
* @ClassName: Page 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author swuj
* @date 2017年8月10日 下午4:34:19 
*  
*/
public class Page {
	private Integer page;
	private Integer rows;
	/**
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}
	/**
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
}
