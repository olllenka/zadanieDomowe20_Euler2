public class Euler {

    public int sum(int maxElementValue){
        int sum = 0;
        int element1 = 0;
        int element2 = 1;

        while(element2 <= maxElementValue){
            element2 += element1;
            element1 = element2 - element1;
            if(element2 % 2 == 0)
                sum += element2;
        }
        return sum;
    }
}
