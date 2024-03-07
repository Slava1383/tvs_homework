public enum Profession {
    DIREKTOR(6),
    WORKER(3),
    HR(4);
    private int coeff;
    Profession(int coeff){
        this.coeff = coeff;
    }

    public int getCoeff() {
        return coeff;
    }
}
