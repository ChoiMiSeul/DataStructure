package sort;

public class HeapSort {
	private static int[] arr; //�迭 ����
	private static int number=10; //�迭 ũ��
	
	public static void heap(int[] arr, int number) {
		for(int i=1;i<number;i++) { //��� �迭 ��ġ�� ����
			int child=i; //�ڽĿ� i�� ����
			while(child>0) { //�ڽ��� 0���� Ŭ ���� 
				int parent=(child-1)/2; //???�θ�� (�ڽ�-1)/2  ��?
				if(arr[child]>arr[parent]){ //�ڽ��� ���� �θ��� ������ ũ�� ��ȯ
					int tmp=arr[parent];
					arr[parent]=arr[child];
					arr[child]=tmp;
				}
				child=parent; //�ڽĿ� �θ� ����
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr=new int[number]; //ũ�� 10��ŭ�� arr
		for(int i=0;i<number;i++) { //10���� ���� arr�� ����
			arr[i]=(int)(Math.random()*100);
		}
		printArray(arr); //���� ��
		
		for(int i=number-1;i>0;i--) { // ��� �迭 Ŀ���� ����, ���� �� �迭����
			int tmp=arr[0]; //���� ū ����(root)�� ������ �迭���� ��ȯ
			arr[0]=arr[i];
			arr[i]=tmp;
			
			heap(arr, i); //���� �ް� �����ϰ� ��
		}
		System.out.println();
		printArray(arr);
	}

}
