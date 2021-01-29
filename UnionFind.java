package gonari;

import gonari.Node;

public class UnionFind {//부모를 찾고 합치는 것
	protected Node[] node; 
	public UnionFind(Node[] arrayname) { 
		node=arrayname;
	}
	//set중복되지않는값들. 해시셋. 
	protected int find(int num) { //노드 i에서 부터 루트까지 네이밍다시
		if(num!=node[num].getParent()) // 다를때가있음근데?
			node[num].setParent(find(node[num].getParent())); //경로상의 각 노드가 노드의 부모가 되도록
		return node[num].getParent(); //계속 루트노드로 변경됨
	} // 경로상의 모든 노드들에 대해 부모노드를 루트로 갱신하는 경로 압축 진행
	public void union(int i, int j) {
		int iroot=find(i);
		int jroot=find(j); //부모를찾기
		if(iroot==jroot) return;
		
		if (node[iroot].getRank()>node[jroot].getRank())
			node[jroot].setParent(iroot);
		else if (node[iroot].getRank()<node[jroot].getRank())
			node[iroot].setParent(jroot);
		else {
			node[jroot].setParent(iroot);
			int r=node[iroot].getRank()+1;
			node[iroot].setRank(r);
		}
	}
	
	public static void main(String[] args) {
		int N=10;
		Node[] nodearray=new Node[N]; 
		
		for(int i=0;i<N;i++) {//괄호 . i는 자기 자신의 값(부모를 찾기 위함)
			nodearray[i]=new Node(i,0); //노드의 값
		}
		UnionFind UnionFind=new UnionFind(nodearray); //객체 생성
		
		UnionFind.union(2, 1); UnionFind.union(2, 6);
		UnionFind.union(7, 3); UnionFind.union(4, 5);
		UnionFind.union(9, 5); UnionFind.union(7, 2);
		UnionFind.union(7, 8); UnionFind.union(0, 4);
	}
}