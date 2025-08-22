import java.util.Scanner;
public class SubstringCheck {
    public static void main(String[] args) {
        System.out.println("Enter your main string.");
        Scanner sc=new Scanner(System.in);
        String MainString=sc.nextLine();
        int m=MainString.length();
        System.out.println("Enter your sub-string");
        String SubString=sc.nextLine();
        int n=SubString.length();
        boolean found=false;
        for(int i=0; i<=(m-n); i++){
            int count =0;

            for(int j=0; j<n; j++){
                if(MainString.charAt(i+j)==SubString.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==n){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Found sub-String: "+SubString);
        }
        else{
            System.out.println("Sub-string now found");
        }
    }
}
