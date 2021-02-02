package sort;

public class MergeSort {
	public static void mergeSort(int arr[],int left, int right){ // ����Ʈ ���� ����
		if(left<right) { //���� ���� ����Ʈ�� ���� ����Ʈ���� ũ��? ������?�� ������
			int mid=(left+right)/2; //�߰��� ����
			mergeSort(arr,left,mid); //���� ����Ʈ ����
			mergeSort(arr,mid+1,right); //���� ����Ʈ ����
			merge(arr,left,mid,right); //�ΰ� ��ü~�Ŀ�������~
		}
	}
	
	public static void merge(int arr[], int start, int mid, int end) { // ����Ʈ ���� �޼ҵ�
		int i = start; //���� ����Ʈ ���۰� ����
		int j = mid+1; //���� ����Ʈ ���۰� ����
		int k = start; //?
		
		int idx[]=new int[arr.length]; //���� �Ϸ� �� ��� ��ü ����
		while(i<=mid && j<=end) {//���� ����Ʈ ���۰��� �߰��� ���ϰ�, ���� ����Ʈ ���۰��� ���� �� ������ ���� 
			if(arr[i]<arr[j]) { //���� ���� ����Ʈ ���� ���� ����Ʈ ������ ������
				idx[k++]=arr[i++]; //����Ʈ ��ġ ��ĭ �ڷ�, �׸��� �ű⿡ ù��° ����Ʈ�� ���� �� ����
			}else {
				idx[k++]=arr[j++]; //����Ʈ ��ġ ��ĭ �ڷ��ϰ� �ι�° ����Ʈ�� ���� �� ����
			}
		}
		while(i<=mid) { //ù��° ����Ʈ ���� �߰��� ���ϸ�
			idx[k++]=arr[i++]; //�ε��� ��ĭ �ڷ� �ű�� ù��°�� �� ���� �� ����
		}
		while(j<=end) { //�ι�° ����Ʈ�� ���� ���� ���ϸ�
			idx[k++]=arr[j++]; //�ε��� ��ĭ �ڷ�, �ű� �ι�°�� �� ���� �� ����
		}
		
		for(int t=start; t<=end;t++) { 
			arr[t]=idx[t]; //���� �Ϸ� �� �� arr�� ����
		}
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {6,3,7,1,2,9,11,13};
		printArray(arr);
		System.out.println();
		mergeSort(arr,0,arr.length-1);
		printArray(arr);
	}
}
