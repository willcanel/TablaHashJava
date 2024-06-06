public class TablaHash {
        private final Integer longitud = 13; //para la funcion aritemetica modular se recomienda usar numeros primos y el mas cercano al tamaño de la tabla
        public TablaHash(){
        }
        private Integer hash(Integer k){
            Integer key = 0;
            key = (k & 0x7fffffff) % longitud; // el simbolo de porcentaje hace la funcion aritmetica modular/residuo
            return key;
        }

        public void insertar(Integer k){
            System.out.println(k+" tiene el valor hash: " + hash(k));
        }

}



