public class App {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("AV001", "Bogota", "Medellin", 5);
        
        System.out.println("----Informacion del vuelo----");
        vuelo1.mostrarInfo();
System.out.println("----Embarque---------");        
        vuelo1.embarcar("A1");
        vuelo1.embarcar("A2");
        vuelo1.embarcar("A3");
System.out.println("--------------");
        vuelo1.embarcar("A1");
System.out.println("-------informacion asientos-------");
        vuelo1.mostrarAsientos();
        System.out.println("--------------");
        vuelo1.desembarcar("A2");
System.out.println("-------informacion asientos-------");
        vuelo1.mostrarAsientos();


        System.out.println("----VUELOS------");

        Vuelo vuelo2 = new Vuelo("AV002", "Bogota", "Cali", 5);
        Vuelo vuelo3 = new Vuelo("AV003", "Bogota", "Cartagena", 5);
        Vuelo vuelo4 = new Vuelo("AV004", "Bogota", "Barranquilla", 5);


        Vuelo[] vuelos = {vuelo2, vuelo3, vuelo4};


        for (Vuelo vuelo : vuelos) {
System.out.println("----Informacion del vuelo----");
            vuelo.mostrarInfo();
System.out.println("----Embarque---------"); 
            vuelo.embarcar("A1");
            vuelo.embarcar("A2");
            vuelo.embarcar("A3");
System.out.println("--------------");
            vuelo.embarcar("A1");
System.out.println("-------informacion asientos-------");
            vuelo.mostrarAsientos();
System.out.println("--------------");
            vuelo.desembarcar("A2");
System.out.println("-------informacion asientos-------");
            vuelo.mostrarAsientos();
        }
    }
}
sfhdfhdfhsd