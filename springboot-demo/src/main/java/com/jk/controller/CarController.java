/**
 * Copyright (C), 2019, 金科教育
 * FileName: CarController
 * Author:   zyl
 * Date:     2019/11/4 10:32
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.Car;
import com.jk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author lqy
 * @create 2019/11/4
 * @since 1.0.0
 */
@Controller//@RestController   controller+ResponseBody  把当前类的所有返回值当做json返回
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("toQueryCar")
    public String toQueryCar(){

        return "show";
    }

    @RequestMapping("queryCarList")
    @ResponseBody
    public List<Car> queryCarList(){
        return carService.queryCarList();
    }

}
