package Mas;

public class Ten {
	public static int array[] = {1,225,33,2,5,69,777};
	public static void StartAnd(){
		int andIndex = array.length-1;
		int startIndex = 0;
		doSort(startIndex, andIndex);
	}
	private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }
	

	public static void main(String[] args) {
		
		
		
		
		for (int i=0;i<array.length; i++){
			System.out.print(array[i]+" ");

		}	
	}	
}