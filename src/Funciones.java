public class Funciones {
    public static void main(String[] args) {
        double y=3;
        int i=1,j=2,k=3,m=2;
        System.out.println((j>=i)||(k==m));

        int x=1;
        while(x<=10){
            System.out.println(++x);
        }

        double area = circleArea(y);
        System.out.println(area);

        circleArea(y);
        sphereArea(y);
        sphereVolume(y);

        System.out.println("pesos a dolares: " + convertToDolar(1000,"COP"));

    }

    public static double circleArea(double r){
        return Math.PI*Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    /**
     * Descripcion: convertir a dolares
     * @param quantity cantidad de dinero
     * @param currency tipo de cambio de moneda, solo para MXN y COP
     * @return quanity devuelve la cantidad actualizada
     */
    public static double convertToDolar(double quantity,String currency){
        switch (currency){
            case "MXN":
                quantity=quantity*0.052;
                break;
            case "COP":
                quantity=quantity*0.00031;
                break;
        }
        return quantity;
    }
}
