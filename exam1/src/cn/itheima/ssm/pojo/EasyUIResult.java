package cn.itheima.ssm.pojo;

import java.util.List;

public class EasyUIResult {
    
    private Integer total;
    
    private List<User> rows;
    
    public EasyUIResult() {
        
    }
    
    public EasyUIResult(Integer total, List<User> rows) {
        this.total = total;
        this.rows = rows;
    }
    
    public EasyUIResult(Long total, List<User> rows) {
        this.total = total.intValue();
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<User> getRows() {
        return rows;
    }

    public void setRows(List<User> rows) {
        this.rows = rows;
    }
    
}
