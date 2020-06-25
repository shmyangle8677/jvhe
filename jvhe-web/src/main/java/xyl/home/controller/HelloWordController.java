package xyl.home.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xyl.home.service.HelloWord;

@Controller
public class HelloWordController {
    @Autowired
    private HelloWord helloWordImpl;

    public HelloWordController() {
        super();
        System.out.println("======加载了HelloWordController");
    }

    @RequestMapping("/index")
    public String login(Map<String, Object> map) {
        String msg = helloWordImpl.sayHello("李寻欢", "你永远没我的飞刀快");
        map.put("msg", msg);
        return "login";
    }

    /**
     * 此处ModelAndView出入参数map，此参数将会以setAttribute的形式返回前端。
     * @param map
     * @return
     */
    @RequestMapping("/index2")
    public ModelAndView login2(Map<String, Object> map) {
        String msg = helloWordImpl.sayHello("李寻欢", "你永远没我的飞刀快");
        map.put("msg", msg);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        //modelAndView.addObject("msg", map);
        return modelAndView;
    }

}