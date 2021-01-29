package sort;

public class SelectionSort {
	static void sort(int arr[]) {
		int arrsize=arr.length;
		
		for(int i=0;i<arrsize-1;i++) { // ������ �� ���� ����
			int min_idx=i;
			for(int j=i+1;j<arrsize;j++) {// ���ĵ� �� �ε��� �����ϰ� ����
				if(arr[j]<arr[min_idx]) {// ���� �ε���j�� ���� ���غ��� ������
					min_idx=j;// ���ذ��� j
				}
			}
			if(min_idx!=i) {// ������ ���ذ��� �ٲ���ٸ� ���ذ��� �ε��� ����
				int temp=arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
			}
		}
	}

	static void printArray(int arr[]) {//�迭���
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
