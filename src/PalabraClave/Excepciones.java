package PalabraClave;

class Excepciones extends Exception {
    public Excepciones(String mensaje) {
        super(mensaje);
    }
}

class Cantidad extends Exception{
    public Cantidad(String mensaje) {
        super(mensaje);
    }
}

class LetraEquivocada extends Exception {
    public LetraEquivocada(String mensaje) {
        super(mensaje);
    }
}
