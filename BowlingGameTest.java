public class BowlingGameTest {

	private BowlingGame bg;
	int pinsdown[];

	@Before
	public void setUp() {
		this.bg = new BowlingGame();
	}

	@Test
	public void testZero() {
	    this.pinsdown[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        bg.setFrame(pinsdown);
		assertEquals(0, bg.score());
	}
	
	@Test
	public void testAllOnes() {
	    this.pinsdown[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        bg.setFrame(pinsdown);
		assertEquals(20, bg.score());
	}

	@Test
	public void testSpare() {
		this.pinsdown[] = {1,1,5,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        bg.setFrame(pinsdown);
		
		assertEquals(29, bg.score());
	}
	
	@Test
	public void testStrike() {
		this.pinsdown[] = {1,1,1,10,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        bg.setFrame(pinsdown);
	
		assertEquals(29, bg.score());
	}
	
	@Test
	public void testPerfectGame() {
	    this.pinsdown[] = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        bg.setFrame(pinsdown);
		assertEquals(300, bg.score());
	}
	@Test
	public void testLastStrike() {
		this.pinsdown[] = {1,1,1,10,1,1,1,1,1,1,1,1,1,1,1,1,1,1,10,1,2};
        bg.setFrame(pinsdown);
	
		assertEquals(40, bg.score());
	}
	@Test
	public void testLastSpare() {
		this.pinsdown[] = {1,1,1,10,1,1,1,1,1,1,1,1,1,1,1,1,1,1,6,4,2};
        bg.setFrame(pinsdown);
	
		assertEquals(39, bg.score());
	}
}