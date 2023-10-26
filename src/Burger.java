public class Burger {

    public String bun;

    public boolean meat;
    public boolean meatCount;

    public String cheese;

    public String lettuce;

    public boolean mayonnaise;

    public Burger(String bun,boolean meat, boolean meatCount, String cheese, String lettuce, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.meatCount = meatCount;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
    System.out.println("Склад бургера з подвійним мясом: " + bun + " подвійне мясо=" + " " + cheese + " " + lettuce + " майонез=" + mayonnaise);
    }

    public Burger(String bun, boolean meat, String cheese, String lettuce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;

        System.out.println("Склад діетичного бургера: " + bun + " одне мясо=" + meat + " " + cheese + " " + lettuce);
    }

    public Burger(String bun, boolean meat, String cheese, String lettuce, boolean mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;

        System.out.println("Склад звичайного бургера: " + bun + " одне мясо=" + meat + " " + cheese + "  " + lettuce + " майонез=" + mayonnaise);
    }
}

