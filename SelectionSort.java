package sort;

public class SelectionSort {
	static void sort(int arr[]) {
		int arrsize=arr.length;
		
		for(int i=0;i<arrsize-1;i++) { // 기준이 될 숫자 선정
			int min_idx=i;
			for(int j=i+1;j<arrsize;j++) {// 정렬된 앞 인덱스 제외하고 수행
				if(arr[j]<arr[min_idx]) {// 현재 인덱스j의 값이 기준보다 작으면
					min_idx=j;// 기준값은 j
				}
			}
			if(min_idx!=i) {// 설정된 기준값이 바뀌었다면 기준값과 인덱스 변경
				int temp=arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
			}
		}
	}

	static void printArray(int arr[]) {//배열출력
		int arrsize = arr.length;

		for (int i = 0; i < arrsize; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort SelectionSort = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		printArray(arr);
		SelectionSort.sort(arr);
		System.out.println();
		printArray(arr);
	}

}
