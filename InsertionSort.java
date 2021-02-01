package sort;

public class InsertionSort {
	static void sort(int arr[]) {
		int arrSize =arr.length; //�迭 ũ�� ����
		for(int i=1;i<arrSize;i++) {//�迭 ũ��-1 ��ŭ ���� ����
			int key=arr[i]; //key�� ���� �� ����
			int j=i; 
			
			while(j>0 && arr[j-1]>key) { //�� ���� ���� ������ ũ��
				arr[j]=arr[j-1]; //���� ��ġ�� ���� �� ����
				j=j-1; //�̶� arr[j]�� ���� ���� ���� ��
			}
			if(j!=i) { // ?
				arr[j]=key; //�� ��ġ�� ���簪 ����
			}
		}
	}
	
	static void printArray(int arr[]) { //�迭 ����ϴ� �޼ҵ�
		int arrSize=arr.length;
		for(int i=0;i<arrSize;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16}; //���� �迭 ����
		
		printArray(arr); //�� �迭
		System.out.println();
		sort(arr); //���� ����
		printArray(arr); //���� �� �迭
	}

}
