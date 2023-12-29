public class ispalin {
    static boolean IsPalindrome(String str){
            for(int i=0;i<str.length()/2;i++){
                int n=str.length();
                if(str.charAt(i) != str.charAt(n-i-1)){
                    return false;
                }
            }
return true;
        }
    public static void main(String[] args) {
        String s="madam";
        if(IsPalindrome(s)==false){
            System.out.println("STRING IS NOT PALINDROME");
        }
        else{
            System.out.println("STRING IS PALINDROME");
        }
        
        }
    }


