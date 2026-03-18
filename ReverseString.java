public class ReverseString{

public static void main(String [] args){
    
    String name = "ArjunSarkar";

    //Bruteforce : TimeComplexity - O(n2) and SpaceComplexity - O(n)

        String reversedName ="";

        for(int i=name.length()-1;i>=0;i--){
            reversedName += name.charAt(i);
            //Everytime it creates new String
        }

        System.out.println("Reversed String Name  :  "+reversedName);
        System.out.println();


        //Optimal : TwoPointers TimeComplexity - O(n) and SpaceComplexity - O(n)


        char[] array = name.toCharArray();
        int left = 0;
        int right = array.length-1;

        while(left<right){
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        String name2 = new String(array);
       

        System.out.println("Reveresed String2  :  "+name2);
        System.out.println();


        //Best way to use StrinBuilder it will not Create new String Every time it append

        StringBuilder stringBuilder = new StringBuilder(name).reverse();

        System.out.println("Reversed String3  :  "+stringBuilder);

        //we can use loop
        //for(int i=name.length()-1;i>=0;i--){
        // stringBuilder.append(name.charAt(i));
        // stringBuilder.toString();


        }
        

}
}