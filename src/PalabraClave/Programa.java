package PalabraClave;

public class Programa {
    public static void main(String[] args) {
        PalabraClave palabraClave = new PalabraClave();
        try {
            palabraClave.ingresarPalabraClave();
        } catch (Excepciones | Cantidad | LetraEquivocada e) {
            System.out.println("Error: " +e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado: " +e.getMessage());
        }
    }
}
