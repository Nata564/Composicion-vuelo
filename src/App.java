public class App {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("AV001", "Bogota", "Medellin", 5);
        
        vuelo1.mostrarInfo();
        vuelo1.embarcar("A1");
        vuelo1.embarcar("A2");
        vuelo1.embarcar("A3");

        vuelo1.embarcar("A1");
        vuelo1.mostrarAsientos();
        vuelo1.desembarcar("A2");

        vuelo1.mostrarAsientos();


        System.out.println("   ");

        Vuelo vuelo2 = new Vuelo("AV002", "Bogota", "Cali", 5);
        Vuelo vuelo3 = new Vuelo("AV003", "Bogota", "Cartagena", 5);
        Vuelo vuelo4 = new Vuelo("AV004", "Bogota", "Barranquilla", 5);


        Vuelo[] vuelos = {vuelo2, vuelo3, vuelo4};


        for (Vuelo vuelo : vuelos) {

            vuelo.mostrarInfo();

            vuelo.embarcar("A1");
            vuelo.embarcar("A2");
            vuelo.embarcar("A3");

            vuelo.embarcar("A1");

            vuelo.mostrarAsientos();

            vuelo.desembarcar("A2");

            vuelo.mostrarAsientos();

            System.out.println("");
        }
    }
}
