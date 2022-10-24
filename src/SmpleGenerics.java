public class SmpleGenerics {
    public  <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        SmpleGenerics gm= new SmpleGenerics();
        gm.f(1);
        gm.f(1.0);
        gm.f('c');
        gm.f(1.00f);
        gm.f("Hle Generix");
        gm.f(gm);
    }
}
