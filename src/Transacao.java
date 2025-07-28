import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private LocalDateTime data;
    private String tipo;
    private double valor;

    public Transacao(String tipo, double valor) {
        this.data = LocalDateTime.now(); // A mágica acontece aqui!
        this.tipo = tipo;
        this.valor = valor;
    }

    public Transacao(LocalDateTime data, String tipo, double valor) {
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getDetalhes(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada =  this.data.format(formatador);
        return  String.format ("%s -%-10s: R$ %.2f",  dataFormatada, this.tipo, this.valor);
    }

}
