package ud5.apuntesherencia.ejemploabstract;

//clase abstracta, ya que uno de sus métodos, metodo2(), es abstracto

abstract class A {
    int x = 1;

    void metodo1() { //método implementado y heredados por las subclasen
        System.out.println("método1 definido en A");
    }

    abstract void metodo2(); //método abstracto para ser implementado por las subclases


    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        System.out.println("Valor de x en la clase B:" + b.x); //heredado de A

        b.metodo1(); //método heredado directamento de A
        b.metodo2(); //implementación del método2() abstracto de A

        c.metodo1(); //método heredado de directamente A
        c.metodo2(); //implementación del método2() abstracto de A

        A a = b;
        a.metodo2();
        a = c;
        a.metodo2();

    }

}

