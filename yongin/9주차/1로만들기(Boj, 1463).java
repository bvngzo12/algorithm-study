import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		
		for (int i = 2; i < N+1; i++) {
			arr[i] = arr[i-1]+1;
			
			if(i%2==0) {
				arr[i] = Math.min(arr[i], arr[i/2]+1);
			}
			if(i%3==0) {
				arr[i] = Math.min(arr[i], arr[i/3]+1);
			}
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(arr[N]);
	}
}
