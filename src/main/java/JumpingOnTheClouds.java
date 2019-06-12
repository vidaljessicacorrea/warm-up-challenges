public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {

        int number_jumps = 0;
        int i = 0;
        while(i < c.length-1){
            if(i+2 < c.length && c[i + 2] == 0){
                i = i + 2;
                number_jumps++;
            }
            else{
                i++;
                number_jumps++;
            }
        }
        return number_jumps;
    }

}
