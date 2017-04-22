package com.cn.yajie.util.common;

public class PageModel {
	
	//总记录数
	private int recordCount;
	
	//当前页面
	private int pageIndex;
	
	//每页多少条 默认10条
	private int pageSize = JieYaConstants.PAGE_DEFAULT_SIZE;
	//总页数
	private int totalSize;
	
	//数据查询 起始
	private int firstLimitParam;
	
	public int getRecordCount() {
		this.recordCount = this.recordCount <= 0 ? 0 : this.recordCount;
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getPageIndex() {
		this.pageIndex = this.pageIndex >= this.getTotalSize() ? this.getTotalSize() : this.pageIndex;
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		this.pageSize = this.pageSize <= JieYaConstants.PAGE_DEFAULT_SIZE ? JieYaConstants.PAGE_DEFAULT_SIZE : this.pageSize;
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalSize() {
		if(this.getRecordCount() <= 0){//如果总记录数小于0 则总页数为0
			totalSize = 0;
		}else{//否则 总页数 为 以下计算公式
			totalSize = (this.getRecordCount() - 1)/this.getPageSize()+1;
		}
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public void setFirstLimitParam(int firstLimitParam) {
		this.firstLimitParam = firstLimitParam;
	}
	public int getFirstLimitParam() {
		return firstLimitParam;
	}
	@Override
	public String toString() {
		return "PageModel [recordCount=" + recordCount + ", pageIndex=" + pageIndex + ", pageSize=" + pageSize
				+ ", totalSize=" + totalSize + ", firstLimitParam=" + firstLimitParam + "]";
	}
	
	
}
