package sort;

public class MergeSort {
	public static void mergeSort(int arr[],int left, int right){ // 리스트 최종 정렬
		if(left<right) { //만약 앞의 리스트가 뒤의 리스트보다 크기? 사이즈?가 작으면
			int mid=(left+right)/2; //중간값 도출
			mergeSort(arr,left,mid); //앞의 리스트 정렬
			mergeSort(arr,mid+1,right); //뒤의 리스트 정렬
			merge(arr,left,mid,right); //두개 합체~파워레인저~
		}
	}
	
	public static void merge(int arr[], int start, int mid, int end) { // 리스트 정렬 메소드
		int i = start; //앞의 리스트 시작값 저장
		int j = mid+1; //뒤의 리스트 시작값 저장
		int k = start; //?
		
		int idx[]=new int[arr.length]; //정렬 완료 값 담는 객체 생성
		while(i<=mid && j<=end) {//앞의 리스트 시작값이 중간값 이하고, 뒤의 리스트 시작값이 끝의 값 이하일 동안 
			if(arr[i]<arr[j]) { //만약 앞의 리스트 값이 뒤의 리스트 값보다 작으면
				idx[k++]=arr[i++]; //리스트 위치 한칸 뒤로, 그리고 거기에 첫번째 리스트의 다음 값 저장
			}else {
				idx[k++]=arr[j++]; //리스트 위치 한칸 뒤로하고 두번째 리스트의 다음 값 저장
			}
		}
		while(i<=mid) { //첫번째 리스트 값이 중간값 이하면
			idx[k++]=arr[i++]; //인덱스 한칸 뒤로 옮기고 첫번째의 그 다음 값 저장
		}
		while(j<=end) { //두번째 리스트의 값이 끝값 이하면
			idx[k++]=arr[j++]; //인덱스 한칸 뒤로, 거기 두번째의 그 다음 값 저장
		}
		
		for(int t=start; t<=end;t++) { 
			arr[t]=idx[t]; //정렬 완료 한 값 arr에 저장
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
