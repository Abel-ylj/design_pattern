package com.ylj.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器--被client聚合或组合
 * 管理了原型, 客户端索取时, clone一份原型返回即可, clone是对已经有状态的对象克隆一份,与从零初始化new个对象不一样.
 * java中clone有风险, 所以很难见到原型模式的使用
 *
 * @author : ylj
 * create at:  2022/7/25
 */
public class PrototypeManager {
    private static PrototypeManager pm;
    private Map prototypes = null;

    private PrototypeManager() {
        prototypes = new HashMap();
    }

    // 单例模式
    public static PrototypeManager getPrototypeManager() {
        if (pm == null) {
            pm = new PrototypeManager();
        }
        return pm;
    }

    public void register(String name, Object prototype) {
        prototypes.put(name, prototype);
    }

    public void unregister(String name) {
        prototypes.remove(name);
    }

    public Prototype getPrototype(String name) throws CloneNotSupportedException {
        // clone原型
        if (prototypes.containsKey(name)) {
            return (Prototype)((Prototype)prototypes.get(name)).clone();
        } else {
            Prototype object = null;
            try {
                object = (Prototype)Class.forName(name).newInstance();
            } catch (Exception e) {
                System.err.println("Class " + name + " 没有定义!");
            }
            return object;
        }
    }

}