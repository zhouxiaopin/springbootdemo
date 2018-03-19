package cn.gzticc.springbootdemo.controller;


import cn.gzticc.springbootdemo.base.pojo.BaseResult;
import cn.gzticc.springbootdemo.base.utils.ResultUtils;
import cn.gzticc.springbootdemo.properties.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/page")
public class PageController {
    @Autowired
    TestProperties testProperties;
//    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @GetMapping("/index")
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }
    @GetMapping("/test1")
    public BaseResult test1() throws Exception{
        int i = 5/0;
        return ResultUtils.baseResult(1,"lkfjdlfd");
    }
    @GetMapping("/test2")
    public BaseResult test2() throws Exception{
        return ResultUtils.baseResult(1,"属性文件的值："+testProperties.getName());
    }
}
