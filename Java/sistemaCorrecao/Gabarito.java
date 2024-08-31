import java.util.ArrayList;
import java.util.Scanner;


public class Gabarito{

    static ArrayList<String> listQuestao = new ArrayList<>();
    Scanner ler = new Scanner(System.in);

    private void preencher(){
        for(int a=1;a<=15;a++){
            String resp = ler.nextLine();
            listQuestao.add(resp);
        }
    }
    public String respostaQuestao(int num){
        
        
    }
}