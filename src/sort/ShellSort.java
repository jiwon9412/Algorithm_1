package sort;

public class ShellSort {
	
	// �������� ���� gap sequence �߿��� Ciura Sequence ���
	private final static int[] gap = 
		{ 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 	
		8858, 19930, 44842, 100894, 227011, 510774,
		1149241, 2585792, 5818032, 13090572, 29453787, 
		66271020, 149109795, 335497038, 754868335, 1698453753};
	
	public static int getGap(int length) {
		
		int index = 0;
		int len = (int)(length/2.25);
		while(gap[index]<=len) index++;
		
		return index;
	}
	
	public static void shellSort(int[] arr) {
		
		int index = getGap(arr.length);	// ù gap�� ����� index
		 
		// gap[index] ������ gap[0] ���� �ݺ��Ѵ�.
		for (int i = index; i >= 0; i--) {
 
			for (int j = 0; j < gap[i]; j++) {	// �� �κ� ����Ʈ�� ���� ���������� �Ѵ�.
				insertionSort(arr, i, gap[i]);
			}
		}
	}
	
	private static void insertionSort(int[] arr, int start, int gap) {
		 
		// �κ� �迭�� �� ��° ���Һ��� size���� �ݺ��Ѵ�. (gap ���� �ǳʶ�) 
		for (int i = start + gap; i < arr.length; i += gap) {
 
			int target = arr[i];
			int j = i - gap;
 
			// Ÿ�� ���Ұ� ������ ���Һ��� ���� �� ���� �ݺ� 
			while (j >= start && target < arr[j]) {
				arr[j + gap] = arr[j];	// ���� ���Ҹ� �� ĭ�� �ڷ� �̷��.
				j -= gap;
			}
			/*
			 * �� �ݺ������� Ż�� �ϴ� ��� ���� ���Ұ� Ÿ�ٺ��� �۴ٴ� �ǹ��̹Ƿ�
			 * Ÿ�� ���Ҵ� j��° ���� �ڿ� �;��Ѵ�.
			 * �׷��Ƿ� Ÿ���� j + gap �� ��ġ�ϰ� �ȴ�.
			 */
			arr[j + gap] = target;
 
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 6, 5, 17, 93, 2, 11};
		shellSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
