import java.util.Arrays;

public class SockMerchant {

    static boolean verifyContraits(int n, int[] ar){
        boolean aux_verify = false;

        if(n >= 1 && n <= 100)
            aux_verify = true;

        for(int i = 0 ;i < n;i++){
            if(ar[i] >=1 && ar[i]<=100)
                aux_verify = true;
        }

        return  aux_verify;
    }

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int aux_cont = 0;

        if(verifyContraits(n,ar)){
            Arrays.sort(ar);
            for(int i = 1; i <= n-1 ; i++){
                if(i%2 != 0){
                    if(ar[i-1] == ar[i])
                        aux_cont = aux_cont+1;
                }

            }
        }

        return aux_cont;

    }

}