class Dish2 extends Dish {
    public Dish2() {
        super(15, "面条");
    }

    @Override
    public void profile() {
        System.out.println("面条很好吃大家都爱吃");
    }


    public void cook() {
        System.out.print("炒一炒面条\t");
    }


    public boolean check() {
        return (Math.random() < 0.5);
    }
}

