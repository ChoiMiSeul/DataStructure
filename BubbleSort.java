package sort;

public class BubbleSort {
	void bubblesort(int arr[]) {
		int arrsize=arr.length; //n�� �迭 ũ�� ����
		
		for(int i=0;i<arrsize-1;i++) { //n-1�� ����ŭ ����
			for(int j=0;j<arrsize-i-1;j++) { //�� ���� �� �� �޺κ� ���� ���� n-i-1
				if(arr[j]>arr[j+1]) { //���������� �ε�ȣ �ݴ�
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}//���� �� ũ�� ��������
			}
		}
	}
	void printArray(int arr[]) {
		int arrsize=arr.length;
		
		for(int i=0;i<arrsize;i++) {
			System.out.print(arr[i]+" ");
		System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort BubbleSort=new BubbleSort(); //�����Ʈ ��ü ����
		int arr[]= {64,34,25,12,22,11,90};
		BubbleSort.bubblesort(arr); //arr ��������
		BubbleSort.printArray(arr); //arr ��� 
	}
}