class Solution {
    public int romanToInt(String s) {
        int dec = 0;
        s += " ";
        for(int i = 0;i<s.length()-1;i++)
        {
            char symbol = s.charAt(i+1);
            switch(s.charAt(i)){
                case 'I':
                    if(symbol == 'I' || symbol == ' ')
                    {
                        dec++;
                        break;
                    }
                    else
                    {
                        dec--;
                        break;
                    }
                case 'V':
                    dec += 5;
                    break;
                case 'X':
                    if(symbol == 'L'||symbol == 'C')
                    {
                        dec -=10;
                        break;
                    }
                    else
                    {
                        dec +=10;
                        break;
                    }
                case 'L':
                    dec += 50;
                    break;
                case 'C':
                    if(symbol == 'D'||symbol == 'M')
                    {
                        dec -=100;
                        break;
                    }
                    else
                    {
                        dec +=100;
                        break;
                    }
                case 'D':
                    dec += 500;
                    break;
                case 'M':
                    dec += 1000;
                    break;
            }
        }
        if(dec <4000 && dec > 0)
            return dec;
        else
            return -1;
    }
}