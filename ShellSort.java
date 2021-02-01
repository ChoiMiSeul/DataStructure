package sort;

public class ShellSort {
	void insertSort(int list[], int first, int last, int gap) {
		int i, j, key;
		
		for(i=first+gap ; i<=last ; i=i+gap) { //gap��ŭ ��� ����Ʈ ����
			key=list[i]; //key�� ��� ����Ʈ�� �� ����
			
			for(j=i-gap;j>=first&&list[j]>key;j=j-gap) {
				list[j+gap]=list[j];
			}  // ?
			list[j+gap]=key; //?
		}
	}
	void shell_sort(int list[],int arrSize) {
		int i,gap;
		
		for(gap=arrSize/2; gap>0;gap=gap/2) { //gap�� ���ݾ� ����
			if((gap%2)==0) { //¦����
				gap++; //+1
			}
			for(i=0;i<gap;i++) { //gap��ŭ ��� ����Ʈ�� ����
				insertSort(list,i,arrSize-1,gap);
			}
		}
	}
	static void printArray(int list[]) { //����Ʈ ��� �޼ҵ�
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]= {10,8,6,20,4,3,22,1,0,15,16}; //���� ����Ʈ ����
		int arrSize=list.length;
		
		printArray(list); //���� �� ����Ʈ ���
		ShellSort shellSort = new ShellSort(); //��ü ����
		shellSort.shell_sort(list, arrSize); //�� ����
		printArray(list); //���� �� ����Ʈ ���
	}

}
