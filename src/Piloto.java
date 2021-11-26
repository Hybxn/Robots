public class Piloto {

    private String alias;

    public Piloto(String alias){
        setAlias(alias);
    }

    private void setAlias(String alias){
        assert alias != null: "El alias no puede ser nulo.";
        assert !(alias.isEmpty()): "El alias no puede estar vacio.";
        assert !(alias.isBlank()): "El alias no puede ser un espacio en blanco.";
        assert alias.length() >= 3 : "La longitud minima del alias debe de ser de al menos 3 caracteres";
        this.alias = alias.toUpperCase();
    }

    public String getAlias() {
        return alias;
    }
}
