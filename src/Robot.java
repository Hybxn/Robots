public class Robot {

    private static int numero = 0;
    private String alias;
    private int altura;
    private ColorPrincipal color;
    private Posicion posicion;
    private Piloto piloto;

    public Robot(String alias, int altura, ColorPrincipal color, Piloto piloto){
        numero ++;
        setAlias(alias);
        setAltura(altura);
        setColor(color);
        setPosicion(new Posicion());
        setPiloto(piloto);
    }

    public String getAlias() {
        return alias;
    }

    private void setAlias(String alias) {
        assert alias != null : "El alias no puede ser nulo.";
        assert !(alias.isEmpty()) : "El alias no puede estar vacio.";
        assert !(alias.isBlank()) : "El alias no puede ser un espacio en blanco.";
        this.alias = alias.toUpperCase();
    }

    public int getAltura() {
        return altura;
    }

    private void setAltura(int altura) {
        assert altura >= 0 : "La altura no puede ser negativa";
        this.altura = altura;
    }

    public ColorPrincipal getColor() {
        return color;
    }

    private void setColor(ColorPrincipal color) {
        assert color != null : "El color principal del robot no puede ser nulo.";
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    private void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
