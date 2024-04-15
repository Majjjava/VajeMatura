public class Krog {
    private double polmer;
    public Krog(){
        polmer = 0;
    }

    public Krog(double x){
        polmer = x;
    }

    public double IzracunObseg(){
        double obseg = (Math.PI*2*polmer);
        return obseg;
    }
    public double IzracunPloscina(){
        double ploscina = (Math.PI*Math.PI*polmer);
        return ploscina;
    }
    public double IzracunPremer(){
        double premer = (polmer*2);
        return premer;
    }
    public void Izpis(){
        System.out.println("Obseg je "+IzracunObseg());
        System.out.println("Ploscina je "+IzracunPloscina());
        System.out.println("Premer je "+IzracunPremer());
    }
}
