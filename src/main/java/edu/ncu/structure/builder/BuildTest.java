package edu.ncu.structure.builder;

import edu.ncu.structure.builder.present.DecorationPackageController;

import java.math.BigDecimal;

public class BuildTest {

    /**
     * 建造者模式（Builder Pattern）：是将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示，
     * 这种类型的设计模式属于创建型模式。
     * @param args
     */
    public static void main(String[] args) {
     /*   DecorationPackageController decoration = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));*/

        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
