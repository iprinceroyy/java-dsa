package set1;

public class MinimumNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minNotes(205));
	}
	
	static int minNotes(int amount) {
		
		int[] notes = {100, 50, 20, 10, 5, 2, 1};
		int[] countNotes = new int[notes.length];
		
		int min = 0;
		for (int i = 0; i < notes.length; i++) {
			if(amount >= notes[i]) {
				countNotes[i] = amount/notes[i];
				amount -= notes[i]*countNotes[i];
				min += countNotes[i];
			}
		}
		
		return min;
		
	}

}
