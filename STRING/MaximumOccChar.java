import java.util.Scanner;
class MaximumOccChar{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int[] arr = new int[127];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]= arr[str.charAt(i)]+1;
        }
        int max = -1;
        char ch = ' ';
        for(int i=0;i<str.length();i++){
            if(max<arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        System.out.println("The maximum occuring character is : "+ch);
    }
}