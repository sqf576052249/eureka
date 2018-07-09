package com.eureka.api.result;


import java.io.Serializable;
import java.util.List;

/**
 * 鍒嗛〉鍣�
 * 
 * @author masai
 * @version $Id: Paginator.java, v 0.1 2017骞�5鏈�11鏃� 涓嬪崍3:30:06 masai Exp $
 */
public class Paginator<T> implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID  = -6231408155509180106L;

    /** 榛樿椤电爜 */
    public static final int   DEFAULT_PAGE_NO   = 1;
    /** 榛樿姣忛〉鏉℃暟 */
    public static final int   DEFAULT_PAGE_SIZE = 10;

    /** 褰撳墠椤电爜 */
    private int               pageNo;

    /** 姣忛〉鏉℃暟 */
    private int               pageSize;

    /** 鎬绘潯鏁� */
    private long              totalDataNum;

    /** 鎬婚〉鏁� */
    private int               totalPageNum;

    /** 褰撳墠椤垫暟鎹� */
    private List<T>           pageData;

    /**
     * 鏋勯�犲嚱鏁�
     * 
     */
    public Paginator() {
        pageNo = DEFAULT_PAGE_NO;
        pageSize = DEFAULT_PAGE_SIZE;
        totalDataNum = 0;
        totalPageNum = 0;
    }

    /**
     * 鏋勯�犲嚱鏁�
     * 
     * @param pageNo
     * @param pageSize
     * @param totalDataNum
     */
    public Paginator(int pageNo, int pageSize, long totalDataNum) {
        this.pageNo = pageNo;
        this.pageSize = pageSize == 0 ? DEFAULT_PAGE_SIZE : pageSize;
        this.totalDataNum = totalDataNum;
        this.totalPageNum = (int) ((totalDataNum + pageSize - 1) / pageSize);
    }

    /**
     * 鏋勯�犲嚱鏁�
     * 
     * @param pageNo
     * @param pageSize
     * @param totalDataNum
     * @param pageData
     */
    public Paginator(int pageNo, int pageSize, long totalDataNum, List<T> pageData) {
        this.pageNo = pageNo;
        this.pageSize = pageSize == 0 ? DEFAULT_PAGE_SIZE : pageSize;
        this.totalDataNum = totalDataNum;
        this.totalPageNum = (int) ((totalDataNum + pageSize - 1) / pageSize);
        this.pageData = pageData;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize == 0 ? DEFAULT_PAGE_SIZE : pageSize;
        this.totalPageNum = (int) ((totalDataNum + pageSize - 1) / pageSize);
    }

    public long getTotalDataNum() {
        return totalDataNum;
    }

    public void setTotalDataNum(long totalDataNum) {
        this.totalDataNum = totalDataNum;
        pageSize = this.pageSize == 0 ? DEFAULT_PAGE_SIZE : this.pageSize;
        this.totalPageNum = (int) ((totalDataNum + pageSize - 1) / pageSize);
    }

    public int getTotalPageNum() {
        return totalPageNum;
    }

    public List<T> getPageData() {
        return pageData;
    }

    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }

    public void setTotalPageNum(int totalPageNum) {
        this.totalPageNum = totalPageNum;
    }
}
