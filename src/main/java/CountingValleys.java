public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int counter_level=0;
        int counter_valleys=0;
        boolean below_sea = false;

        for(int i = 0 ; i < n -1; i++){
            char c = s.charAt(i);
            if (c == 85)
                counter_level = counter_level + 1;
            else
                counter_level = counter_level -1;

            if (counter_level < 0 && !below_sea){
                counter_valleys = counter_valleys + 1;
                below_sea = true;
            }

            if(counter_level >= 0)
                below_sea = false;
        }

        return counter_valleys;
    }

}
