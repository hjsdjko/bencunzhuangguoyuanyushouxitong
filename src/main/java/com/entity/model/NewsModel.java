package com.entity.model;

import com.entity.NewsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 水果资讯
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class NewsModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 水果名称
     */
    private String newsName;


    /**
     * 水果图片
     */
    private String newsPhoto;


    /**
     * 水果类型
     */
    private Integer newsTypes;


    /**
     * 水果发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 水果详情
     */
    private String newsContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：水果名称
	 */
    public String getNewsName() {
        return newsName;
    }


    /**
	 * 设置：水果名称
	 */
    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }
    /**
	 * 获取：水果图片
	 */
    public String getNewsPhoto() {
        return newsPhoto;
    }


    /**
	 * 设置：水果图片
	 */
    public void setNewsPhoto(String newsPhoto) {
        this.newsPhoto = newsPhoto;
    }
    /**
	 * 获取：水果类型
	 */
    public Integer getNewsTypes() {
        return newsTypes;
    }


    /**
	 * 设置：水果类型
	 */
    public void setNewsTypes(Integer newsTypes) {
        this.newsTypes = newsTypes;
    }
    /**
	 * 获取：水果发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：水果发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：水果详情
	 */
    public String getNewsContent() {
        return newsContent;
    }


    /**
	 * 设置：水果详情
	 */
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
