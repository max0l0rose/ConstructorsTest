public class Main {
    public static void main(String[] args) {
        Father father = new Son();
    }
}

class Father {
    private String name = "father";
    public Father() {
        who(); /// LOOOOOOOOOOOL
        tell(name);
    }

    public void who() {
        System.out.println("this is father");
    }

    public void tell(String name) {
        System.out.println("this is " + name);
    }
}

class Son extends Father {
    private String name = "son";
    public Son() {
        who();
        tell(name);
    }

    public void who() {
        System.out.println("this is son");
    }

    public void tell(String name) {
        System.out.println("this is " + name);
    }
}