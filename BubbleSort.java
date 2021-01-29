package sort;

public class BubbleSort {
	void bubblesort(int arr[]) {
		int arrsize=arr.length; //n에 배열 크기 저장
		
		for(int i=0;i<arrsize-1;i++) { //n-1의 수만큼 정렬
			for(int j=0;j<arrsize-i-1;j++) { //다 정렬 된 맨 뒷부분 빼기 위해 n-i-1
				if(arr[j]>arr[j+1]) { //내림차순은 부등호 반대
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}//앞이 더 크면 순서뒤집
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
		BubbleSort BubbleSort=new BubbleSort(); //버블솔트 객체 생성
		int arr[]= {64,34,25,12,22,11,90};
		BubbleSort.bubblesort(arr); //arr 버블정렬
		BubbleSort.printArray(arr); //arr 출력 
	}
}