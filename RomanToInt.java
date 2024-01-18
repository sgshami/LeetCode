//Written & Tested on LeetCode
class RomanToInt {
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.substring(i, i + 1)) {
                case "I":
                    num++;
                    break;
                case "V":
                    num += 5;
                    break;
                case "X":
                    num += 10;
                    break;
                case "L":
                    num += 50;
                    break;
                case "C":
                    num += 100;
                    break;
                case "D":
                    num += 500;
                    break;
                case "M":
                    num += 1000;
                    break;
            }
            if(i+2 <= s.length()){
                switch(s.substring(i, i+2)){
                    case "IV":
                        System.out.println("IV");
                        num += 3;
                        i++;
                        break;
                    case "IX":
                        System.out.println("IX");
                        num += 8;
                        i++;
                        break;
                    case "XL":
                        System.out.println("XL");
                        num += 30;
                        i++;
                        break;
                    case "XC":
                        System.out.println("XC");
                        num += 80;
                        i++;
                        break;
                    case "CD":
                        System.out.println("CD");
                        num += 300;
                        i++;
                        break;
                    case "CM":
                        System.out.println("CM");
                        num += 800;
                        i++;
                        break;
                }
            }
        }
        return num;
    }
}
