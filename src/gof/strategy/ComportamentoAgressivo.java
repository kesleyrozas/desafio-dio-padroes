package gof.strategy;

public class ComportamentoAgressivo implements Comportamento{


    @Override
    public void mover() {
        System.out.println("Est� sem movendo agressivo");
    }
}
