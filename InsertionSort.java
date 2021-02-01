package sort;

public class InsertionSort {
	static void sort(int arr[]) {
		int arrSize =arr.length; //배열 크기 저장
		for(int i=1;i<arrSize;i++) {//배열 크기-1 만큼 정렬 실행
			int key=arr[i]; //key에 현재 값 저장
			int j=i; 
			
			while(j>0 && arr[j-1]>key) { //내 앞의 값이 나보다 크면
				arr[j]=arr[j-1]; //현재 위치에 앞의 값 저장
				j=j-1; //이때 arr[j]는 기존 값의 앞의 값
			}
			if(j!=i) { // ?
				arr[j]=key; //그 위치에 현재값 저장
			}
		}
	}
	
	static void printArray(int arr[]) { //배열 출력하는 메소드
		int arrSize=arr.length;
		for(int i=0;i<arrSize;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16}; //임의 배열 생성
		
		printArray(arr); //원 배열
		System.out.println();
		sort(arr); //삽입 정렬
		printArray(arr); //정렬 후 배열
	}

}
