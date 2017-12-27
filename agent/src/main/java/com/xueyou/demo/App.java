package com.xueyou.demo;

import com.xueyou.demo.agent.FirstAgent;

import java.lang.instrument.Instrumentation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        hello();
    }

    public static String hello() {
        System.out.println("xxxyyyzzz");
        return "hello world";
    }

    public static void premain(String agentOps, Instrumentation inst) {
        System.out.println("=========premain方法执行========");
        System.out.println(agentOps);
        // 添加Transformer
        inst.addTransformer(new FirstAgent());
    }
}
