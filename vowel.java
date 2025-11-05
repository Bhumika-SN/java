public class vowel {
    public static void main ( String []args)
    {
        char c = 'd';
        // Convert to lowercase to handle both upper & lower case letters
        c = Character.toLowerCase(c);

        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u' ) {
            System.out.println( c + " is a vowel ");
        } 
        else if ( c >=  'a' &&  c <= 'z' ) 
        {  
            System.out.println ( c+ " is constant");
            
            }
            else 
            {
                System.out.println( " nayavag ako alphabets na... ");
            }
        }
    }
    

