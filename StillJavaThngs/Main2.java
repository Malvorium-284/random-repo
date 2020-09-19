package StillJavaThngs;

class Main2 extends Main {

    protected int age = super.age;

     public void PositiveTransform(Transformer a) {
        a.jumpstarterOne();
        System.out.println("From origin point " + super.age + " to transformed point " + a.getTotal());
    }

     protected void NegativeTransform(Transformer a) {
        a.jumpstarterTwo();
        System.out.println("From origin point " + super.age + " to transformed point " + a.getTotal());
    }
}