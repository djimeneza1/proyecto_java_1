public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended=3;
        if (isBluetoothEnabled){
            fileSended++;
            System.out.println("archivo enviado");

        }else{
            System.out.println("Por favor enciende tu bluetooth");
        }
    }
}
