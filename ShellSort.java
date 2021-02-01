package sort;

public class ShellSort {
	void insertSort(int list[], int first, int last, int gap) {
		int i, j, key;
		
		for(i=first+gap ; i<=last ; i=i+gap) { //gap만큼 띄운 리스트 생성
			key=list[i]; //key에 띄운 리스트의 값 저장
			
			for(j=i-gap;j>=first&&list[j]>key;j=j-gap) {
				list[j+gap]=list[j];
			}  // ?
			list[j+gap]=key; //?
		}
	}
	void shell_sort(int list[],int arrSize) {
		int i,gap;
		
		for(gap=arrSize/2; gap>0;gap=gap/2) { //gap을 절반씩 줄임
			if((gap%2)==0) { //짝수면
				gap++; //+1
			}
			for(i=0;i<gap;i++) { //gap만큼 띄운 리스트로 정렬
				insertSort(list,i,arrSize-1,gap);
			}
		}
	}
	static void printArray(int list[]) { //리스트 출력 메소드
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]= {10,8,6,20,4,3,22,1,0,15,16}; //임의 리스트 생성
		int arrSize=list.length;
		
		printArray(list); //정렬 전 리스트 출력
		ShellSort shellSort = new ShellSort(); //객체 생성
		shellSort.shell_sort(list, arrSize); //셸 정렬
		printArray(list); //정렬 후 리스트 출력
	}

}
