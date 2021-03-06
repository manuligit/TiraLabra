package com.mycompany.tiralabra_maven;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/** jUnit tests for Astar-class
 *  currently tests non-main methods
 */
public class AstarTest {

    Node node;

    public AstarTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        node = new Node(0,0);
    }

    @After
    public void tearDown() {
    }

    public void test() {

    }

    /** Tests that isWalkable-method returns true if node is walkable
     *
     */
    @org.junit.Test
    public void testNodeIsWalkable() {
        assertTrue(Astar.isWalkable(node, 1, 1));

    }

    /** Tests that isWalkable-method returns false if node is unwalkable
     *
     */
    @org.junit.Test
    public void testUnwalkableNode() {
        Node unwalkable = new Node(1,2);
        assertFalse(Astar.isWalkable(unwalkable, 1, 1));

    }

    /** Tests that Astar runs on small map */
    @org.junit.Test
    public void testAstarPathLength() {
        Astar astar = new Astar();
        String map = "o_____x";
        astar.run(map, 0);

        assertTrue(astar.getPathLength() == 5);
        //assertTrue(astar.getRunTime() < 15);
    }

}
