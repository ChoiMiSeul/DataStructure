package sort;

public class HeapSort {
	private static int[] arr; //배열 선언
	private static int number=10; //배열 크기
	
	public static void heap(int[] arr, int number) {
		for(int i=1;i<number;i++) { //모든 배열 거치는 동안
			int child=i; //자식에 i값 저장
			while(child>0) { //자식이 0보다 클 동안 
				int parent=(child-1)/2; //???부모는 (자식-1)/2  왜?
				if(arr[child]>arr[parent]){ //자식의 값이 부모의 값보다 크면 교환
					int tmp=arr[parent];
					arr[parent]=arr[child];
					arr[child]=tmp;
				}
				child=parent; //자식에 부모 저장
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
		arr=new int[number]; //크기 10만큼의 arr
		for(int i=0;i<number;i++) { //10가지 난수 arr에 저장
			arr[i]=(int)(Math.random()*100);
		}
		printArray(arr); //정렬 전
		
		for(int i=number-1;i>0;i--) { // 모든 배열 커지는 동안, 제일 뒷 배열부터
			int tmp=arr[0]; //가장 큰 숫자(root)를 마지막 배열값과 교환 <<이건 왜 하는겨? 루트 빼놓을라고?  바로 힙하면 안댐?
			arr[0]=arr[i];
			arr[i]=tmp;
			
			heap(arr, i); //제일 뒷값 제외하고 힙
		}
		System.out.println();
		printArray(arr);
	}

}
