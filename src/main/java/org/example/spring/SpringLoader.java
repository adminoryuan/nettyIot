package org.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLoader {
    private static AnnotationConfigApplicationContext  context;

    /**
     * 初始化spring
     */
    public static void Init()  {
        context = new AnnotationConfigApplicationContext();
        context.scan("org.example"); // 指定要扫描的包路径
        context.refresh();
    }

    /**
     * 根据类型获取对应的实例
     * @param cls
     * @return
     * @param <T>
     */
    public static <T> T getBean(Class<T> cls){
        return context.getBean(cls);
    }

}