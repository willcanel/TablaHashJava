public class Main {

    public static void main(String[] args){
        TablaHash tabla = new TablaHash();

        for (Integer valor = -10; valor <= 10;valor++){
            tabla.insertar(valor);
        }
    }
}
