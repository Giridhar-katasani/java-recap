package quiz;

class SuperClass {
    SuperClass() {
        foo();
    }

    public void foo() {
        System.out.println("In SuperClass.foo()");
    }
}

class SubClass extends SuperClass {
    private String member;

    public SubClass() {
        member = "HI";
    }

    public void foo() {
        System.out.println("In SubClass.foo(): ");
    }
}

public class Test {
    public static void main(String[] args) {
        SuperClass reference = new SubClass();
        reference.foo();
    }
}
