class Dish1 extends Dish {
    public Dish1() {
        super(10, "番茄炒蛋");
    }

    @Override
    public void profile() {
        System.out.println("番茄炒蛋是普通的大众菜肴，烹调方法比较简" +
                "单，而且营养搭配合理。色泽鲜艳，口味宜人，深受大众喜爱。其营" +
                "养价值丰富，具有营养素互补的特点以及健美抗衰老的作用。番茄含有丰富" +
                "的胡萝卜素、维生素C和B族维生素，番茄红素具有独特的抗氧化能力。鸡蛋含" +
                "有大量的维生素和矿物质及有高生物价的蛋白质。蛋黄中含有丰富的卵磷脂、固醇" +
                "类等，对神经系统和身体发育有非常好的作用，深受人们的喜爱。");
    }


    public void cook() {
        System.out.print("炒一炒鸡蛋\t");
    }


    public boolean check() {
        return (Math.random() < 0.5);
    }
}
