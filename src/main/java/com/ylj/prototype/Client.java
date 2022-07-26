package com.ylj.prototype;

/**
 * 客户端依赖  抽象原型 + 原型管理器
 *
 * @author : ylj
 * create at:  2022/7/25
 */
public class Client {

    private PrototypeManager pm;

    public PrototypeManager getPm() {
        return pm;
    }

    public void setPm(PrototypeManager pm) {
        this.pm = pm;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        // 客户端依赖原型管理器
        Client client = new Client();
        client.setPm(PrototypeManager.getPrototypeManager());

        // 客户端使用原型管理器中的原型, 依赖抽象原型,不依赖具体
        Prototype concretPrototype = client.getPm().getPrototype("ConcretPrototype");

    }
}