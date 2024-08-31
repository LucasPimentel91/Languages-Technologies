import java.util.Arrays;

public class Vetor {

    private String[] vetor;

    public Vetor(int tamanho){
            vetor = new String[tamanho];
    }

    public void insert(String frase){
        int largura = vetor.length;
        for(int i = 0; i < largura ; i++){
            if(vetor[i] == null){
                    verificarTamanho(i + 1);
                    vetor[i] = frase;
                    break;
            }
        }
            String valor = Arrays.toString(vetor);
            System.out.println(valor);
    }

    private  void verificarTamanho(int posicao){
            if(posicao >= vetor.length){
                String[] novoVetor = new String[posicao + 1];
                for (int i = 0; i < vetor.length; i++) {
                    novoVetor[i] = vetor[i];
                }
                vetor = novoVetor;
            }
        }

        public String get(int posicao){
            String valor;
            try{
                valor = vetor[posicao];
            } catch (Exception e){
                valor = null;
            }
            return valor;
        }

        public int size(){
            int tamanho = 0;
            for(String elemento : vetor){
                if(elemento != null) tamanho++;
            }
            return tamanho;
        }
    }
