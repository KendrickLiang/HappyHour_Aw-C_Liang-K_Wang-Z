public class Square{
    public Cell[][] s;
    public Square(){
	s = new Cell[3][3];
    }
    public boolean isValid(){
	int[] a = new int[9];
	int i = 0;
	for (int r = 0; r < 3; r++){
	    for (int c = 0; c < 3; c++){
		a[i] = s[r][c];
		i++;
	    }
	}
	for (int x = 0; x < 8; x++){
	    for (int y = x; y < a.length; y++){
		if (a[x] == a[y])
		    return false;
	    }
	}
	return true;
    }
}
