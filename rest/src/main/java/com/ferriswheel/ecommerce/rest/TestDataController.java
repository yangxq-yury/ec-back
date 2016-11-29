package com.ferriswheel.ecommerce.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by QQ on 2016/11/23.
 */
@RestController
public class TestDataController {
    @RequestMapping("/comments")
    public List<Data> initComments(HttpServletResponse response ) {
        System.out.println( "comments------------------------------");
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Data> dataList = new ArrayList();
        {
            Data data = new Data();
            data.setId(1);
            data.setAuthor("john");
            data.setText("hello world");
            dataList.add(data);
        }
        {
            Data data = new Data();
            data.setId(2);
            data.setAuthor("john2");
            data.setText("hello world2");
            dataList.add(data);
        }


        return dataList;
    }
}
