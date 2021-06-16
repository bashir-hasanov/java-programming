package day54_abstraction;

class Pizza extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("Restaurant prepares pizzas that can be found in the menu");
    }

    @Override
    public void serve() {
        System.out.println("Pizza ordered by customers are served in a well manner");
    }
}
