class Solution {
    public String intToRoman(int num) {
        String roman = "";
        while(num >= 1000){
            roman += "M";
            num -= 1000;
        }
        //System.out.println("Roman Numeral: " + roman + "\n Num: " + num + "\n Num/100: " + num/100);

        //Hundreds
        switch(num/100){
            case 1: roman += "C";
                    num -= 100;
                    break;                    
            case 2: roman += "CC";
                    num -= 200;   
                    break;                 
            case 3: roman += "CCC";
                    num -= 300;    
                    break;                
            case 4: roman += "CD";
                    num -= 400;     
                    break;               
            case 5: roman += "D";
                    num -= 500;     
                    break;               
            case 6: roman += "DC";
                    num -= 600;      
                    break;              
            case 7: roman += "DCC";
                    num -= 700;        
                    break;            
            case 8: roman += "DCCC";
                    num -= 800;       
                    break;             
            case 9: roman += "CM";
                    num -= 900;
                    break;                    
            case 0: break;
        }
        //System.out.println("Roman Numeral: " + roman + "\n Num: " + num + "\n Num/10: " + num/10);

        //Tens
        switch(num/10){
            case 1: roman += "X";
                    num -= 10;
                    break;                    
            case 2: roman += "XX";
                    num -= 20;  
                    break;                  
            case 3: roman += "XXX";
                    num -= 30;  
                    break;                  
            case 4: roman += "XL";
                    num -= 40;   
                    break;                 
            case 5: roman += "L";
                    num -= 50; 
                    break;                   
            case 6: roman += "LX";
                    num -= 60;
                    break;                    
            case 7: roman += "LXX";
                    num -= 70;
                    break;  
            case 8: roman += "LXXX";
                    num -= 80;
                    break;   
            case 9: roman += "XC";
                    num -= 90;
                    break;   
            case 0: break;
        }
        //System.out.println("Roman Numeral: " + roman + "\n Num: " + num);

        //Ones
        switch(num){
            case 1: roman += "I";
                    num -= 1;
                    break; 
            case 2: roman += "II";
                    num -= 2;
                    break;
            case 3: roman += "III";
                    num -= 3;
                    break;
            case 4: roman += "IV";
                    num -= 4;
                    break;  
            case 5: roman += "V";
                    num -= 5;
                    break;  
            case 6: roman += "VI";
                    num -= 6;
                    break; 
            case 7: roman += "VII";
                    num -= 7;
                    break;
            case 8: roman += "VIII";
                    num -= 8;
                    break;     
            case 9: roman += "IX";
                    num -= 9;
                    break;
            case 0: break;
        }
        return roman;
    }
    public static void main(String[] args) {
        Solution number = new Solution();
        //System.out.println(number.intToRoman(1000));  // M
        //System.out.println(number.intToRoman(900));   // XC
        //System.out.println(number.intToRoman(800));   // DCCC
        System.out.println(number.intToRoman(1111));  //
        //number.intToRoman(1111);
    }
}

/*
12. Integer to Roman

Convert an integer to a roman numeral

M is 1000
D is 500
C is 100
L is 50
X is 10
V is 5
I is 1

*/