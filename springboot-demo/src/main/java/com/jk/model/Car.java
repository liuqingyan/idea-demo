/**
 * Copyright (C), 2019, 金科教育
 * FileName: Car
 * Author:   zyl
 * Date:     2019/11/4 10:27
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author lqy
 * @create 2019/12/25
 * @since 1.0.0
 */

public class Car implements Serializable{

    private static final long serialVersionUID = 8506191501202450805L;

    private Integer carId;

    private String carName;

    private String carTime;

    private String carShow;

    private Integer carPrice;

    private String carUrl;

    private Integer typeId;


    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarTime() {
        return carTime;
    }

    public void setCarTime(String carTime) {
        this.carTime = carTime;
    }

    public String getCarShow() {
        return carShow;
    }

    public void setCarShow(String carShow) {
        this.carShow = carShow;
    }

    public Integer getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Integer carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarUrl() {
        return carUrl;
    }

    public void setCarUrl(String carUrl) {
        this.carUrl = carUrl;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
