package com.itheima.test;

import com.itheima.drools.entity.ComparsionOperatorEntity;
import com.itheima.drools.entity.Order;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

public class DroolsTest {
    @Test
    public void test1() {
        //获得service
        KieServices kieServices = KieServices.Factory.get();
        //获取kie容器对象
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //kie容器对象中获取会话对象
        KieSession session = kieContainer.newKieSession();
        //Fact对象（事实对象）
        Order order = new Order();
        order.setOriginalPrice(100d);
        //将对象插入到工作内存中
        session.insert(order);
        //激活规则，由drools框架自动进行规则匹配，如果匹配成功，则执行当前规则
        session.fireAllRules();
        //关闭会话
        session.dispose();
        System.out.println("最终价格" + order.getRealPrice());
    }

    @Test
    public void test2() {
        //获得service
        KieServices kieServices = KieServices.Factory.get();
        //获取kie容器对象
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //kie容器对象中获取会话对象
        KieSession session = kieContainer.newKieSession();
        //Fact对象（事实对象）
        ComparsionOperatorEntity entity = new ComparsionOperatorEntity();
        entity.setNames("李四");
        List<String> list = new ArrayList<String>();
        list.add("张三2");
        list.add("李四2");
        entity.setList(list);
        //将对象插入到工作内存中
        session.insert(entity);
        //激活规则，由drools框架自动进行规则匹配，如果匹配成功，则执行当前规则
        session.fireAllRules();
        //关闭会话
        session.dispose();
        System.out.println("最终价格" + entity.getNames());
    }

    //执行指定规则
    @Test
    public void test3() {
        //获得service
        KieServices kieServices = KieServices.Factory.get();
        //获取kie容器对象
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //kie容器对象中获取会话对象
        KieSession session = kieContainer.newKieSession();
        //Fact对象（事实对象）
        ComparsionOperatorEntity entity = new ComparsionOperatorEntity();
        entity.setNames("李四");
        List<String> list = new ArrayList<String>();
        list.add("张三2");
        list.add("李四2");
        entity.setList(list);
        //将对象插入到工作内存中
        session.insert(entity);
        //激活规则，由drools框架自动进行规则匹配，如果匹配成功，则执行当前规则
        session.fireAllRules();
        //关闭会话
        session.dispose();
        System.out.println("最终价格" + entity.getNames());
    }
}
