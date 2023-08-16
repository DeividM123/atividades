package principal;

public class atividadeMatriz {

	public static void main(String[] args) {
int[][] numeros=new int[3][3];
int contador=10;

for(int i=0;i<numeros.length;i++) {
	for(int j=0; j<numeros.length;j++) {
		if(i==j) {
			System.out.print(contador);
		}else {
			System.out.print("\t");
		}
		contador++;
	}
	System.out.println();
}


	}

}
