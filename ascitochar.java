public class ASCIIToString {
    public static void main(String args[]){
        int num[] = {65, 120, 98, 75, 115,66,67,68,69,85,99,100};
        String str =null;
        for(int i: num){
            str = Character.toString((char)i);
            System.out.println(str);
        }
    }
}