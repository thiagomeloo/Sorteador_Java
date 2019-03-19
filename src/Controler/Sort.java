package Controler;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author thiago
 */
public class Sort {


    
    //metodo para gerar uma lista de elementos com intervalo do menor ao maior
    public ArrayList gera(int menor, int maior) {
        ArrayList lista = new ArrayList();
        if(menor > maior){
            return new ArrayList();
        }else{
            for (int i = menor; i <= maior; i++) {
                lista.add(i);
            }
        }
        return lista;
    }
    
    //metodo para sortear n elementos de uma lista passada
    public ArrayList sorted(int qtd,ArrayList l) {
        Random r = new Random();
        ArrayList lista = new ArrayList();
        int n;
        if (qtd > l.size()) {
            
            return new ArrayList();
        } else {
            for (int i = 0; i < qtd; i++) {
                n = r.nextInt(l.size());
                lista.add(l.get(n));
                l.remove(n);
            }
        }

        return lista;
        
    }
    

    
    
    
    
}
