package xyl.home.service.impl;

import org.springframework.stereotype.Service;

import xyl.home.service.HelloWord;
@Service
public class HelloWordImpl implements HelloWord {

    public HelloWordImpl() {
        super();
        System.out.println("加载了HelloWordImpl");
    }

    public String sayHello(String name, Object obj) {
        return name+"对你说"+obj.toString();
    }

}