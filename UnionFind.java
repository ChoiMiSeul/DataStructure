package datastructure;

class Node{
	int parent; //����� �θ��� ���۷��� ����
	int rank; // 0���� �ʱ�ȭ
	public Node(int newParent, int newRank) {
		parent=newParent;
		rank=newRank;
	}
	public int getParent() {return parent;}
	public int getRank() {return rank;}
	public void setParent(int newParent) {parent=newParent;}
	public void setRank(int newRank) {rank=newRank;}
}

public class UnionFind {
	protected Node[] a;
	public UnionFind(Node[] iarray) {
		a=iarray;
	}
	
	protected int find(int i) { //��� i���� ���� ��Ʈ����
		if(i!=a[i].getParent())
			a[i].setParent(find(a[i].getParent())); //��λ��� �� ��尡 ����� �θ� �ǵ���
		return a[i].getParent(); //��� ��Ʈ���� �����
	} // ��λ��� ��� ���鿡 ���� �θ��带 ��Ʈ�� �����ϴ� ��� ���� ����
	public void union(int i, int j) {
		int iroot=find(i);
		int jroot=find(j);
		if(iroot==jroot) return;
		
		if (a[iroot].getRank()>a[jroot].getRank())
			a[jroot].setParent(iroot);
		else if (a[iroot].getRank()<a[jroot].getRank())
			a[iroot].setParent(jroot);
		else {
			a[jroot].setParent(iroot);
			int t=a[iroot].getRank()+1;
			a[iroot].setRank(t);
		}
	}
	
	public static void main(String[] args) {
		int N=10;
		Node[] a=new Node[N];
		
		for(int i=0;i<N;i++)
			a[i]=new Node(i,0);
		UnionFind uf=new UnionFind(a);
		
		uf.union(2, 1); uf.union(2, 6);
		uf.union(7, 3); uf.union(4, 5);
		uf.union(9, 5); uf.union(7, 2);
		uf.union(7, 8); uf.union(0, 4);
		
		System.out.println("8ȸ�� union ���� ���� ��(i:parent,rank):");
		for(int i=0;i<N;i++)
			System.out.println("("+i+":"+uf.a[i].getParent()+","+uf.a[i].getRank()+")");
		
		uf.union(9, 1);
		System.out.println("nunion(9,1) ���� �� (i:parent,rank):");
		for(int i=0;i<N;i++)
			System.out.println("("+i+":"+uf.a[i].getParent()+","+uf.a[i].getRank()+")");
	}
}
