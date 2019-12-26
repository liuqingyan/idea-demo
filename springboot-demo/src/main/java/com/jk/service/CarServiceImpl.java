
package com.jk.service;

import com.jk.mapper.CarMapper;
import com.jk.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author lqy
 * @create 2019/12/25
 * @since 1.0.0
 */
@Service
public class CarServiceImpl implements CarService {


    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> queryCarList() {
        return carMapper.queryCarList();
    }
}
