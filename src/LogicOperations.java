public class LogicOperations {
    public static void main(String[] args) {
        int a=8;
        int b=5;

        //operadores de asignacion
        System.out.println("a es igual a b_->" + (a == b));
        System.out.println("a es diferente a b_->" + (a != b));

        //operadores relacionales
        System.out.println("a es mayor a b_->" + (a > b));
        System.out.println("a es menor a b_->" + (a < b));

        if (a==b){
            System.out.println("a es igual a b_->");

        }else if(a != b){
            System.out.println("a es diferente a b_->");
        }else if(a > b){
            System.out.println("a es mayor a b_->");
        }else if(a < b){
            System.out.println("a es menor a b_->");
        }




    }
}
