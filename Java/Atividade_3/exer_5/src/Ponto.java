public class Ponto {
    private double x;
    private double y;

    public Ponto(){
        x = Math.ceil(Math.random() * 10);
        y = Math.ceil(Math.random() * 10);
        System.out.println(x + ", " + y);
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
        System.out.println(x + ", " + y);
    }

    public Ponto(double x){
        this.x = x;
        y = Math.ceil(x * Math.random() * 10);
        System.out.println(x + ", " + y);
    }
}

