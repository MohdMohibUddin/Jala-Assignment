//7. Write a function to insert an element at a specific position in the array
public class insertelement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int pos = 1;         
        int value = 15;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos)
                newArr[i] = value;
            else
                newArr[i] = arr[j++];
        }

        for (int i : newArr)
            System.out.print(i + " ");  
    }   
}
