//#1704 - Determine if String Halves Are Alike
//Created on LeetCode. Tested on LeetCode.
class StringHalvesAlike {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        
        int a = 0;
        int b = 0;

        for(int i = 0; i < arr.length/2; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                a++;
        }

        for(int i = arr.length/2; i < arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                b++;
        }
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}
