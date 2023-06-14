public abstract class GestaoMateriais {

    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public abstract double getVolume();
    public abstract double getPeso();
    public abstract double getCusto();
    public abstract String toString();
    public abstract double calcularCusto();
}
