public class SegundaLeyNewton {

    public static void peso() {
        Scanner tecladoMasa = new Scanner(System.in);
        Scanner tecladoPlaneta = new Scanner(System.in);
        Scanner tecladon = new Scanner(System.in);
        int m;
        char continuar = 'Y' ;
final double GRAVEDADMARTE = 3.72, GRAVEDADTIERRA = 9.8, GRAVEDADJUPITER = 24.79, GRAVEDADSATURNO = 10.44, GRAVEDADVENUS = 8.87, GRAVEDADMERCURIO = 3.7;

        do {
            System.out.println("Donde quieres calculaar tu peso ? : 1 = MARTE, 2 = TIERRA, 3 = JUPITER, 4 = SATURNO, 5 = VENUS o MERCURIO = 6?");
            int planeta;
            planeta = tecladoPlaneta.nextInt();

            switch (planeta) {
                case 1:

                    System.out.println("Introduce tu masa en KG: ");
                    m = tecladoMasa.nextInt();
                    System.out.println("Tu peso en Venus es de :" + m * GRAVEDADMARTE + " N");
                    break;
                case 2:

                    System.out.println("Introduce tu masa en KG : ");
                    m = tecladoMasa.nextInt();
                    System.out.println("Tu peso en Venus es de :" + m * GRAVEDADTIERRA + " N");
                    break;
                case 3:

                    System.out.println("Introduce tu masa en KG : ");
                    m = tecladoMasa.nextInt();
                    System.out.println("Tu peso en Venus es de :" + m * GRAVEDADJUPITER + " N");
                    break;
                case 4:

                    System.out.println("Introduce tu masa en KG : ");
                    m = tecladoMasa.nextInt();
                    System.out.println("Tu peso en Venus es de :" + m * GRAVEDADSATURNO + " N");
                    break;
                case 5:

                    System.out.println("Introduce tu masa en KG : ");
                    m = tecladoMasa.nextInt();
                    System.out.println("Tu peso en Venus es de :" + m * GRAVEDADVENUS + " N");
                    break;
                 case 6:

                    System.out.println("Introduce tu masa en KG : ");
                    m = tecladoMasa.nextInt();
                    System.out.println("Tu peso en Mercurio es de :" + m * GRAVEDADMERCURIO + " N");
                    break;

                default:
                    System.out.println("La masa de este planeta no es posible calcularla");
            }
            System.out.println("Desea continuar Y/N?");
            continuar = tecladon.next().charAt(0);

        } while (continuar != 'N'
    

);

}

}
