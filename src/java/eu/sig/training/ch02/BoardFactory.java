package eu.sig.training.ch02;

public class BoardFactory {
	
	private Square[][] grid;
	private Board board;
	private int width;
	private int height;
	private int dirX;
	private int dirY;
	
	
	
	public BoardFactory(Square[][] grid) {
        assert grid != null;

		this.grid = grid;
        this.board = new Board(grid);
        this.width = board.getWidth();
        this.height = board.getHeight();
        
	}
	
    // tag::createBoard[]
    public Board createBoard() {        

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Square square = grid[x][y];
                for (Direction dir : Direction.values()) {
                	this.dirX = getDir(dir.getDeltaX(), x);
                	this.dirY = getDir(dir.getDeltaY(), y);
                	setSquare(square, dir);
                }
            }
        }

        return board;
    }
    // end::createBoard[]
    
    private void setSquare(Square square, Direction dir) {
         Square neighbour = grid[dirX][dirY];
         square.link(neighbour, dir);
    }
    
    
    private int getDir(int delta, int n) {
    	return (width + n + delta) % width;
    }
    
}

class Board {
    @SuppressWarnings("unused")
    public Board(Square[][] grid) {}

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }
}

class Square {
    @SuppressWarnings("unused")
    public void link(Square neighbour, Direction dir) {}
}

class Direction {

    public static Direction[] values() {
        return null;
    }

    public int getDeltaY() {
        return 0;
    }

    public int getDeltaX() {
        return 0;
    }
}
