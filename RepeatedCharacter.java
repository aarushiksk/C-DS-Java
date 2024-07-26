public class RepeatedCharacter {
    public static void main(String[] args) {
        int arr[]=new int[26];
        String name="Pawam Sharma";
        int count=0,dup=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                arr[name.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                System.out.println((char)(i+'a')+" is repeated "+arr[i]+" times");
            }
        }
    }
}
